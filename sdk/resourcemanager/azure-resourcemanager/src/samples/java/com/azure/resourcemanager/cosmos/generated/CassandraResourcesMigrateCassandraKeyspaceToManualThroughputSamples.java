// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for CassandraResources MigrateCassandraKeyspaceToManualThroughput. */
public final class CassandraResourcesMigrateCassandraKeyspaceToManualThroughputSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBCassandraKeyspaceMigrateToManualThroughput.json
     */
    /**
     * Sample code: CosmosDBCassandraKeyspaceMigrateToManualThroughput.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBCassandraKeyspaceMigrateToManualThroughput(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraResources()
            .migrateCassandraKeyspaceToManualThroughput(
                "rg1", "ddb1", "keyspaceName", com.azure.core.util.Context.NONE);
    }
}
