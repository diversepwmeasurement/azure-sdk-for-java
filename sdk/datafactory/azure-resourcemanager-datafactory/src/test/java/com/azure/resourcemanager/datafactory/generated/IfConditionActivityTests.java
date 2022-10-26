// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.Activity;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.IfConditionActivity;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IfConditionActivityTests {
    @Test
    public void testDeserialize() {
        IfConditionActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"IfCondition\",\"typeProperties\":{\"expression\":{\"value\":\"ybnxgztlcgc\"},\"ifTrueActivities\":[{\"type\":\"Activity\",\"name\":\"hfjv\",\"description\":\"wjzebecuvlb\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"cljkxpyl\",\"description\":\"oxz\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"yxjijeypdvrbker\",\"description\":\"dkgaw\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"ildfk\",\"description\":\"feygzqp\",\"dependsOn\":[],\"userProperties\":[],\"\":{}}],\"ifFalseActivities\":[{\"type\":\"Activity\",\"name\":\"naybdjnxu\",\"description\":\"ntqontwhym\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"lwivqt\",\"description\":\"lhl\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"ybajasqubf\",\"description\":\"cywhj\",\"dependsOn\":[],\"userProperties\":[],\"\":{}},{\"type\":\"Activity\",\"name\":\"hqohtfxcpup\",\"description\":\"i\",\"dependsOn\":[],\"userProperties\":[],\"\":{}}]},\"name\":\"pwdlvwti\",\"description\":\"mosaonh\",\"dependsOn\":[{\"activity\":\"mppultas\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Completed\"],\"\":{}},{\"activity\":\"a\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Skipped\",\"Skipped\"],\"\":{}},{\"activity\":\"lcyizyddcvxo\",\"dependencyConditions\":[\"Skipped\",\"Failed\",\"Failed\"],\"\":{}},{\"activity\":\"xbydesqlvgecpw\",\"dependencyConditions\":[\"Failed\"],\"\":{}}],\"userProperties\":[{\"name\":\"nm\"},{\"name\":\"sdobygoogxq\"},{\"name\":\"pjxvazyjf\"},{\"name\":\"csa\"}],\"\":{}}")
                .toObject(IfConditionActivity.class);
        Assertions.assertEquals("pwdlvwti", model.name());
        Assertions.assertEquals("mosaonh", model.description());
        Assertions.assertEquals("mppultas", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nm", model.userProperties().get(0).name());
        Assertions.assertEquals("ybnxgztlcgc", model.expression().value());
        Assertions.assertEquals("hfjv", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("wjzebecuvlb", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals("naybdjnxu", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("ntqontwhym", model.ifFalseActivities().get(0).description());
    }

    @Test
    public void testSerialize() {
        IfConditionActivity model =
            new IfConditionActivity()
                .withName("pwdlvwti")
                .withDescription("mosaonh")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("mppultas")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("a")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SUCCEEDED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("lcyizyddcvxo")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.FAILED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("xbydesqlvgecpw")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("nm"),
                            new UserProperty().withName("sdobygoogxq"),
                            new UserProperty().withName("pjxvazyjf"),
                            new UserProperty().withName("csa")))
                .withExpression(new Expression().withValue("ybnxgztlcgc"))
                .withIfTrueActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("hfjv")
                                .withDescription("wjzebecuvlb")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("cljkxpyl")
                                .withDescription("oxz")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("yxjijeypdvrbker")
                                .withDescription("dkgaw")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("ildfk")
                                .withDescription("feygzqp")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity"))))
                .withIfFalseActivities(
                    Arrays
                        .asList(
                            new Activity()
                                .withName("naybdjnxu")
                                .withDescription("ntqontwhym")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("lwivqt")
                                .withDescription("lhl")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("ybajasqubf")
                                .withDescription("cywhj")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity")),
                            new Activity()
                                .withName("hqohtfxcpup")
                                .withDescription("i")
                                .withDependsOn(Arrays.asList())
                                .withUserProperties(Arrays.asList())
                                .withAdditionalProperties(mapOf("type", "Activity"))));
        model = BinaryData.fromObject(model).toObject(IfConditionActivity.class);
        Assertions.assertEquals("pwdlvwti", model.name());
        Assertions.assertEquals("mosaonh", model.description());
        Assertions.assertEquals("mppultas", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("nm", model.userProperties().get(0).name());
        Assertions.assertEquals("ybnxgztlcgc", model.expression().value());
        Assertions.assertEquals("hfjv", model.ifTrueActivities().get(0).name());
        Assertions.assertEquals("wjzebecuvlb", model.ifTrueActivities().get(0).description());
        Assertions.assertEquals("naybdjnxu", model.ifFalseActivities().get(0).name());
        Assertions.assertEquals("ntqontwhym", model.ifFalseActivities().get(0).description());
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