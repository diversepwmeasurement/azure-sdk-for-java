// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.NamespaceJunction;
import org.junit.jupiter.api.Assertions;

public final class NamespaceJunctionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NamespaceJunction model =
            BinaryData
                .fromString(
                    "{\"namespacePath\":\"sflhhca\",\"targetPath\":\"n\",\"nfsExport\":\"xisxyawjoyaqcsl\",\"nfsAccessPolicy\":\"pkii\"}")
                .toObject(NamespaceJunction.class);
        Assertions.assertEquals("sflhhca", model.namespacePath());
        Assertions.assertEquals("n", model.targetPath());
        Assertions.assertEquals("xisxyawjoyaqcsl", model.nfsExport());
        Assertions.assertEquals("pkii", model.nfsAccessPolicy());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NamespaceJunction model =
            new NamespaceJunction()
                .withNamespacePath("sflhhca")
                .withTargetPath("n")
                .withNfsExport("xisxyawjoyaqcsl")
                .withNfsAccessPolicy("pkii");
        model = BinaryData.fromObject(model).toObject(NamespaceJunction.class);
        Assertions.assertEquals("sflhhca", model.namespacePath());
        Assertions.assertEquals("n", model.targetPath());
        Assertions.assertEquals("xisxyawjoyaqcsl", model.nfsExport());
        Assertions.assertEquals("pkii", model.nfsAccessPolicy());
    }
}
