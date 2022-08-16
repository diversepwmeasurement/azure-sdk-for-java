// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of the secret to be validated. */
@Fluent
public final class ValidateSecretInput {
    /*
     * The secret type.
     */
    @JsonProperty(value = "secretType", required = true)
    private SecretType secretType;

    /*
     * Resource reference to the Azure Key Vault secret. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
     */
    @JsonProperty(value = "secretSource", required = true)
    private ResourceReference secretSource;

    /*
     * Secret version, if customer is using a specific version.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /**
     * Get the secretType property: The secret type.
     *
     * @return the secretType value.
     */
    public SecretType secretType() {
        return this.secretType;
    }

    /**
     * Set the secretType property: The secret type.
     *
     * @param secretType the secretType value to set.
     * @return the ValidateSecretInput object itself.
     */
    public ValidateSecretInput withSecretType(SecretType secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * Get the secretSource property: Resource reference to the Azure Key Vault secret. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @return the secretSource value.
     */
    public ResourceReference secretSource() {
        return this.secretSource;
    }

    /**
     * Set the secretSource property: Resource reference to the Azure Key Vault secret. Expected to be in format of
     * /subscriptions/{​​​​​​​​​subscriptionId}​​​​​​​​​/resourceGroups/{​​​​​​​​​resourceGroupName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/providers/Microsoft.KeyVault/vaults/{vaultName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​/secrets/{secretName}​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​.
     *
     * @param secretSource the secretSource value to set.
     * @return the ValidateSecretInput object itself.
     */
    public ValidateSecretInput withSecretSource(ResourceReference secretSource) {
        this.secretSource = secretSource;
        return this;
    }

    /**
     * Get the secretVersion property: Secret version, if customer is using a specific version.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: Secret version, if customer is using a specific version.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the ValidateSecretInput object itself.
     */
    public ValidateSecretInput withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (secretType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property secretType in model ValidateSecretInput"));
        }
        if (secretSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secretSource in model ValidateSecretInput"));
        } else {
            secretSource().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidateSecretInput.class);
}
