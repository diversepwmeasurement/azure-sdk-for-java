// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for IngestionSettings Get. */
public final class IngestionSettingsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2021-01-15-preview/examples/IngestionSettings/GetIngestionSetting_example.json
     */
    /**
     * Sample code: Get a ingestion setting on subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAIngestionSettingOnSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.ingestionSettings().getWithResponse("default", Context.NONE);
    }
}