// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridnetwork.models.ArtifactStorePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Artifact store properties.
 */
@Fluent
public final class ArtifactStoreInner extends Resource {
    /*
     * ArtifactStores properties.
     */
    @JsonProperty(value = "properties")
    private ArtifactStorePropertiesFormat properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ArtifactStoreInner class.
     */
    public ArtifactStoreInner() {
    }

    /**
     * Get the properties property: ArtifactStores properties.
     * 
     * @return the properties value.
     */
    public ArtifactStorePropertiesFormat properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ArtifactStores properties.
     * 
     * @param properties the properties value to set.
     * @return the ArtifactStoreInner object itself.
     */
    public ArtifactStoreInner withProperties(ArtifactStorePropertiesFormat properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtifactStoreInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArtifactStoreInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
