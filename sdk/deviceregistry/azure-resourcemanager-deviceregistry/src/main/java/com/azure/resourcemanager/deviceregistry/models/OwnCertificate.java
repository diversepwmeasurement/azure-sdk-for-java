// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Certificate or private key that can be used by the southbound connector connecting to the shop floor/OT device. The
 * accepted extensions are .der for certificates and .pfx/.pem for private keys.
 */
@Fluent
public final class OwnCertificate {
    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "certThumbprint")
    private String certThumbprint;

    /*
     * Secret Reference name (cert and private key).
     */
    @JsonProperty(value = "certSecretReference")
    private String certSecretReference;

    /*
     * Secret Reference Name (Pfx or Pem password).
     */
    @JsonProperty(value = "certPasswordReference")
    private String certPasswordReference;

    /**
     * Creates an instance of OwnCertificate class.
     */
    public OwnCertificate() {
    }

    /**
     * Get the certThumbprint property: Certificate thumbprint.
     * 
     * @return the certThumbprint value.
     */
    public String certThumbprint() {
        return this.certThumbprint;
    }

    /**
     * Set the certThumbprint property: Certificate thumbprint.
     * 
     * @param certThumbprint the certThumbprint value to set.
     * @return the OwnCertificate object itself.
     */
    public OwnCertificate withCertThumbprint(String certThumbprint) {
        this.certThumbprint = certThumbprint;
        return this;
    }

    /**
     * Get the certSecretReference property: Secret Reference name (cert and private key).
     * 
     * @return the certSecretReference value.
     */
    public String certSecretReference() {
        return this.certSecretReference;
    }

    /**
     * Set the certSecretReference property: Secret Reference name (cert and private key).
     * 
     * @param certSecretReference the certSecretReference value to set.
     * @return the OwnCertificate object itself.
     */
    public OwnCertificate withCertSecretReference(String certSecretReference) {
        this.certSecretReference = certSecretReference;
        return this;
    }

    /**
     * Get the certPasswordReference property: Secret Reference Name (Pfx or Pem password).
     * 
     * @return the certPasswordReference value.
     */
    public String certPasswordReference() {
        return this.certPasswordReference;
    }

    /**
     * Set the certPasswordReference property: Secret Reference Name (Pfx or Pem password).
     * 
     * @param certPasswordReference the certPasswordReference value to set.
     * @return the OwnCertificate object itself.
     */
    public OwnCertificate withCertPasswordReference(String certPasswordReference) {
        this.certPasswordReference = certPasswordReference;
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
