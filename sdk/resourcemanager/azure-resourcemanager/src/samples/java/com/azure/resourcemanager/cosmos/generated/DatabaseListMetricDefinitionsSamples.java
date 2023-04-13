// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for Database ListMetricDefinitions. */
public final class DatabaseListMetricDefinitionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBDatabaseGetMetricDefinitions.json
     */
    /**
     * Sample code: CosmosDBDatabaseGetMetricDefinitions.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBDatabaseGetMetricDefinitions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getDatabases()
            .listMetricDefinitions("rg1", "ddb1", "databaseRid", com.azure.core.util.Context.NONE);
    }
}
