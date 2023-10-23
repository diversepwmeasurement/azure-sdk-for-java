// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.CatalogConflictError;

public final class CatalogConflictErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CatalogConflictError model =
            BinaryData.fromString("{\"path\":\"s\",\"name\":\"ddystkiiuxhqy\"}").toObject(CatalogConflictError.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CatalogConflictError model = new CatalogConflictError();
        model = BinaryData.fromObject(model).toObject(CatalogConflictError.class);
    }
}
