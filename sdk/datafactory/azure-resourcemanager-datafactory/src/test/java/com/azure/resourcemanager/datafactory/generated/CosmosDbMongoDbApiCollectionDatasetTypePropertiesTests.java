// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbMongoDbApiCollectionDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class CosmosDbMongoDbApiCollectionDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        CosmosDbMongoDbApiCollectionDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(CosmosDbMongoDbApiCollectionDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        CosmosDbMongoDbApiCollectionDatasetTypeProperties model =
            new CosmosDbMongoDbApiCollectionDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(CosmosDbMongoDbApiCollectionDatasetTypeProperties.class);
    }
}