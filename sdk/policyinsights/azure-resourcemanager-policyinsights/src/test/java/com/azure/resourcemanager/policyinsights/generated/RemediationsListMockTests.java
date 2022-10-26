// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.Remediation;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class RemediationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"policyAssignmentId\":\"buswdvzyy\",\"policyDefinitionReferenceId\":\"cnunvjsr\",\"resourceDiscoveryMode\":\"ExistingNonCompliant\",\"provisioningState\":\"wnopqgikyzirtx\",\"createdOn\":\"2021-09-11T06:06:10Z\",\"lastUpdatedOn\":\"2021-06-22T14:25:15Z\",\"filters\":{\"locations\":[]},\"deploymentStatus\":{\"totalDeployments\":953757935,\"successfulDeployments\":1656228092,\"failedDeployments\":1675293509},\"statusMessage\":\"oi\",\"correlationId\":\"ukry\",\"resourceCount\":1625650098,\"parallelDeployments\":599402344,\"failureThreshold\":{\"percentage\":7.535511}},\"id\":\"orgguf\",\"name\":\"yaomtb\",\"type\":\"hhavgrvkffovjz\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Remediation> response = manager.remediations().list(2131974737, "vcxgfrpdsofbshr", Context.NONE);

        Assertions.assertEquals("buswdvzyy", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("cnunvjsr", response.iterator().next().policyDefinitionReferenceId());
        Assertions
            .assertEquals(
                ResourceDiscoveryMode.EXISTING_NON_COMPLIANT, response.iterator().next().resourceDiscoveryMode());
        Assertions.assertEquals(1625650098, response.iterator().next().resourceCount());
        Assertions.assertEquals(599402344, response.iterator().next().parallelDeployments());
        Assertions.assertEquals(7.535511F, response.iterator().next().failureThreshold().percentage());
    }
}