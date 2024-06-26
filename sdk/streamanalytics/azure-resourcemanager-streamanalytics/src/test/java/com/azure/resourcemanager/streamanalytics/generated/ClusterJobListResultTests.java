// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.ClusterJobListResult;

public final class ClusterJobListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterJobListResult model = BinaryData.fromString(
            "{\"value\":[{\"id\":\"gxywpmue\",\"streamingUnits\":1011039859,\"jobState\":\"Deleting\"},{\"id\":\"qkqujidsu\",\"streamingUnits\":168254793,\"jobState\":\"Running\"},{\"id\":\"laocqxtccmg\",\"streamingUnits\":1054992005,\"jobState\":\"Starting\"},{\"id\":\"lmoyrx\",\"streamingUnits\":2130871697,\"jobState\":\"Stopped\"}],\"nextLink\":\"pz\"}")
            .toObject(ClusterJobListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterJobListResult model = new ClusterJobListResult();
        model = BinaryData.fromObject(model).toObject(ClusterJobListResult.class);
    }
}
