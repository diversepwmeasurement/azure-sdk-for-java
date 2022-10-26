// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CassandraLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CassandraLinkedServiceTests {
    @Test
    public void testDeserialize() {
        CassandraLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"Cassandra\",\"typeProperties\":{\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"zwv\",\"parameters\":{}},\"description\":\"yngydgrpxncaki\",\"parameters\":{\"jrkc\":{\"type\":\"SecureString\"},\"gglvlmfejdoqeykg\":{\"type\":\"Int\"},\"gxhqfgqkayejs\":{\"type\":\"Object\"}},\"annotations\":[],\"\":{}}")
                .toObject(CassandraLinkedService.class);
        Assertions.assertEquals("zwv", model.connectVia().referenceName());
        Assertions.assertEquals("yngydgrpxncaki", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("jrkc").type());
    }

    @Test
    public void testSerialize() {
        CassandraLinkedService model =
            new CassandraLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("zwv").withParameters(mapOf()))
                .withDescription("yngydgrpxncaki")
                .withParameters(
                    mapOf(
                        "jrkc",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "gglvlmfejdoqeykg",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "gxhqfgqkayejs",
                        new ParameterSpecification().withType(ParameterType.OBJECT)))
                .withAnnotations(Arrays.asList())
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(CassandraLinkedService.class);
        Assertions.assertEquals("zwv", model.connectVia().referenceName());
        Assertions.assertEquals("yngydgrpxncaki", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("jrkc").type());
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