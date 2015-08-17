// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsValidation.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// The product documentation.
    /// </summary>
    public partial class Product
    {
        /// <summary>
        /// Non required array of unique items from 0 to 6 elements.
        /// </summary>
        [JsonProperty(PropertyName = "display_names")]
        public IList<string> DisplayNames { get; set; }

        /// <summary>
        /// Non required int betwen 0 and 100 exclusive.
        /// </summary>
        [JsonProperty(PropertyName = "capacity")]
        public int? Capacity { get; set; }

        /// <summary>
        /// Image URL representing the product.
        /// </summary>
        [JsonProperty(PropertyName = "image")]
        public string Image { get; set; }

        /// <summary>
        /// Validate the object. Throws ArgumentException or ArgumentNullException if validation fails.
        /// </summary>
        public virtual void Validate()
        {
            if (this.DisplayNames != null)
            {
                if (this.DisplayNames.Count > 6)
                {
                    throw new ValidationException(ValidationRules.MaxItems, "DisplayNames", 6);
                }
                if (this.DisplayNames.Count < 0)
                {
                    throw new ValidationException(ValidationRules.MinItems, "DisplayNames", 0);
                }
                if (this.DisplayNames.Count != this.DisplayNames.Distinct().Count())
                {
                    throw new ValidationException(ValidationRules.UniqueItems, "DisplayNames");
                }
            }
            if (this.Capacity != null)
            {
                if (this.Capacity >= 100)
                {
                    throw new ValidationException(ValidationRules.ExclusiveMaximum, "Capacity", 100);
                }
                if (this.Capacity <= 0)
                {
                    throw new ValidationException(ValidationRules.ExclusiveMinimum, "Capacity", 0);
                }
            }
            if (this.Image != null)
            {
                if (!System.Text.RegularExpressions.Regex.IsMatch(this.Image, "http://\\w+"))
                {
                    throw new ValidationException(ValidationRules.Pattern, "Image", "http://\\w+");
                }
            }
        }
    }
}
