// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.LogSpecification;
import com.azure.resourcemanager.healthcareapis.models.MetricDimension;
import com.azure.resourcemanager.healthcareapis.models.MetricSpecification;
import com.azure.resourcemanager.healthcareapis.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model = BinaryData.fromString(
            "{\"logSpecifications\":[{\"name\":\"u\",\"displayName\":\"kopbminrf\",\"blobDuration\":\"oyuhhziui\"},{\"name\":\"ozbhdmsmlmzq\",\"displayName\":\"ft\",\"blobDuration\":\"ae\"},{\"name\":\"iahxicsl\",\"displayName\":\"oqzpiyylha\",\"blobDuration\":\"swhccsphk\"}],\"metricSpecifications\":[{\"name\":\"itqscywuggwoluhc\",\"displayName\":\"wem\",\"displayDescription\":\"i\",\"unit\":\"brgz\",\"category\":\"msweypqwdxggicc\",\"aggregationType\":\"xqhuexm\",\"supportedAggregationTypes\":[\"lstvlzywe\",\"hz\",\"ncsdtclusiyp\"],\"supportedTimeGrainTypes\":[\"gytguslfead\",\"ygqukyhejh\",\"isxgfp\",\"lolp\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"r\",\"dimensions\":[{\"name\":\"jzraehtwdwrf\",\"displayName\":\"wib\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"h\",\"sourceMdmNamespace\":\"fwpracstwi\",\"enableRegionalMdmAccount\":true,\"resourceIdDimensionNameOverride\":\"evxccedcp\"},{\"name\":\"dyodnwzxltj\",\"displayName\":\"nhltiugcxn\",\"displayDescription\":\"vwxqibyqunyo\",\"unit\":\"wlmdjrkv\",\"category\":\"bvfvpdbod\",\"aggregationType\":\"izsjqlhkrr\",\"supportedAggregationTypes\":[\"eibq\",\"p\"],\"supportedTimeGrainTypes\":[\"hvxndzwmkrefajpj\",\"rwkq\",\"yhgbijtjivfx\",\"sjabibs\"],\"fillGapWithZero\":true,\"metricFilterPattern\":\"wfsdjpvkvpbj\",\"dimensions\":[{\"name\":\"bzkdvn\",\"displayName\":\"abudurgk\",\"toBeExportedForShoebox\":true},{\"name\":\"kzhjj\",\"displayName\":\"ffhmouwqlgzr\",\"toBeExportedForShoebox\":false},{\"name\":\"yebizikayuh\",\"displayName\":\"bjbsybb\",\"toBeExportedForShoebox\":false},{\"name\":\"t\",\"displayName\":\"gmfpgvmp\",\"toBeExportedForShoebox\":false}],\"isInternal\":false,\"sourceMdmAccount\":\"haq\",\"sourceMdmNamespace\":\"ss\",\"enableRegionalMdmAccount\":false,\"resourceIdDimensionNameOverride\":\"wbdsr\"},{\"name\":\"pdrhne\",\"displayName\":\"owqkdwytisi\",\"displayDescription\":\"rcgp\",\"unit\":\"pzimejzanlfzxi\",\"category\":\"rmbzo\",\"aggregationType\":\"kixrj\",\"supportedAggregationTypes\":[\"rgz\",\"frl\"],\"supportedTimeGrainTypes\":[\"zrnw\",\"iin\"],\"fillGapWithZero\":false,\"metricFilterPattern\":\"pj\",\"dimensions\":[{\"name\":\"tlhflsjcdhszf\",\"displayName\":\"fbgofeljagrqmqh\",\"toBeExportedForShoebox\":false},{\"name\":\"iiiojnalghf\",\"displayName\":\"tvsexsowuel\",\"toBeExportedForShoebox\":true},{\"name\":\"ahhxvrh\",\"displayName\":\"kwpjgwwspughftqs\",\"toBeExportedForShoebox\":true}],\"isInternal\":true,\"sourceMdmAccount\":\"xukndxdigr\",\"sourceMdmNamespace\":\"uufzdmsyqtfihw\",\"enableRegionalMdmAccount\":false,\"resourceIdDimensionNameOverride\":\"z\"}]}")
            .toObject(ServiceSpecification.class);
        Assertions.assertEquals("u", model.logSpecifications().get(0).name());
        Assertions.assertEquals("kopbminrf", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("oyuhhziui", model.logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("itqscywuggwoluhc", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("wem", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("i", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("brgz", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("msweypqwdxggicc", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("xqhuexm", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("lstvlzywe", model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("gytguslfead", model.metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("r", model.metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("jzraehtwdwrf", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("wib", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("h", model.metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("fwpracstwi", model.metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("evxccedcp", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model
            = new ServiceSpecification().withLogSpecifications(Arrays
                .asList(new LogSpecification().withName("u").withDisplayName("kopbminrf").withBlobDuration("oyuhhziui"),
                    new LogSpecification().withName("ozbhdmsmlmzq").withDisplayName("ft").withBlobDuration("ae"),
                    new LogSpecification().withName("iahxicsl")
                        .withDisplayName("oqzpiyylha")
                        .withBlobDuration("swhccsphk")))
                .withMetricSpecifications(
                    Arrays
                        .asList(
                            new MetricSpecification().withName("itqscywuggwoluhc")
                                .withDisplayName("wem")
                                .withDisplayDescription("i")
                                .withUnit("brgz")
                                .withCategory("msweypqwdxggicc")
                                .withAggregationType("xqhuexm")
                                .withSupportedAggregationTypes(Arrays.asList("lstvlzywe", "hz", "ncsdtclusiyp"))
                                .withSupportedTimeGrainTypes(
                                    Arrays.asList("gytguslfead", "ygqukyhejh", "isxgfp", "lolp"))
                                .withFillGapWithZero(false)
                                .withMetricFilterPattern("r")
                                .withDimensions(Arrays.asList(new MetricDimension().withName("jzraehtwdwrf")
                                    .withDisplayName("wib")
                                    .withToBeExportedForShoebox(false)))
                                .withIsInternal(false)
                                .withSourceMdmAccount("h")
                                .withSourceMdmNamespace("fwpracstwi")
                                .withEnableRegionalMdmAccount(true)
                                .withResourceIdDimensionNameOverride("evxccedcp"),
                            new MetricSpecification().withName("dyodnwzxltj")
                                .withDisplayName("nhltiugcxn")
                                .withDisplayDescription("vwxqibyqunyo")
                                .withUnit("wlmdjrkv")
                                .withCategory("bvfvpdbod")
                                .withAggregationType("izsjqlhkrr")
                                .withSupportedAggregationTypes(Arrays.asList("eibq", "p"))
                                .withSupportedTimeGrainTypes(
                                    Arrays.asList("hvxndzwmkrefajpj", "rwkq", "yhgbijtjivfx", "sjabibs"))
                                .withFillGapWithZero(true)
                                .withMetricFilterPattern("wfsdjpvkvpbj")
                                .withDimensions(Arrays.asList(
                                    new MetricDimension().withName("bzkdvn")
                                        .withDisplayName("abudurgk")
                                        .withToBeExportedForShoebox(true),
                                    new MetricDimension().withName("kzhjj")
                                        .withDisplayName("ffhmouwqlgzr")
                                        .withToBeExportedForShoebox(false),
                                    new MetricDimension().withName("yebizikayuh")
                                        .withDisplayName("bjbsybb")
                                        .withToBeExportedForShoebox(false),
                                    new MetricDimension().withName("t")
                                        .withDisplayName("gmfpgvmp")
                                        .withToBeExportedForShoebox(false)))
                                .withIsInternal(false)
                                .withSourceMdmAccount("haq")
                                .withSourceMdmNamespace("ss")
                                .withEnableRegionalMdmAccount(false)
                                .withResourceIdDimensionNameOverride("wbdsr"),
                            new MetricSpecification().withName("pdrhne")
                                .withDisplayName("owqkdwytisi")
                                .withDisplayDescription("rcgp")
                                .withUnit("pzimejzanlfzxi")
                                .withCategory("rmbzo")
                                .withAggregationType("kixrj")
                                .withSupportedAggregationTypes(Arrays.asList("rgz", "frl"))
                                .withSupportedTimeGrainTypes(Arrays.asList("zrnw", "iin"))
                                .withFillGapWithZero(false)
                                .withMetricFilterPattern("pj")
                                .withDimensions(Arrays.asList(
                                    new MetricDimension().withName("tlhflsjcdhszf")
                                        .withDisplayName("fbgofeljagrqmqh")
                                        .withToBeExportedForShoebox(false),
                                    new MetricDimension().withName("iiiojnalghf")
                                        .withDisplayName("tvsexsowuel")
                                        .withToBeExportedForShoebox(true),
                                    new MetricDimension().withName("ahhxvrh")
                                        .withDisplayName("kwpjgwwspughftqs")
                                        .withToBeExportedForShoebox(true)))
                                .withIsInternal(true)
                                .withSourceMdmAccount("xukndxdigr")
                                .withSourceMdmNamespace("uufzdmsyqtfihw")
                                .withEnableRegionalMdmAccount(false)
                                .withResourceIdDimensionNameOverride("z")));
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
        Assertions.assertEquals("u", model.logSpecifications().get(0).name());
        Assertions.assertEquals("kopbminrf", model.logSpecifications().get(0).displayName());
        Assertions.assertEquals("oyuhhziui", model.logSpecifications().get(0).blobDuration());
        Assertions.assertEquals("itqscywuggwoluhc", model.metricSpecifications().get(0).name());
        Assertions.assertEquals("wem", model.metricSpecifications().get(0).displayName());
        Assertions.assertEquals("i", model.metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("brgz", model.metricSpecifications().get(0).unit());
        Assertions.assertEquals("msweypqwdxggicc", model.metricSpecifications().get(0).category());
        Assertions.assertEquals("xqhuexm", model.metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("lstvlzywe", model.metricSpecifications().get(0).supportedAggregationTypes().get(0));
        Assertions.assertEquals("gytguslfead", model.metricSpecifications().get(0).supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(false, model.metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("r", model.metricSpecifications().get(0).metricFilterPattern());
        Assertions.assertEquals("jzraehtwdwrf", model.metricSpecifications().get(0).dimensions().get(0).name());
        Assertions.assertEquals("wib", model.metricSpecifications().get(0).dimensions().get(0).displayName());
        Assertions.assertEquals(false,
            model.metricSpecifications().get(0).dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals(false, model.metricSpecifications().get(0).isInternal());
        Assertions.assertEquals("h", model.metricSpecifications().get(0).sourceMdmAccount());
        Assertions.assertEquals("fwpracstwi", model.metricSpecifications().get(0).sourceMdmNamespace());
        Assertions.assertEquals(true, model.metricSpecifications().get(0).enableRegionalMdmAccount());
        Assertions.assertEquals("evxccedcp", model.metricSpecifications().get(0).resourceIdDimensionNameOverride());
    }
}
