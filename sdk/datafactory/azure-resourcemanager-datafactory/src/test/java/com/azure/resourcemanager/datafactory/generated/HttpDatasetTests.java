// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.HttpDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class HttpDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpDataset model = BinaryData.fromString(
            "{\"type\":\"gwaakktbjortz\",\"typeProperties\":{\"relativeUrl\":\"dataejexfdlhuhd\",\"requestMethod\":\"databgywadrklpdye\",\"requestBody\":\"datarwcflvxbocayw\",\"additionalHeaders\":\"datavuhzmolhveoln\",\"format\":{\"type\":\"mhwdxqupyml\",\"serializer\":\"datalmnjqzm\",\"deserializer\":\"datanhitrnwqgqrbth\",\"\":{\"qeiaddp\":\"dataiqnrjocogwfvkywz\",\"mizunzbqvioync\":\"datahuvnlmdcnutie\"}},\"compression\":{\"type\":\"dataqhhvvwz\",\"level\":\"datajaaaiaibtvavly\",\"\":{\"rl\":\"datalocnwmefzvzuzq\",\"v\":\"datao\",\"sfyqncowm\":\"datazgyhen\",\"ywjiaaosla\":\"datanozf\"}}},\"description\":\"ajqhsnsejplis\",\"structure\":\"datayljzbk\",\"schema\":\"datalfjwxgvtkjctv\",\"linkedServiceName\":{\"referenceName\":\"peawzzkvfccozv\",\"parameters\":{\"raitrms\":\"dataph\",\"ptctxpoegyckmemf\":\"datakxtuytg\",\"mwrv\":\"datarcclclfkfvyjo\",\"x\":\"dataoipjy\"}},\"parameters\":{\"qwh\":{\"type\":\"String\",\"defaultValue\":\"dataewfzvvpay\"}},\"annotations\":[\"datayandblk\",\"datantcv\"],\"folder\":{\"name\":\"fmo\"},\"\":{\"pff\":\"datatfvxuos\",\"wyjzuakkiubeqk\":\"datapjpjmsbzzjsnyf\"}}")
            .toObject(HttpDataset.class);
        Assertions.assertEquals("ajqhsnsejplis", model.description());
        Assertions.assertEquals("peawzzkvfccozv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("qwh").type());
        Assertions.assertEquals("fmo", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpDataset model = new HttpDataset().withDescription("ajqhsnsejplis")
            .withStructure("datayljzbk")
            .withSchema("datalfjwxgvtkjctv")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("peawzzkvfccozv")
                .withParameters(mapOf("raitrms", "dataph", "ptctxpoegyckmemf", "datakxtuytg", "mwrv",
                    "datarcclclfkfvyjo", "x", "dataoipjy")))
            .withParameters(mapOf("qwh",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataewfzvvpay")))
            .withAnnotations(Arrays.asList("datayandblk", "datantcv"))
            .withFolder(new DatasetFolder().withName("fmo"))
            .withRelativeUrl("dataejexfdlhuhd")
            .withRequestMethod("databgywadrklpdye")
            .withRequestBody("datarwcflvxbocayw")
            .withAdditionalHeaders("datavuhzmolhveoln")
            .withFormat(new DatasetStorageFormat().withSerializer("datalmnjqzm")
                .withDeserializer("datanhitrnwqgqrbth")
                .withAdditionalProperties(mapOf("type", "mhwdxqupyml")))
            .withCompression(new DatasetCompression().withType("dataqhhvvwz")
                .withLevel("datajaaaiaibtvavly")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(HttpDataset.class);
        Assertions.assertEquals("ajqhsnsejplis", model.description());
        Assertions.assertEquals("peawzzkvfccozv", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("qwh").type());
        Assertions.assertEquals("fmo", model.folder().name());
    }

    // Use "Map.of" if available
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
