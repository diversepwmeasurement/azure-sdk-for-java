// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterIdentity;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectivityStatus;
import com.azure.resourcemanager.hybridkubernetes.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Represents a connected cluster. */
@Fluent
public final class ConnectedClusterInner extends Resource {
    /*
     * The identity of the connected cluster.
     */
    @JsonProperty(value = "identity", required = true)
    private ConnectedClusterIdentity identity;

    /*
     * Describes the connected cluster resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private ConnectedClusterProperties innerProperties = new ConnectedClusterProperties();

    /*
     * Metadata pertaining to creation and last modification of the resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ConnectedClusterInner class. */
    public ConnectedClusterInner() {
    }

    /**
     * Get the identity property: The identity of the connected cluster.
     *
     * @return the identity value.
     */
    public ConnectedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the connected cluster.
     *
     * @param identity the identity value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withIdentity(ConnectedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Describes the connected cluster resource properties.
     *
     * @return the innerProperties value.
     */
    private ConnectedClusterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectedClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectedClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     *
     * @return the agentPublicKeyCertificate value.
     */
    public String agentPublicKeyCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().agentPublicKeyCertificate();
    }

    /**
     * Set the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     *
     * @param agentPublicKeyCertificate the agentPublicKeyCertificate value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectedClusterProperties();
        }
        this.innerProperties().withAgentPublicKeyCertificate(agentPublicKeyCertificate);
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version of the connected cluster resource.
     *
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().kubernetesVersion();
    }

    /**
     * Get the totalNodeCount property: Number of nodes present in the connected cluster resource.
     *
     * @return the totalNodeCount value.
     */
    public Integer totalNodeCount() {
        return this.innerProperties() == null ? null : this.innerProperties().totalNodeCount();
    }

    /**
     * Get the totalCoreCount property: Number of CPU cores present in the connected cluster resource.
     *
     * @return the totalCoreCount value.
     */
    public Integer totalCoreCount() {
        return this.innerProperties() == null ? null : this.innerProperties().totalCoreCount();
    }

    /**
     * Get the agentVersion property: Version of the agent running on the connected cluster resource.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().agentVersion();
    }

    /**
     * Get the provisioningState property: Provisioning state of the connected cluster resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the connected cluster resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withProvisioningState(ProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectedClusterProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the distribution property: The Kubernetes distribution running on this connected cluster.
     *
     * @return the distribution value.
     */
    public String distribution() {
        return this.innerProperties() == null ? null : this.innerProperties().distribution();
    }

    /**
     * Set the distribution property: The Kubernetes distribution running on this connected cluster.
     *
     * @param distribution the distribution value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withDistribution(String distribution) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectedClusterProperties();
        }
        this.innerProperties().withDistribution(distribution);
        return this;
    }

    /**
     * Get the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     *
     * @return the infrastructure value.
     */
    public String infrastructure() {
        return this.innerProperties() == null ? null : this.innerProperties().infrastructure();
    }

    /**
     * Set the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     *
     * @param infrastructure the infrastructure value to set.
     * @return the ConnectedClusterInner object itself.
     */
    public ConnectedClusterInner withInfrastructure(String infrastructure) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectedClusterProperties();
        }
        this.innerProperties().withInfrastructure(infrastructure);
        return this;
    }

    /**
     * Get the offering property: Connected cluster offering.
     *
     * @return the offering value.
     */
    public String offering() {
        return this.innerProperties() == null ? null : this.innerProperties().offering();
    }

    /**
     * Get the managedIdentityCertificateExpirationTime property: Expiration time of the managed identity certificate.
     *
     * @return the managedIdentityCertificateExpirationTime value.
     */
    public OffsetDateTime managedIdentityCertificateExpirationTime() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().managedIdentityCertificateExpirationTime();
    }

    /**
     * Get the lastConnectivityTime property: Time representing the last instance when heart beat was received from the
     * cluster.
     *
     * @return the lastConnectivityTime value.
     */
    public OffsetDateTime lastConnectivityTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastConnectivityTime();
    }

    /**
     * Get the connectivityStatus property: Represents the connectivity status of the connected cluster.
     *
     * @return the connectivityStatus value.
     */
    public ConnectivityStatus connectivityStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectivityStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property identity in model ConnectedClusterInner"));
        } else {
            identity().validate();
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ConnectedClusterInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectedClusterInner.class);
}
