// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SwaggerSpecification model. */
@Fluent
public final class SwaggerSpecification {
    /*
     * The apiVersions property.
     */
    @JsonProperty(value = "apiVersions")
    private List<String> apiVersions;

    /*
     * The swaggerSpecFolderUri property.
     */
    @JsonProperty(value = "swaggerSpecFolderUri")
    private String swaggerSpecFolderUri;

    /** Creates an instance of SwaggerSpecification class. */
    public SwaggerSpecification() {
    }

    /**
     * Get the apiVersions property: The apiVersions property.
     *
     * @return the apiVersions value.
     */
    public List<String> apiVersions() {
        return this.apiVersions;
    }

    /**
     * Set the apiVersions property: The apiVersions property.
     *
     * @param apiVersions the apiVersions value to set.
     * @return the SwaggerSpecification object itself.
     */
    public SwaggerSpecification withApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    /**
     * Get the swaggerSpecFolderUri property: The swaggerSpecFolderUri property.
     *
     * @return the swaggerSpecFolderUri value.
     */
    public String swaggerSpecFolderUri() {
        return this.swaggerSpecFolderUri;
    }

    /**
     * Set the swaggerSpecFolderUri property: The swaggerSpecFolderUri property.
     *
     * @param swaggerSpecFolderUri the swaggerSpecFolderUri value to set.
     * @return the SwaggerSpecification object itself.
     */
    public SwaggerSpecification withSwaggerSpecFolderUri(String swaggerSpecFolderUri) {
        this.swaggerSpecFolderUri = swaggerSpecFolderUri;
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
