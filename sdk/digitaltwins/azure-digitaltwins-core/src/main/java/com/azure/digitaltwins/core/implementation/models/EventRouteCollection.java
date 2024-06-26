// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of EventRoute objects. */
@Fluent
public final class EventRouteCollection {
    /*
     * The EventRoute objects.
     */
    @JsonProperty(value = "value", required = true)
    private List<EventRoute> value;

    /*
     * A URI to retrieve the next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of EventRouteCollection class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    public EventRouteCollection(@JsonProperty(value = "value", required = true) List<EventRoute> value) {
        this.value = value;
    }

    /**
     * Get the value property: The EventRoute objects.
     *
     * @return the value value.
     */
    public List<EventRoute> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: A URI to retrieve the next page of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A URI to retrieve the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the EventRouteCollection object itself.
     */
    public EventRouteCollection setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValue() == null) {
            throw new IllegalArgumentException("Missing required property value in model EventRouteCollection");
        } else {
            getValue().forEach(e -> e.validate());
        }
    }
}
