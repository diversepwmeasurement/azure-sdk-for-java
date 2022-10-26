// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.education.models.JoinRequestList;
import org.junit.jupiter.api.Test;

public final class JoinRequestListTests {
    @Test
    public void testDeserialize() {
        JoinRequestList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"firstName\":\"luwfzitonpeqfpjk\",\"lastName\":\"xofpdvhpfxxypi\",\"email\":\"nmayhuybb\",\"status\":\"Denied\"},\"id\":\"epoo\",\"name\":\"inuvamiheogn\",\"type\":\"rxzxtheo\"},{\"properties\":{\"firstName\":\"ivyevcciqihnhun\",\"lastName\":\"wjzrnfygxgisp\",\"email\":\"vtz\",\"status\":\"Pending\"},\"id\":\"ubljofxqe\",\"name\":\"fjaeq\",\"type\":\"hqjbasvmsmj\"},{\"properties\":{\"firstName\":\"ngsntnbybk\",\"lastName\":\"cwrwclxxwrljdous\",\"email\":\"qvkoc\",\"status\":\"Denied\"},\"id\":\"kwt\",\"name\":\"hxbnjbiksqrg\",\"type\":\"ssainqpjwnzll\"},{\"properties\":{\"firstName\":\"ppeebvmgxsab\",\"lastName\":\"qduujitcjczdz\",\"email\":\"ndhkrw\",\"status\":\"Pending\"},\"id\":\"p\",\"name\":\"sbdkvwr\",\"type\":\"jfeusnh\"}],\"nextLink\":\"je\"}")
                .toObject(JoinRequestList.class);
    }

    @Test
    public void testSerialize() {
        JoinRequestList model = new JoinRequestList();
        model = BinaryData.fromObject(model).toObject(JoinRequestList.class);
    }
}