// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class SelfHostedIntegrationRuntimeStatusTypePropertiesTests {
    @Test
    public void testDeserialize() {
        SelfHostedIntegrationRuntimeStatusTypeProperties model =
            BinaryData
                .fromString(
                    "{\"createTime\":\"2021-09-14T20:30:43Z\",\"taskQueueId\":\"jsaqwotmmwllcols\",\"internalChannelEncryption\":\"NotSet\",\"version\":\"pt\",\"nodes\":[{\"nodeName\":\"xcgjokjljnhvlq\",\"machineName\":\"ek\",\"hostServiceUri\":\"eksnbksdqhjvyk\",\"status\":\"Upgrading\",\"capabilities\":{\"stcpoqmavnwqjw\":\"khh\",\"nlejjjkxybwf\":\"o\"},\"versionStatus\":\"kjbztensvkzykj\",\"version\":\"kns\",\"registerTime\":\"2021-11-14T07:54:43Z\",\"lastConnectTime\":\"2021-08-03T03:30:16Z\",\"expiryTime\":\"2021-10-26T19:31:27Z\",\"lastStartTime\":\"2021-09-28T08:23:01Z\",\"lastStopTime\":\"2020-12-31T10:15:24Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-02-12T10:55:06Z\",\"lastEndUpdateTime\":\"2021-05-30T01:26Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":482115950,\"maxConcurrentJobs\":943745189,\"\":{}},{\"nodeName\":\"oiojfizfavkjzwfb\",\"machineName\":\"aykmmf\",\"hostServiceUri\":\"bfw\",\"status\":\"Upgrading\",\"capabilities\":{\"rsxkr\":\"dew\"},\"versionStatus\":\"bjazejwwviy\",\"version\":\"ps\",\"registerTime\":\"2021-03-21T06:31:37Z\",\"lastConnectTime\":\"2021-02-25T20:04:53Z\",\"expiryTime\":\"2021-09-20T22:56:33Z\",\"lastStartTime\":\"2021-01-22T22:08:23Z\",\"lastStopTime\":\"2021-02-03T20:08Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-04-28T17:16:52Z\",\"lastEndUpdateTime\":\"2021-03-25T08:11:13Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":722435599,\"maxConcurrentJobs\":321648657,\"\":{}},{\"nodeName\":\"qiqyhgfsetzlexbs\",\"machineName\":\"e\",\"hostServiceUri\":\"no\",\"status\":\"Initializing\",\"capabilities\":{\"hqsycljselp\":\"wfbzkkdt\",\"bevxrhyzd\":\"pbafvafhlbylc\",\"pl\":\"wrso\",\"cwnpqigtuujwouhd\":\"dbmairrhvhfnr\"},\"versionStatus\":\"s\",\"version\":\"rb\",\"registerTime\":\"2021-07-09T10:35:13Z\",\"lastConnectTime\":\"2021-07-30T02:07:24Z\",\"expiryTime\":\"2021-02-24T22:43:02Z\",\"lastStartTime\":\"2021-10-27T16:02:45Z\",\"lastStopTime\":\"2021-07-07T03:36:35Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-01-25T17:12:27Z\",\"lastEndUpdateTime\":\"2021-03-12T23:28:12Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1919914204,\"maxConcurrentJobs\":1286608376,\"\":{}}],\"scheduledUpdateDate\":\"2021-01-15T13:56:20Z\",\"updateDelayOffset\":\"hozfn\",\"localTimeZoneOffset\":\"exlvxnoakiz\",\"capabilities\":{\"yxl\":\"iknaqlnuwig\"},\"serviceUrls\":[\"phvxz\",\"wxh\"],\"autoUpdate\":\"On\",\"versionStatus\":\"tl\",\"links\":[{\"name\":\"onwivkcqhrxhxkn\",\"subscriptionId\":\"crmmkyupijuby\",\"dataFactoryName\":\"fkak\",\"dataFactoryLocation\":\"frkemyildudxja\",\"createTime\":\"2021-07-28T10:47:38Z\"},{\"name\":\"vfdjkpdxp\",\"subscriptionId\":\"kk\",\"dataFactoryName\":\"mgzvyfi\",\"dataFactoryLocation\":\"kzuqnwsith\",\"createTime\":\"2021-07-01T06:58:40Z\"},{\"name\":\"yahluqwqulsutr\",\"subscriptionId\":\"hxykfhyqez\",\"dataFactoryName\":\"qugdrftbcvexreuq\",\"dataFactoryLocation\":\"wtl\",\"createTime\":\"2021-05-08T05:15:15Z\"}],\"pushedVersion\":\"hreagk\",\"latestVersion\":\"xv\",\"autoUpdateETA\":\"2021-02-21T04:16Z\"}")
                .toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    @Test
    public void testSerialize() throws IOException {
        SelfHostedIntegrationRuntimeStatusTypeProperties model =
            new SelfHostedIntegrationRuntimeStatusTypeProperties()
                .withNodes(
                    Arrays
                        .asList(
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "xcgjokjljnhvlq",
                                        "lastStartUpdateTime",
                                        "2021-02-12T10:55:06Z",
                                        "lastConnectTime",
                                        "2021-08-03T03:30:16Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"stcpoqmavnwqjw\":\"khh\",\"nlejjjkxybwf\":\"o\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "eksnbksdqhjvyk",
                                        "registerTime",
                                        "2021-11-14T07:54:43Z",
                                        "maxConcurrentJobs",
                                        943745189,
                                        "lastStopTime",
                                        "2020-12-31T10:15:24Z",
                                        "version",
                                        "kns",
                                        "machineName",
                                        "ek",
                                        "versionStatus",
                                        "kjbztensvkzykj",
                                        "concurrentJobsLimit",
                                        482115950,
                                        "lastEndUpdateTime",
                                        "2021-05-30T01:26Z",
                                        "expiryTime",
                                        "2021-10-26T19:31:27Z",
                                        "lastStartTime",
                                        "2021-09-28T08:23:01Z",
                                        "lastUpdateResult",
                                        "Fail",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "Upgrading")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "oiojfizfavkjzwfb",
                                        "lastStartUpdateTime",
                                        "2021-04-28T17:16:52Z",
                                        "lastConnectTime",
                                        "2021-02-25T20:04:53Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize("{\"rsxkr\":\"dew\"}", Object.class, SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "bfw",
                                        "registerTime",
                                        "2021-03-21T06:31:37Z",
                                        "maxConcurrentJobs",
                                        321648657,
                                        "lastStopTime",
                                        "2021-02-03T20:08Z",
                                        "version",
                                        "ps",
                                        "machineName",
                                        "aykmmf",
                                        "versionStatus",
                                        "bjazejwwviy",
                                        "concurrentJobsLimit",
                                        722435599,
                                        "lastEndUpdateTime",
                                        "2021-03-25T08:11:13Z",
                                        "expiryTime",
                                        "2021-09-20T22:56:33Z",
                                        "lastStartTime",
                                        "2021-01-22T22:08:23Z",
                                        "lastUpdateResult",
                                        "None",
                                        "isActiveDispatcher",
                                        true,
                                        "status",
                                        "Upgrading")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "qiqyhgfsetzlexbs",
                                        "lastStartUpdateTime",
                                        "2021-01-25T17:12:27Z",
                                        "lastConnectTime",
                                        "2021-07-30T02:07:24Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"hqsycljselp\":\"wfbzkkdt\",\"bevxrhyzd\":\"pbafvafhlbylc\",\"pl\":\"wrso\",\"cwnpqigtuujwouhd\":\"dbmairrhvhfnr\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "no",
                                        "registerTime",
                                        "2021-07-09T10:35:13Z",
                                        "maxConcurrentJobs",
                                        1286608376,
                                        "lastStopTime",
                                        "2021-07-07T03:36:35Z",
                                        "version",
                                        "rb",
                                        "machineName",
                                        "e",
                                        "versionStatus",
                                        "s",
                                        "concurrentJobsLimit",
                                        1919914204,
                                        "lastEndUpdateTime",
                                        "2021-03-12T23:28:12Z",
                                        "expiryTime",
                                        "2021-02-24T22:43:02Z",
                                        "lastStartTime",
                                        "2021-10-27T16:02:45Z",
                                        "lastUpdateResult",
                                        "Succeed",
                                        "isActiveDispatcher",
                                        true,
                                        "status",
                                        "Initializing"))))
                .withLinks(
                    Arrays
                        .asList(
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
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