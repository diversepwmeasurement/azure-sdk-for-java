// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.Assessment;
import org.junit.jupiter.api.Test;

public final class AssessmentTests {
    @Test
    public void testDeserialize() {
        Assessment model =
            BinaryData
                .fromString(
                    "{\"name\":\"ozmyzydagfu\",\"severity\":\"Medium\",\"description\":\"zyiuokk\",\"remediation\":\"hrdxwzywqsmbs\",\"isPass\":\"True\",\"policyId\":\"imoryocfsfksym\",\"resourceList\":[{\"resourceId\":\"tki\",\"resourceStatus\":\"NotApplicable\",\"reason\":\"qyud\",\"statusChangeDate\":\"rrqnbpoczvyifqrv\"}]}")
                .toObject(Assessment.class);
    }

    @Test
    public void testSerialize() {
        Assessment model = new Assessment();
        model = BinaryData.fromObject(model).toObject(Assessment.class);
    }
}
