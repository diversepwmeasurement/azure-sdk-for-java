// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for MongoDBResources ListMongoDBDatabases. */
public final class MongoDBResourcesListMongoDBDatabasesSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBMongoDBDatabaseList.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBDatabaseList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .listMongoDBDatabases("rgName", "ddb1", com.azure.core.util.Context.NONE);
    }
}
