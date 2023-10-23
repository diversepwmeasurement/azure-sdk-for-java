// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates a pool uses a Virtual Network managed by Microsoft (Managed), or a customer provided Network (Unmanaged).
 */
public final class VirtualNetworkType extends ExpandableStringEnum<VirtualNetworkType> {
    /** Static value Managed for VirtualNetworkType. */
    public static final VirtualNetworkType MANAGED = fromString("Managed");

    /** Static value Unmanaged for VirtualNetworkType. */
    public static final VirtualNetworkType UNMANAGED = fromString("Unmanaged");

    /**
     * Creates a new instance of VirtualNetworkType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualNetworkType() {
    }

    /**
     * Creates or finds a VirtualNetworkType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkType.
     */
    @JsonCreator
    public static VirtualNetworkType fromString(String name) {
        return fromString(name, VirtualNetworkType.class);
    }

    /**
     * Gets known VirtualNetworkType values.
     *
     * @return known VirtualNetworkType values.
     */
    public static Collection<VirtualNetworkType> values() {
        return values(VirtualNetworkType.class);
    }
}
