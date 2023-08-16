// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/** Samples for DedicatedHostGroups GetByResourceGroup. */
public final class DedicatedHostGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-07-01/examples/dedicatedHostExamples/DedicatedHostGroup_Get_UltraSSDEnabledDedicatedHostGroup.json
     */
    /**
     * Sample code: Create an ultraSSDEnabled dedicated host group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAnUltraSSDEnabledDedicatedHostGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myDedicatedHostGroup", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-07-01/examples/dedicatedHostExamples/DedicatedHostGroup_Get.json
     */
    /**
     * Sample code: Create a dedicated host group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createADedicatedHostGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDedicatedHostGroups()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myDedicatedHostGroup", null, com.azure.core.util.Context.NONE);
    }
}
