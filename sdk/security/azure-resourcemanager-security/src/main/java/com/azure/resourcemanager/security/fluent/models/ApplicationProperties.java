// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.ApplicationSourceResourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes properties of an application. */
@Fluent
public final class ApplicationProperties {
    /*
     * display name of the application
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * description of the application
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The application source, what it affects, e.g. Assessments
     */
    @JsonProperty(value = "sourceResourceType", required = true)
    private ApplicationSourceResourceType sourceResourceType;

    /*
     * The application conditionSets - see examples
     */
    @JsonProperty(value = "conditionSets", required = true)
    private List<Object> conditionSets;

    /**
     * Get the displayName property: display name of the application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: display name of the application.
     *
     * @param displayName the displayName value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: description of the application.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: description of the application.
     *
     * @param description the description value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceResourceType property: The application source, what it affects, e.g. Assessments.
     *
     * @return the sourceResourceType value.
     */
    public ApplicationSourceResourceType sourceResourceType() {
        return this.sourceResourceType;
    }

    /**
     * Set the sourceResourceType property: The application source, what it affects, e.g. Assessments.
     *
     * @param sourceResourceType the sourceResourceType value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withSourceResourceType(ApplicationSourceResourceType sourceResourceType) {
        this.sourceResourceType = sourceResourceType;
        return this;
    }

    /**
     * Get the conditionSets property: The application conditionSets - see examples.
     *
     * @return the conditionSets value.
     */
    public List<Object> conditionSets() {
        return this.conditionSets;
    }

    /**
     * Set the conditionSets property: The application conditionSets - see examples.
     *
     * @param conditionSets the conditionSets value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withConditionSets(List<Object> conditionSets) {
        this.conditionSets = conditionSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceResourceType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceResourceType in model ApplicationProperties"));
        }
        if (conditionSets() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property conditionSets in model ApplicationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationProperties.class);
}