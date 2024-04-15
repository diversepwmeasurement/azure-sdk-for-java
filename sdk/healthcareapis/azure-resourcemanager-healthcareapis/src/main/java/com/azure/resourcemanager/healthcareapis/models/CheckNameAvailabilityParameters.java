// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
@Fluent
public final class CheckNameAvailabilityParameters {
    /*
     * The name of the service instance to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The fully qualified resource type which includes provider namespace.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of CheckNameAvailabilityParameters class.
     */
    public CheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The name of the service instance to check.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the service instance to check.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The fully qualified resource type which includes provider namespace.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The fully qualified resource type which includes provider namespace.
     * 
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model CheckNameAvailabilityParameters"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property type in model CheckNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailabilityParameters.class);
}
