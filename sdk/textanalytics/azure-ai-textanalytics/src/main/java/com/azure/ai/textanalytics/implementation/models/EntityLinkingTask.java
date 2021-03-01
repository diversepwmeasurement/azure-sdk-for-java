// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EntityLinkingTask model. */
@Fluent
public final class EntityLinkingTask {
    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private EntityLinkingTaskParameters parameters;

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public EntityLinkingTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the EntityLinkingTask object itself.
     */
    public EntityLinkingTask setParameters(EntityLinkingTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
