// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Reflection;
using System.Text;

namespace Microsoft.Rest.Generator.Utilities
{
    /// <summary>
    /// Provides useful extension methods to simplify common coding tasks.
    /// </summary>
    public static class Extensions
    {
        /// <summary>
        /// Maps an action with side effects over a sequence.
        /// </summary>
        /// <param name='sequence'>The sequence to map over.</param>
        /// <param name='action'>The action to map.</param>
        /// <typeparam name='T'>Type of elements in the sequence.</typeparam>
        public static void ForEach<T>(this IEnumerable<T> sequence, Action<T> action)
        {
            if (sequence == null)
            {
                throw new ArgumentNullException("sequence");
            }

            if (action == null)
            {
                throw new ArgumentNullException("action");
            }

            foreach (T element in sequence)
            {
                action(element);
            }
        }

        /// <summary>
        /// Returns a collection of the descendant elements for this collection.
        /// </summary>
        /// <typeparam name='T'>Type of elements in the sequence.</typeparam>
        /// <param name="items">Child collection</param>
        /// <param name="childSelector">Child selector</param>
        /// <returns>List of all items and descendants of each item</returns>
        [SuppressMessage("Microsoft.Design", "CA1006:DoNotNestGenericTypesInMemberSignatures", Justification = "By design.")]
        public static IEnumerable<T> Descendants<T>(this IEnumerable<T> items, Func<T, IEnumerable<T>> childSelector)
        {
            foreach (var item in items)
            {
                foreach (var childResult in childSelector(item).Descendants(childSelector))
                    yield return childResult;
                yield return item;
            }
        }

        /// <summary>
        /// Determines whether a sequence is empty.
        /// </summary>
        /// <typeparam name='T'>Type of elements in the sequence.</typeparam>
        /// <param name='sequence'>The sequence.</param>
        /// <returns>True if the sequence is empty, false otherwise.</returns>
        public static bool IsNullOrEmpty<T>(this IEnumerable<T> sequence)
        {
            if (sequence == null ||
                !sequence.Any())
            {
                return true;
            }

            return false;
        }

        /// <summary>
        /// Word wrap a string of text to a given width.
        /// </summary>
        /// <param name='text'>The text to word wrap.</param>
        /// <param name='width'>Width available to wrap.</param>
        /// <returns>Lines of word wrapped text.</returns>
        public static IEnumerable<string> WordWrap(this string text, int width)
        {
            Debug.Assert(text != null, "text should not be null.");

            int start = 0; // Start of the current line
            int end = 0; // End of the current line
            char last = ' '; // Last character processed

            // Walk the entire string, processing line by line
            for (int i = 0; i < text.Length; i++)
            {
                // Support newlines inside the comment text.
                if (text[i] == '\n')
                {
                    yield return text.Substring(start, i - start + 1).Trim();

                    start = i + 1;
                    end = start;
                    last = ' ';

                    continue;
                }

                // If our current line is longer than the desired wrap width,
                // we'll stop the line here
                if (i - start >= width && start != end)
                {
                    // Yield the current line
                    yield return text.Substring(start, end - start + 1).Trim();

                    // Set things up for the next line
                    start = end + 1;
                    end = start;
                    last = ' ';
                }

                // If the last character was a space, mark that spot as a
                // candidate for a potential line break
                if (!char.IsWhiteSpace(last) && char.IsWhiteSpace(text[i]))
                {
                    end = i - 1;
                }

                last = text[i];
            }

            // Don't forget to include the last line of text
            if (start < text.Length)
            {
                yield return text.Substring(start, text.Length - start).Trim();
            }
        }

        /// <summary>
        /// Performs shallow copy of properties from source into destination.
        /// </summary>
        /// <typeparam name="TU">Destination type</typeparam>
        /// <typeparam name="TV">Source type</typeparam>
        /// <param name="destination">Destination object.</param>
        /// <param name="source">Source object.</param>
        [SuppressMessage("Microsoft.Naming", "CA1704:IdentifiersShouldBeSpelledCorrectly", MessageId = "U", Justification = "Common naming for generics.")]
        [SuppressMessage("Microsoft.Naming", "CA1704:IdentifiersShouldBeSpelledCorrectly", MessageId = "V", Justification = "Common naming for generics.")]
        public static void LoadFrom<TU, TV>(this TU destination, TV source)
            where TU : TV
            where TV : class
        {
            if (destination == null)
            {
                throw new ArgumentNullException("destination");
            }

            if (source == null)
            {
                throw new ArgumentNullException("source");
            }

            PropertyInfo[] properties = typeof(TV).GetProperties();
            foreach (var property in properties.Where(p => p.SetMethod != null))
            {
                property.SetValue(destination, property.GetValue(source, null), null);
            }
        }

        /// <summary>
        /// Converts the specified string to a camel cased string.
        /// </summary>
        /// <param name="value">The string to convert.</param>
        /// <returns>The camel case string.</returns>
        public static string ToCamelCase(this string value)
        {
            return CodeNamer.CamelCase(value);
        }

        /// <summary>
        /// Converts the specified string to a pascal cased string.
        /// </summary>
        /// <param name="value">The string to convert.</param>
        /// <returns>The pascal case string.</returns>
        public static string ToPascalCase(this string value)
        {
            return CodeNamer.PascalCase(value);
        }

        /// <summary>
        /// Escape reserved characters in xml comments with their escaped representations
        /// </summary>
        /// <param name="comment">The xml comment to escape</param>
        /// <returns>The text appropriately escaped for inclusing in an xml comment</returns>
        public static string EscapeXmlComment(this string comment)
        {
            if (comment == null)
            {
                return null;
            }

            return new StringBuilder(comment)
                .Replace("&", "&amp;")
                .Replace("<", "&lt;")
                .Replace(">", "&gt;").ToString();
        }
    }
}