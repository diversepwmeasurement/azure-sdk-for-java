// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Describes how identity is verified.
 */
@Fluent
public final class Identity {
    /*
     * The tenantId of the identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The principalId of the identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The type of identity, can be SystemAssigned or UserAssigned.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The user assigned identities associated with the streaming job resource.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> userAssignedIdentities;

    /**
     * Creates an instance of Identity class.
     */
    public Identity() {
    }

    /**
     * Get the tenantId property: The tenantId of the identity.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId property: The principalId of the identity.
     * 
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the type property: The type of identity, can be SystemAssigned or UserAssigned.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity, can be SystemAssigned or UserAssigned.
     * 
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The user assigned identities associated with the streaming job
     * resource.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, Object> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The user assigned identities associated with the streaming job
     * resource.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the Identity object itself.
     */
    public Identity withUserAssignedIdentities(Map<String, Object> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
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
