// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.models.OutboundEndpointPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OutboundEndpointPatchTests {
    @Test
    public void testDeserialize() {
        OutboundEndpointPatch model =
            BinaryData.fromString("{\"tags\":{\"kgfg\":\"zndlikwy\"}}").toObject(OutboundEndpointPatch.class);
        Assertions.assertEquals("zndlikwy", model.tags().get("kgfg"));
    }

    @Test
    public void testSerialize() {
        OutboundEndpointPatch model = new OutboundEndpointPatch().withTags(mapOf("kgfg", "zndlikwy"));
        model = BinaryData.fromObject(model).toObject(OutboundEndpointPatch.class);
        Assertions.assertEquals("zndlikwy", model.tags().get("kgfg"));
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