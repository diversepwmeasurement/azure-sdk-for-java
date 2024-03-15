// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityInner;

/**
 * Resource collection API of Capabilities.
 */
public interface Capabilities {
    /**
     * Get a list of Capability resources that extend a Target resource..
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability resources that extend a Target resource. as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Capability> list(String resourceGroupName, String parentProviderNamespace, String parentResourceType,
        String parentResourceName, String targetName);

    /**
     * Get a list of Capability resources that extend a Target resource..
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param continuationToken String that sets the continuation token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Capability resources that extend a Target resource. as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<Capability> list(String resourceGroupName, String parentProviderNamespace, String parentResourceType,
        String parentResourceName, String targetName, String continuationToken, Context context);

    /**
     * Get a Capability resource that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability resource that extends a Target resource along with {@link Response}.
     */
    Response<Capability> getWithResponse(String resourceGroupName, String parentProviderNamespace,
        String parentResourceType, String parentResourceName, String targetName, String capabilityName,
        Context context);

    /**
     * Get a Capability resource that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Capability resource that extends a Target resource.
     */
    Capability get(String resourceGroupName, String parentProviderNamespace, String parentResourceType,
        String parentResourceName, String targetName, String capabilityName);

    /**
     * Delete a Capability that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String parentProviderNamespace,
        String parentResourceType, String parentResourceName, String targetName, String capabilityName,
        Context context);

    /**
     * Delete a Capability that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String parentProviderNamespace, String parentResourceType,
        String parentResourceName, String targetName, String capabilityName);

    /**
     * Create or update a Capability resource that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @param capability Capability resource to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Capability resource along with {@link Response}.
     */
    Response<Capability> createOrUpdateWithResponse(String resourceGroupName, String parentProviderNamespace,
        String parentResourceType, String parentResourceName, String targetName, String capabilityName,
        CapabilityInner capability, Context context);

    /**
     * Create or update a Capability resource that extends a Target resource.
     * 
     * @param resourceGroupName String that represents an Azure resource group.
     * @param parentProviderNamespace String that represents a resource provider namespace.
     * @param parentResourceType String that represents a resource type.
     * @param parentResourceName String that represents a resource name.
     * @param targetName String that represents a Target resource name.
     * @param capabilityName String that represents a Capability resource name.
     * @param capability Capability resource to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return model that represents a Capability resource.
     */
    Capability createOrUpdate(String resourceGroupName, String parentProviderNamespace, String parentResourceType,
        String parentResourceName, String targetName, String capabilityName, CapabilityInner capability);
}
