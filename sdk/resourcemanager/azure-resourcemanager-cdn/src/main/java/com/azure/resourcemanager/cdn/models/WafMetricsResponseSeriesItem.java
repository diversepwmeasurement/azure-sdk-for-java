// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The WafMetricsResponseSeriesItem model. */
@Fluent
public final class WafMetricsResponseSeriesItem {
    /*
     * The metric property.
     */
    @JsonProperty(value = "metric")
    private String metric;

    /*
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private WafMetricsResponseSeriesItemUnit unit;

    /*
     * The groups property.
     */
    @JsonProperty(value = "groups")
    private List<WafMetricsResponseSeriesPropertiesItemsItem> groups;

    /*
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<WafMetricsResponseSeriesItemData> data;

    /**
     * Get the metric property: The metric property.
     *
     * @return the metric value.
     */
    public String metric() {
        return this.metric;
    }

    /**
     * Set the metric property: The metric property.
     *
     * @param metric the metric value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     *
     * @return the unit value.
     */
    public WafMetricsResponseSeriesItemUnit unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     *
     * @param unit the unit value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withUnit(WafMetricsResponseSeriesItemUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the groups property: The groups property.
     *
     * @return the groups value.
     */
    public List<WafMetricsResponseSeriesPropertiesItemsItem> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The groups property.
     *
     * @param groups the groups value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withGroups(List<WafMetricsResponseSeriesPropertiesItemsItem> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the data property: The data property.
     *
     * @return the data value.
     */
    public List<WafMetricsResponseSeriesItemData> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     *
     * @param data the data value to set.
     * @return the WafMetricsResponseSeriesItem object itself.
     */
    public WafMetricsResponseSeriesItem withData(List<WafMetricsResponseSeriesItemData> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}
