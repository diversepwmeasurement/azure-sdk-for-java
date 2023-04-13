// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.NotebookWorkspaceName;

/** Samples for NotebookWorkspaces ListConnectionInfo. */
public final class NotebookWorkspacesListConnectionInfoSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBNotebookWorkspaceListConnectionInfo.json
     */
    /**
     * Sample code: CosmosDBNotebookWorkspaceListConnectionInfo.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBNotebookWorkspaceListConnectionInfo(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getNotebookWorkspaces()
            .listConnectionInfoWithResponse(
                "rg1", "ddb1", NotebookWorkspaceName.DEFAULT, com.azure.core.util.Context.NONE);
    }
}
