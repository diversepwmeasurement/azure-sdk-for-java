// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightPigActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.HDInsightActivityDebugInfoOption;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HDInsightPigActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        HDInsightPigActivityTypeProperties model =
            BinaryData
                .fromString(
                    "{\"storageLinkedServices\":[{\"referenceName\":\"exqokmy\",\"parameters\":{}},{\"referenceName\":\"ialzbnobrqlp\",\"parameters\":{}},{\"referenceName\":\"trpzuyudivbxnh\",\"parameters\":{}}],\"getDebugInfo\":\"Failure\",\"scriptLinkedService\":{\"referenceName\":\"elwg\",\"parameters\":{}},\"defines\":{}}")
                .toObject(HDInsightPigActivityTypeProperties.class);
        Assertions.assertEquals("exqokmy", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("elwg", model.scriptLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        HDInsightPigActivityTypeProperties model =
            new HDInsightPigActivityTypeProperties()
                .withStorageLinkedServices(
                    Arrays
                        .asList(
                            new LinkedServiceReference().withReferenceName("exqokmy").withParameters(mapOf()),
                            new LinkedServiceReference().withReferenceName("ialzbnobrqlp").withParameters(mapOf()),
                            new LinkedServiceReference().withReferenceName("trpzuyudivbxnh").withParameters(mapOf())))
                .withGetDebugInfo(HDInsightActivityDebugInfoOption.FAILURE)
                .withScriptLinkedService(new LinkedServiceReference().withReferenceName("elwg").withParameters(mapOf()))
                .withDefines(mapOf());
        model = BinaryData.fromObject(model).toObject(HDInsightPigActivityTypeProperties.class);
        Assertions.assertEquals("exqokmy", model.storageLinkedServices().get(0).referenceName());
        Assertions.assertEquals(HDInsightActivityDebugInfoOption.FAILURE, model.getDebugInfo());
        Assertions.assertEquals("elwg", model.scriptLinkedService().referenceName());
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