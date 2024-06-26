// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Workspaces.
 */
public interface Workspaces {
    /**
     * Lists all the available workspaces under the specified subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workspace> list();

    /**
     * Lists all the available workspaces under the specified subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workspace> list(Context context);

    /**
     * Lists all the available workspaces under the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the available workspaces under the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of workspace object with a next link as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Workspace> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified workspace.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace along with {@link Response}.
     */
    Response<Workspace> getByResourceGroupWithResponse(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified workspace.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace.
     */
    Workspace getByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Deletes a specified workspace.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String workspaceName);

    /**
     * Deletes a specified workspace.
     * 
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified workspace.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace along with {@link Response}.
     */
    Workspace getById(String id);

    /**
     * Gets the properties of the specified workspace.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified workspace along with {@link Response}.
     */
    Response<Workspace> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a specified workspace.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a specified workspace.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Workspace resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Workspace definition.
     */
    Workspace.DefinitionStages.Blank define(String name);
}
