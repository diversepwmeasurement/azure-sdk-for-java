// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"bebb750b-4ead-47a4-9031-4f994619616e\",\"tenantId\":\"ac2c411d-f176-4004-8573-7305f2b23436\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"oo\":{\"principalId\":\"6d327b5a-dc37-4ca4-93a2-24344141370b\",\"clientId\":\"62feae55-e808-4d94-857b-adf60700140c\"}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("oo", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
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
