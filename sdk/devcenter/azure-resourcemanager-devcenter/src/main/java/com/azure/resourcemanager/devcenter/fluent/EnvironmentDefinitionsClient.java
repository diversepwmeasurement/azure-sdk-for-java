// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogResourceValidationErrorDetailsInner;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentDefinitionInner;

/** An instance of this class provides access to all the operations defined in EnvironmentDefinitionsClient. */
public interface EnvironmentDefinitionsClient {
    /**
     * List environment definitions in the catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the environment definition list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnvironmentDefinitionInner> listByCatalog(
        String resourceGroupName, String devCenterName, String catalogName);

    /**
     * List environment definitions in the catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the environment definition list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnvironmentDefinitionInner> listByCatalog(
        String resourceGroupName, String devCenterName, String catalogName, Integer top, Context context);

    /**
     * Gets an environment definition from the catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param environmentDefinitionName The name of the Environment Definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment definition from the catalog along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnvironmentDefinitionInner> getWithResponse(
        String resourceGroupName,
        String devCenterName,
        String catalogName,
        String environmentDefinitionName,
        Context context);

    /**
     * Gets an environment definition from the catalog.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param environmentDefinitionName The name of the Environment Definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment definition from the catalog.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentDefinitionInner get(
        String resourceGroupName, String devCenterName, String catalogName, String environmentDefinitionName);

    /**
     * Gets Environment Definition error details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param environmentDefinitionName The name of the Environment Definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Definition error details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CatalogResourceValidationErrorDetailsInner> getErrorDetailsWithResponse(
        String resourceGroupName,
        String devCenterName,
        String catalogName,
        String environmentDefinitionName,
        Context context);

    /**
     * Gets Environment Definition error details.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param devCenterName The name of the devcenter.
     * @param catalogName The name of the Catalog.
     * @param environmentDefinitionName The name of the Environment Definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment Definition error details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CatalogResourceValidationErrorDetailsInner getErrorDetails(
        String resourceGroupName, String devCenterName, String catalogName, String environmentDefinitionName);
}
