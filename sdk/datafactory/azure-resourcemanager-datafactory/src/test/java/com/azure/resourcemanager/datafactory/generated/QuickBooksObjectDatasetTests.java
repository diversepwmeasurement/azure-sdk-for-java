// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.QuickBooksObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class QuickBooksObjectDatasetTests {
    @Test
    public void testDeserialize() {
        QuickBooksObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"QuickBooksObject\",\"typeProperties\":{},\"description\":\"amljdlrgmsplzgau\",\"linkedServiceName\":{\"referenceName\":\"hhvnewgnxkymp\",\"parameters\":{}},\"parameters\":{\"ixt\":{\"type\":\"Bool\"},\"aoypny\":{\"type\":\"Array\"}},\"annotations\":[],\"folder\":{\"name\":\"cyl\"},\"\":{}}")
                .toObject(QuickBooksObjectDataset.class);
        Assertions.assertEquals("amljdlrgmsplzgau", model.description());
        Assertions.assertEquals("hhvnewgnxkymp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ixt").type());
        Assertions.assertEquals("cyl", model.folder().name());
    }

    @Test
    public void testSerialize() {
        QuickBooksObjectDataset model =
            new QuickBooksObjectDataset()
                .withDescription("amljdlrgmsplzgau")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("hhvnewgnxkymp").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "ixt",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "aoypny",
                        new ParameterSpecification().withType(ParameterType.ARRAY)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("cyl"));
        model = BinaryData.fromObject(model).toObject(QuickBooksObjectDataset.class);
        Assertions.assertEquals("amljdlrgmsplzgau", model.description());
        Assertions.assertEquals("hhvnewgnxkymp", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("ixt").type());
        Assertions.assertEquals("cyl", model.folder().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}