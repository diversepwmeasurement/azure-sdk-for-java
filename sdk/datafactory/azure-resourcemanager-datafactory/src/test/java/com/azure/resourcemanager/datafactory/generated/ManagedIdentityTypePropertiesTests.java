// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedIdentityTypeProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedIdentityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ManagedIdentityTypeProperties model =
            BinaryData.fromString("{\"resourceId\":\"vbbaexxjfwtg\"}").toObject(ManagedIdentityTypeProperties.class);
        Assertions.assertEquals("vbbaexxjfwtg", model.resourceId());
    }

    @Test
    public void testSerialize() {
        ManagedIdentityTypeProperties model = new ManagedIdentityTypeProperties().withResourceId("vbbaexxjfwtg");
        model = BinaryData.fromObject(model).toObject(ManagedIdentityTypeProperties.class);
        Assertions.assertEquals("vbbaexxjfwtg", model.resourceId());
    }
}