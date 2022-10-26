// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Revision resource specific properties. */
@Fluent
public final class BillingMeterProperties {
    /*
     * Used to map workload profile types to billing meter.
     */
    @JsonProperty(value = "category")
    private Category category;

    /*
     * Billing meter type.
     */
    @JsonProperty(value = "meterType")
    private String meterType;

    /*
     * The everyday name of the billing meter.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /** Creates an instance of BillingMeterProperties class. */
    public BillingMeterProperties() {
    }

    /**
     * Get the category property: Used to map workload profile types to billing meter.
     *
     * @return the category value.
     */
    public Category category() {
        return this.category;
    }

    /**
     * Set the category property: Used to map workload profile types to billing meter.
     *
     * @param category the category value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withCategory(Category category) {
        this.category = category;
        return this;
    }

    /**
     * Get the meterType property: Billing meter type.
     *
     * @return the meterType value.
     */
    public String meterType() {
        return this.meterType;
    }

    /**
     * Set the meterType property: Billing meter type.
     *
     * @param meterType the meterType value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withMeterType(String meterType) {
        this.meterType = meterType;
        return this;
    }

    /**
     * Get the displayName property: The everyday name of the billing meter.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The everyday name of the billing meter.
     *
     * @param displayName the displayName value to set.
     * @return the BillingMeterProperties object itself.
     */
    public BillingMeterProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}