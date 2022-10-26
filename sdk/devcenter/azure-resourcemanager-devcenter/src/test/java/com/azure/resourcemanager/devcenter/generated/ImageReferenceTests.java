// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ImageReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageReferenceTests {
    @Test
    public void testDeserialize() {
        ImageReference model =
            BinaryData
                .fromString(
                    "{\"id\":\"ka\",\"exactVersion\":\"utiiswacf\",\"publisher\":\"dkzzewkfvhqcrail\",\"offer\":\"n\",\"sku\":\"fuflrwdmhdlx\"}")
                .toObject(ImageReference.class);
        Assertions.assertEquals("ka", model.id());
        Assertions.assertEquals("dkzzewkfvhqcrail", model.publisher());
        Assertions.assertEquals("n", model.offer());
        Assertions.assertEquals("fuflrwdmhdlx", model.sku());
    }

    @Test
    public void testSerialize() {
        ImageReference model =
            new ImageReference().withId("ka").withPublisher("dkzzewkfvhqcrail").withOffer("n").withSku("fuflrwdmhdlx");
        model = BinaryData.fromObject(model).toObject(ImageReference.class);
        Assertions.assertEquals("ka", model.id());
        Assertions.assertEquals("dkzzewkfvhqcrail", model.publisher());
        Assertions.assertEquals("n", model.offer());
        Assertions.assertEquals("fuflrwdmhdlx", model.sku());
    }
}