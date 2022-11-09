// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.CustomForecastHorizon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CustomForecastHorizonTests {
    @Test
    public void testDeserialize() {
        CustomForecastHorizon model =
            BinaryData.fromString("{\"mode\":\"Custom\",\"value\":632851650}").toObject(CustomForecastHorizon.class);
        Assertions.assertEquals(632851650, model.value());
    }

    @Test
    public void testSerialize() {
        CustomForecastHorizon model = new CustomForecastHorizon().withValue(632851650);
        model = BinaryData.fromObject(model).toObject(CustomForecastHorizon.class);
        Assertions.assertEquals(632851650, model.value());
    }
}