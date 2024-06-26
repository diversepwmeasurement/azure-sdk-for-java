// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionUpgrade;
import com.azure.resourcemanager.hybridcompute.models.ResourceProviders;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public ResourceProvidersImpl(ResourceProvidersClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void upgradeExtensions(String resourceGroupName, String machineName,
        MachineExtensionUpgrade extensionUpgradeParameters) {
        this.serviceClient().upgradeExtensions(resourceGroupName, machineName, extensionUpgradeParameters);
    }

    public void upgradeExtensions(String resourceGroupName, String machineName,
        MachineExtensionUpgrade extensionUpgradeParameters, Context context) {
        this.serviceClient().upgradeExtensions(resourceGroupName, machineName, extensionUpgradeParameters, context);
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
