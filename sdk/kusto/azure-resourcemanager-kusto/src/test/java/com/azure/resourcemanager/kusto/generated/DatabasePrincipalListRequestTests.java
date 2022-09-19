// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListRequest;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DatabasePrincipalListRequestTests {
    @Test
    public void testDeserialize() {
        DatabasePrincipalListRequest model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"role\":\"Ingestor\",\"name\":\"unrmfqjhhkxb\",\"type\":\"App\",\"fqn\":\"ymjhxxjyngudivkr\",\"email\":\"wbxqzvszjfau\",\"appId\":\"fdxxivetvtcqaqtd\",\"tenantName\":\"mcbxvwvxysl\"},{\"role\":\"UnrestrictedViewer\",\"name\":\"hsfxoblytkb\",\"type\":\"App\",\"fqn\":\"ewwwfbkrvrnsv\",\"email\":\"q\",\"appId\":\"hxcr\",\"tenantName\":\"fovasr\"},{\"role\":\"Viewer\",\"name\":\"v\",\"type\":\"Group\",\"fqn\":\"sqfsubcgjbirxb\",\"email\":\"bsrfbj\",\"appId\":\"twss\",\"tenantName\":\"ftpvjzbexil\"}]}")
                .toObject(DatabasePrincipalListRequest.class);
        Assertions.assertEquals(DatabasePrincipalRole.INGESTOR, model.value().get(0).role());
        Assertions.assertEquals("unrmfqjhhkxb", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.APP, model.value().get(0).type());
        Assertions.assertEquals("ymjhxxjyngudivkr", model.value().get(0).fqn());
        Assertions.assertEquals("wbxqzvszjfau", model.value().get(0).email());
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.value().get(0).appId());
    }

    @Test
    public void testSerialize() {
        DatabasePrincipalListRequest model =
            new DatabasePrincipalListRequest()
                .withValue(
                    Arrays
                        .asList(
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.INGESTOR)
                                .withName("unrmfqjhhkxb")
                                .withType(DatabasePrincipalType.APP)
                                .withFqn("ymjhxxjyngudivkr")
                                .withEmail("wbxqzvszjfau")
                                .withAppId("fdxxivetvtcqaqtd"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.UNRESTRICTED_VIEWER)
                                .withName("hsfxoblytkb")
                                .withType(DatabasePrincipalType.APP)
                                .withFqn("ewwwfbkrvrnsv")
                                .withEmail("q")
                                .withAppId("hxcr"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.VIEWER)
                                .withName("v")
                                .withType(DatabasePrincipalType.GROUP)
                                .withFqn("sqfsubcgjbirxb")
                                .withEmail("bsrfbj")
                                .withAppId("twss")));
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalListRequest.class);
        Assertions.assertEquals(DatabasePrincipalRole.INGESTOR, model.value().get(0).role());
        Assertions.assertEquals("unrmfqjhhkxb", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.APP, model.value().get(0).type());
        Assertions.assertEquals("ymjhxxjyngudivkr", model.value().get(0).fqn());
        Assertions.assertEquals("wbxqzvszjfau", model.value().get(0).email());
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.value().get(0).appId());
    }
}