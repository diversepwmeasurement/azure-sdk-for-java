// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.fluent.models.SubscriptionUnderManagementGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The details of all subscriptions under management group. */
@Fluent
public final class ListSubscriptionUnderManagementGroup {
    /*
     * The list of subscriptions.
     */
    @JsonProperty(value = "value")
    private List<SubscriptionUnderManagementGroupInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ListSubscriptionUnderManagementGroup class. */
    public ListSubscriptionUnderManagementGroup() {
    }

    /**
     * Get the value property: The list of subscriptions.
     *
     * @return the value value.
     */
    public List<SubscriptionUnderManagementGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of subscriptions.
     *
     * @param value the value value to set.
     * @return the ListSubscriptionUnderManagementGroup object itself.
     */
    public ListSubscriptionUnderManagementGroup withValue(List<SubscriptionUnderManagementGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
