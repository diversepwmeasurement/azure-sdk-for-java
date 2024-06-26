// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.BillingMeterCollectionInner;
import com.azure.resourcemanager.appcontainers.models.BillingMeter;
import com.azure.resourcemanager.appcontainers.models.BillingMeterProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BillingMeterCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingMeterCollectionInner model = BinaryData.fromString(
            "{\"value\":[{\"location\":\"qzbqjvsov\",\"properties\":{\"category\":\"kacspkw\",\"meterType\":\"zdobpxjmflbvvnch\",\"displayName\":\"cciw\"},\"id\":\"juqk\",\"name\":\"rsa\",\"type\":\"iwkuofos\"},{\"location\":\"hsauuimjmvxied\",\"properties\":{\"category\":\"idyjrrfbyaosvexc\",\"meterType\":\"npc\",\"displayName\":\"ocohslkevleg\"},\"id\":\"fbuhfmvfaxkffe\",\"name\":\"ithlvmezyvshxm\",\"type\":\"sbbzo\"},{\"location\":\"igrxwburvjxxjn\",\"properties\":{\"category\":\"dptkoenkouk\",\"meterType\":\"udwtiukbl\",\"displayName\":\"gkpocipazyxoe\"},\"id\":\"kgjn\",\"name\":\"iucgygevqzn\",\"type\":\"yp\"},{\"location\":\"bpizcdrqjsdpydn\",\"properties\":{\"category\":\"xdeoejzic\",\"meterType\":\"fsj\",\"displayName\":\"gzfbishcbk\"},\"id\":\"jdeyeamdpha\",\"name\":\"alpbuxwgipwhon\",\"type\":\"wkgshwa\"}]}")
            .toObject(BillingMeterCollectionInner.class);
        Assertions.assertEquals("qzbqjvsov", model.value().get(0).location());
        Assertions.assertEquals("kacspkw", model.value().get(0).properties().category());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.value().get(0).properties().meterType());
        Assertions.assertEquals("cciw", model.value().get(0).properties().displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingMeterCollectionInner model = new BillingMeterCollectionInner().withValue(Arrays.asList(
            new BillingMeter().withLocation("qzbqjvsov")
                .withProperties(new BillingMeterProperties().withCategory("kacspkw").withMeterType("zdobpxjmflbvvnch")
                    .withDisplayName("cciw")),
            new BillingMeter().withLocation("hsauuimjmvxied")
                .withProperties(new BillingMeterProperties().withCategory("idyjrrfbyaosvexc").withMeterType("npc")
                    .withDisplayName("ocohslkevleg")),
            new BillingMeter().withLocation("igrxwburvjxxjn")
                .withProperties(new BillingMeterProperties().withCategory("dptkoenkouk").withMeterType("udwtiukbl")
                    .withDisplayName("gkpocipazyxoe")),
            new BillingMeter().withLocation("bpizcdrqjsdpydn").withProperties(new BillingMeterProperties()
                .withCategory("xdeoejzic").withMeterType("fsj").withDisplayName("gzfbishcbk"))));
        model = BinaryData.fromObject(model).toObject(BillingMeterCollectionInner.class);
        Assertions.assertEquals("qzbqjvsov", model.value().get(0).location());
        Assertions.assertEquals("kacspkw", model.value().get(0).properties().category());
        Assertions.assertEquals("zdobpxjmflbvvnch", model.value().get(0).properties().meterType());
        Assertions.assertEquals("cciw", model.value().get(0).properties().displayName());
    }
}
