// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies which key should be generated. */
@Fluent
public final class RegenerateKeyRequest {
    /*
     * The key to regenerate.
     */
    @JsonProperty(value = "keyName", required = true)
    private KeyName keyName;

    /**
     * Get the keyName property: The key to regenerate.
     *
     * @return the keyName value.
     */
    public KeyName keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The key to regenerate.
     *
     * @param keyName the keyName value to set.
     * @return the RegenerateKeyRequest object itself.
     */
    public RegenerateKeyRequest withKeyName(KeyName keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyName in model RegenerateKeyRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegenerateKeyRequest.class);
}
