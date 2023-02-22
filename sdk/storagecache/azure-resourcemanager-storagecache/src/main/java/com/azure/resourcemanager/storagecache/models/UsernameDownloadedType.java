// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates whether or not the HPC Cache has performed the username download successfully. */
public final class UsernameDownloadedType extends ExpandableStringEnum<UsernameDownloadedType> {
    /** Static value Yes for UsernameDownloadedType. */
    public static final UsernameDownloadedType YES = fromString("Yes");

    /** Static value No for UsernameDownloadedType. */
    public static final UsernameDownloadedType NO = fromString("No");

    /** Static value Error for UsernameDownloadedType. */
    public static final UsernameDownloadedType ERROR = fromString("Error");

    /**
     * Creates a new instance of UsernameDownloadedType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UsernameDownloadedType() {
    }

    /**
     * Creates or finds a UsernameDownloadedType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsernameDownloadedType.
     */
    @JsonCreator
    public static UsernameDownloadedType fromString(String name) {
        return fromString(name, UsernameDownloadedType.class);
    }

    /**
     * Gets known UsernameDownloadedType values.
     *
     * @return known UsernameDownloadedType values.
     */
    public static Collection<UsernameDownloadedType> values() {
        return values(UsernameDownloadedType.class);
    }
}
