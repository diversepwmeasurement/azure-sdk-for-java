// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.ApiOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ApiOperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiOperationDisplay model =
            BinaryData
                .fromString(
                    "{\"operation\":\"uf\",\"provider\":\"zk\",\"resource\":\"dbihanufhfcbj\",\"description\":\"a\"}")
                .toObject(ApiOperationDisplay.class);
        Assertions.assertEquals("uf", model.operation());
        Assertions.assertEquals("zk", model.provider());
        Assertions.assertEquals("dbihanufhfcbj", model.resource());
        Assertions.assertEquals("a", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiOperationDisplay model =
            new ApiOperationDisplay()
                .withOperation("uf")
                .withProvider("zk")
                .withResource("dbihanufhfcbj")
                .withDescription("a");
        model = BinaryData.fromObject(model).toObject(ApiOperationDisplay.class);
        Assertions.assertEquals("uf", model.operation());
        Assertions.assertEquals("zk", model.provider());
        Assertions.assertEquals("dbihanufhfcbj", model.resource());
        Assertions.assertEquals("a", model.description());
    }
}
