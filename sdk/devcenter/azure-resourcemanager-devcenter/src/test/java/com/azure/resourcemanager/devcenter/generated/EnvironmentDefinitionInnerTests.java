// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentDefinitionInner;

public final class EnvironmentDefinitionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentDefinitionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"qrvqq\",\"parameters\":[{\"id\":\"inrvgoupmfi\",\"name\":\"fggjioolvr\",\"description\":\"kvtkkg\",\"type\":\"string\",\"readOnly\":true,\"required\":true}],\"templatePath\":\"jayvblmhv\",\"validationStatus\":\"Pending\"},\"id\":\"bxvvyhg\",\"name\":\"opbyrqufegxu\",\"type\":\"wz\"}")
                .toObject(EnvironmentDefinitionInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentDefinitionInner model = new EnvironmentDefinitionInner();
        model = BinaryData.fromObject(model).toObject(EnvironmentDefinitionInner.class);
    }
}
