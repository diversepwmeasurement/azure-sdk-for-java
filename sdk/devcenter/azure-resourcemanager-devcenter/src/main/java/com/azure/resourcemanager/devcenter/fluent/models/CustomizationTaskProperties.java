// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.devcenter.models.CatalogResourceValidationStatus;
import com.azure.resourcemanager.devcenter.models.CustomizationTaskInput;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties of a Task. */
@Immutable
public final class CustomizationTaskProperties {
    /*
     * Inputs to the task.
     */
    @JsonProperty(value = "inputs", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, CustomizationTaskInput> inputs;

    /*
     * The default timeout for the task.
     */
    @JsonProperty(value = "timeout", access = JsonProperty.Access.WRITE_ONLY)
    private Integer timeout;

    /*
     * Validation status for the Task.
     */
    @JsonProperty(value = "validationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CatalogResourceValidationStatus validationStatus;

    /** Creates an instance of CustomizationTaskProperties class. */
    public CustomizationTaskProperties() {
    }

    /**
     * Get the inputs property: Inputs to the task.
     *
     * @return the inputs value.
     */
    public Map<String, CustomizationTaskInput> inputs() {
        return this.inputs;
    }

    /**
     * Get the timeout property: The default timeout for the task.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Get the validationStatus property: Validation status for the Task.
     *
     * @return the validationStatus value.
     */
    public CatalogResourceValidationStatus validationStatus() {
        return this.validationStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inputs() != null) {
            inputs()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
