// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStorageInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStoragesCollectionInner;

/** An instance of this class provides access to all the operations defined in ConnectedEnvironmentsStoragesClient. */
public interface ConnectedEnvironmentsStoragesClient {
    /**
     * Get all storages for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all storages for a connectedEnvironment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedEnvironmentStoragesCollectionInner> listWithResponse(
        String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Get all storages for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all storages for a connectedEnvironment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentStoragesCollectionInner list(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Get storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a connectedEnvironment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedEnvironmentStorageInner> getWithResponse(
        String resourceGroupName, String connectedEnvironmentName, String storageName, Context context);

    /**
     * Get storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage for a connectedEnvironment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentStorageInner get(String resourceGroupName, String connectedEnvironmentName, String storageName);

    /**
     * Create or update storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param storageEnvelope Configuration details of storage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage resource for connectedEnvironment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedEnvironmentStorageInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String connectedEnvironmentName,
        String storageName,
        ConnectedEnvironmentStorageInner storageEnvelope,
        Context context);

    /**
     * Create or update storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param storageEnvelope Configuration details of storage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return storage resource for connectedEnvironment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentStorageInner createOrUpdate(
        String resourceGroupName,
        String connectedEnvironmentName,
        String storageName,
        ConnectedEnvironmentStorageInner storageEnvelope);

    /**
     * Delete storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String connectedEnvironmentName, String storageName, Context context);

    /**
     * Delete storage for a connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Environment.
     * @param storageName Name of the storage.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String connectedEnvironmentName, String storageName);
}