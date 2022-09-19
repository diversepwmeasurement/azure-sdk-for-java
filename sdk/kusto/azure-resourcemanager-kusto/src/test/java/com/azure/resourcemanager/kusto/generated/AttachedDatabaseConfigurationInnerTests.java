// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.AttachedDatabaseConfigurationInner;
import com.azure.resourcemanager.kusto.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.kusto.models.TableLevelSharingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AttachedDatabaseConfigurationInnerTests {
    @Test
    public void testDeserialize() {
        AttachedDatabaseConfigurationInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"itc\",\"properties\":{\"provisioningState\":\"Moving\",\"databaseName\":\"k\",\"clusterResourceId\":\"qumiek\",\"attachedDatabaseNames\":[\"zikhl\",\"fjhdg\",\"gge\"],\"defaultPrincipalsModificationKind\":\"Replace\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"g\",\"eqidbqfatpx\",\"lr\",\"cyjmoadsuvarmy\"],\"tablesToExclude\":[\"jsjqbjhhyx\",\"rw\"],\"externalTablesToInclude\":[\"oduhp\"],\"externalTablesToExclude\":[\"gymare\",\"n\",\"jxqugjhky\",\"ubeddg\"],\"materializedViewsToInclude\":[\"fwqmzqalkrmn\"],\"materializedViewsToExclude\":[\"pxacqqudfn\",\"yxbaaabjyvayf\"]},\"databaseNameOverride\":\"m\",\"databaseNamePrefix\":\"rtuzqogs\"},\"id\":\"xnevfdnwn\",\"name\":\"mewzsyyc\",\"type\":\"uzsoi\"}")
                .toObject(AttachedDatabaseConfigurationInner.class);
        Assertions.assertEquals("itc", model.location());
        Assertions.assertEquals("k", model.databaseName());
        Assertions.assertEquals("qumiek", model.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.REPLACE, model.defaultPrincipalsModificationKind());
        Assertions.assertEquals("g", model.tableLevelSharingProperties().tablesToInclude().get(0));
        Assertions.assertEquals("jsjqbjhhyx", model.tableLevelSharingProperties().tablesToExclude().get(0));
        Assertions.assertEquals("oduhp", model.tableLevelSharingProperties().externalTablesToInclude().get(0));
        Assertions.assertEquals("gymare", model.tableLevelSharingProperties().externalTablesToExclude().get(0));
        Assertions
            .assertEquals("fwqmzqalkrmn", model.tableLevelSharingProperties().materializedViewsToInclude().get(0));
        Assertions.assertEquals("pxacqqudfn", model.tableLevelSharingProperties().materializedViewsToExclude().get(0));
        Assertions.assertEquals("m", model.databaseNameOverride());
        Assertions.assertEquals("rtuzqogs", model.databaseNamePrefix());
    }

    @Test
    public void testSerialize() {
        AttachedDatabaseConfigurationInner model =
            new AttachedDatabaseConfigurationInner()
                .withLocation("itc")
                .withDatabaseName("k")
                .withClusterResourceId("qumiek")
                .withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind.REPLACE)
                .withTableLevelSharingProperties(
                    new TableLevelSharingProperties()
                        .withTablesToInclude(Arrays.asList("g", "eqidbqfatpx", "lr", "cyjmoadsuvarmy"))
                        .withTablesToExclude(Arrays.asList("jsjqbjhhyx", "rw"))
                        .withExternalTablesToInclude(Arrays.asList("oduhp"))
                        .withExternalTablesToExclude(Arrays.asList("gymare", "n", "jxqugjhky", "ubeddg"))
                        .withMaterializedViewsToInclude(Arrays.asList("fwqmzqalkrmn"))
                        .withMaterializedViewsToExclude(Arrays.asList("pxacqqudfn", "yxbaaabjyvayf")))
                .withDatabaseNameOverride("m")
                .withDatabaseNamePrefix("rtuzqogs");
        model = BinaryData.fromObject(model).toObject(AttachedDatabaseConfigurationInner.class);
        Assertions.assertEquals("itc", model.location());
        Assertions.assertEquals("k", model.databaseName());
        Assertions.assertEquals("qumiek", model.clusterResourceId());
        Assertions.assertEquals(DefaultPrincipalsModificationKind.REPLACE, model.defaultPrincipalsModificationKind());
        Assertions.assertEquals("g", model.tableLevelSharingProperties().tablesToInclude().get(0));
        Assertions.assertEquals("jsjqbjhhyx", model.tableLevelSharingProperties().tablesToExclude().get(0));
        Assertions.assertEquals("oduhp", model.tableLevelSharingProperties().externalTablesToInclude().get(0));
        Assertions.assertEquals("gymare", model.tableLevelSharingProperties().externalTablesToExclude().get(0));
        Assertions
            .assertEquals("fwqmzqalkrmn", model.tableLevelSharingProperties().materializedViewsToInclude().get(0));
        Assertions.assertEquals("pxacqqudfn", model.tableLevelSharingProperties().materializedViewsToExclude().get(0));
        Assertions.assertEquals("m", model.databaseNameOverride());
        Assertions.assertEquals("rtuzqogs", model.databaseNamePrefix());
    }
}