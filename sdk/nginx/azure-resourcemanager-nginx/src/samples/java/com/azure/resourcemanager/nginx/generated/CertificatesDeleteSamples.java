// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

/**
 * Samples for Certificates Delete.
 */
public final class CertificatesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/nginx/resource-manager/NGINX.NGINXPLUS/stable/2023-04-01/examples/Certificates_Delete.json
     */
    /**
     * Sample code: Certificates_Delete.
     * 
     * @param manager Entry point to NginxManager.
     */
    public static void certificatesDelete(com.azure.resourcemanager.nginx.NginxManager manager) {
        manager.certificates().delete("myResourceGroup", "myDeployment", "default", com.azure.core.util.Context.NONE);
    }
}
