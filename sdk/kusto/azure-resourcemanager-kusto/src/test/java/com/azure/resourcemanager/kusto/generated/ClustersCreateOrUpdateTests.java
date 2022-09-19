// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.AzureSku;
import com.azure.resourcemanager.kusto.models.AzureSkuName;
import com.azure.resourcemanager.kusto.models.AzureSkuTier;
import com.azure.resourcemanager.kusto.models.Cluster;
import com.azure.resourcemanager.kusto.models.ClusterNetworkAccessFlag;
import com.azure.resourcemanager.kusto.models.EngineType;
import com.azure.resourcemanager.kusto.models.Identity;
import com.azure.resourcemanager.kusto.models.IdentityType;
import com.azure.resourcemanager.kusto.models.KeyVaultProperties;
import com.azure.resourcemanager.kusto.models.OptimizedAutoscale;
import com.azure.resourcemanager.kusto.models.PublicIpType;
import com.azure.resourcemanager.kusto.models.PublicNetworkAccess;
import com.azure.resourcemanager.kusto.models.VirtualNetworkConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersCreateOrUpdateTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"sku\":{\"name\":\"Standard_E16s_v5+4TB_PS\",\"capacity\":986861935,\"tier\":\"Basic\"},\"zones\":[\"brm\"],\"identity\":{\"principalId\":\"ivsiy\",\"tenantId\":\"kdncj\",\"type\":\"SystemAssigned,"
                + " UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"state\":\"Stopped\",\"provisioningState\":\"Succeeded\",\"uri\":\"ulapzwyrp\",\"dataIngestionUri\":\"gtqxep\",\"stateReason\":\"lbfu\",\"trustedExternalTenants\":[],\"optimizedAutoscale\":{\"version\":1631944105,\"isEnabled\":false,\"minimum\":2027275706,\"maximum\":21548435},\"enableDiskEncryption\":false,\"enableStreamingIngest\":true,\"virtualNetworkConfiguration\":{\"subnetId\":\"vfcibyfmowux\",\"enginePublicIpId\":\"kjpvdwxf\",\"dataManagementPublicIpId\":\"wiivwzjbhyzsx\"},\"keyVaultProperties\":{\"keyName\":\"ambtrnegvm\",\"keyVersion\":\"uqeqv\",\"keyVaultUri\":\"spastjbkkdmf\",\"userIdentity\":\"est\"},\"enablePurge\":false,\"languageExtensions\":{\"value\":[]},\"enableDoubleEncryption\":true,\"publicNetworkAccess\":\"Enabled\",\"allowedIpRangeList\":[\"peewchpxlkt\",\"kuziycsle\",\"ufuztcktyhjtq\"],\"engineType\":\"V3\",\"acceptedAudiences\":[],\"enableAutoStop\":true,\"restrictOutboundNetworkAccess\":\"Enabled\",\"allowedFqdnList\":[\"qzz\"],\"publicIPType\":\"DualStack\",\"virtualClusterGraduationProperties\":\"pglydz\",\"privateEndpointConnections\":[]},\"etag\":\"qeevt\",\"location\":\"epr\",\"tags\":{\"pzdm\":\"nwy\"},\"id\":\"vzvfvaawzqadfl\",\"name\":\"z\",\"type\":\"riglaec\"}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response =
            manager
                .clusters()
                .define("sgow")
                .withRegion("dwvvba")
                .withExistingResourceGroup("fbkjubdyhgkfmi")
                .withSku(
                    new AzureSku()
                        .withName(AzureSkuName.STANDARD_DS14_V2_3TB_PS)
                        .withCapacity(770655875)
                        .withTier(AzureSkuTier.STANDARD))
                .withTags(mapOf("chp", "l", "evwrdnhfuk", "db", "fcvlerch", "vsjcswsmystuluqy"))
                .withZones(Arrays.asList("tlahbq", "ctxtgzukxi"))
                .withIdentity(new Identity().withType(IdentityType.NONE).withUserAssignedIdentities(mapOf()))
                .withTrustedExternalTenants(Arrays.asList())
                .withOptimizedAutoscale(
                    new OptimizedAutoscale()
                        .withVersion(2021052492)
                        .withIsEnabled(false)
                        .withMinimum(835258440)
                        .withMaximum(1544456346))
                .withEnableDiskEncryption(false)
                .withEnableStreamingIngest(false)
                .withVirtualNetworkConfiguration(
                    new VirtualNetworkConfiguration()
                        .withSubnetId("oaz")
                        .withEnginePublicIpId("ruocbgo")
                        .withDataManagementPublicIpId("rb"))
                .withKeyVaultProperties(
                    new KeyVaultProperties()
                        .withKeyName("ybfhjxa")
                        .withKeyVersion("vjgsl")
                        .withKeyVaultUri("dilmyww")
                        .withUserIdentity("gkxnyedabg"))
                .withEnablePurge(true)
                .withEnableDoubleEncryption(false)
                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                .withAllowedIpRangeList(Arrays.asList("ihxuuwh", "j", "xccybvpa"))
                .withEngineType(EngineType.V2)
                .withAcceptedAudiences(Arrays.asList())
                .withEnableAutoStop(false)
                .withRestrictOutboundNetworkAccess(ClusterNetworkAccessFlag.DISABLED)
                .withAllowedFqdnList(Arrays.asList("jplmagstcy", "hpfkyrkdbdgi"))
                .withPublicIpType(PublicIpType.IPV4)
                .withVirtualClusterGraduationProperties("kmnwqjnobaiyhddv")
                .withIfMatch("ddrihpf")
                .withIfNoneMatch("oqcaaewdaomdj")
                .create();

        Assertions.assertEquals("epr", response.location());
        Assertions.assertEquals("nwy", response.tags().get("pzdm"));
        Assertions.assertEquals(AzureSkuName.STANDARD_E16S_V5_4TB_PS, response.sku().name());
        Assertions.assertEquals(986861935, response.sku().capacity());
        Assertions.assertEquals(AzureSkuTier.BASIC, response.sku().tier());
        Assertions.assertEquals("brm", response.zones().get(0));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals(1631944105, response.optimizedAutoscale().version());
        Assertions.assertEquals(false, response.optimizedAutoscale().isEnabled());
        Assertions.assertEquals(2027275706, response.optimizedAutoscale().minimum());
        Assertions.assertEquals(21548435, response.optimizedAutoscale().maximum());
        Assertions.assertEquals(false, response.enableDiskEncryption());
        Assertions.assertEquals(true, response.enableStreamingIngest());
        Assertions.assertEquals("vfcibyfmowux", response.virtualNetworkConfiguration().subnetId());
        Assertions.assertEquals("kjpvdwxf", response.virtualNetworkConfiguration().enginePublicIpId());
        Assertions.assertEquals("wiivwzjbhyzsx", response.virtualNetworkConfiguration().dataManagementPublicIpId());
        Assertions.assertEquals("ambtrnegvm", response.keyVaultProperties().keyName());
        Assertions.assertEquals("uqeqv", response.keyVaultProperties().keyVersion());
        Assertions.assertEquals("spastjbkkdmf", response.keyVaultProperties().keyVaultUri());
        Assertions.assertEquals("est", response.keyVaultProperties().userIdentity());
        Assertions.assertEquals(false, response.enablePurge());
        Assertions.assertEquals(true, response.enableDoubleEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.publicNetworkAccess());
        Assertions.assertEquals("peewchpxlkt", response.allowedIpRangeList().get(0));
        Assertions.assertEquals(EngineType.V3, response.engineType());
        Assertions.assertEquals(true, response.enableAutoStop());
        Assertions.assertEquals(ClusterNetworkAccessFlag.ENABLED, response.restrictOutboundNetworkAccess());
        Assertions.assertEquals("qzz", response.allowedFqdnList().get(0));
        Assertions.assertEquals(PublicIpType.DUAL_STACK, response.publicIpType());
        Assertions.assertEquals("pglydz", response.virtualClusterGraduationProperties());
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