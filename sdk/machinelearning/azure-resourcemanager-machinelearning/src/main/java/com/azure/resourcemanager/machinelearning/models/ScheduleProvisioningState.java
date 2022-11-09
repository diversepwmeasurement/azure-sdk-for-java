// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current deployment state of schedule. */
public final class ScheduleProvisioningState extends ExpandableStringEnum<ScheduleProvisioningState> {
    /** Static value Completed for ScheduleProvisioningState. */
    public static final ScheduleProvisioningState COMPLETED = fromString("Completed");

    /** Static value Provisioning for ScheduleProvisioningState. */
    public static final ScheduleProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Failed for ScheduleProvisioningState. */
    public static final ScheduleProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a ScheduleProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduleProvisioningState.
     */
    @JsonCreator
    public static ScheduleProvisioningState fromString(String name) {
        return fromString(name, ScheduleProvisioningState.class);
    }

    /**
     * Gets known ScheduleProvisioningState values.
     *
     * @return known ScheduleProvisioningState values.
     */
    public static Collection<ScheduleProvisioningState> values() {
        return values(ScheduleProvisioningState.class);
    }
}