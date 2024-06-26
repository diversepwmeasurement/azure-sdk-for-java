// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents anomaly timeline item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Anomaly")
@Fluent
public final class AnomalyTimelineItem extends EntityTimelineItem {
    /*
     * The anomaly azure resource id.
     */
    @JsonProperty(value = "azureResourceId", required = true)
    private String azureResourceId;

    /*
     * The anomaly product name.
     */
    @JsonProperty(value = "productName")
    private String productName;

    /*
     * The anomaly description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The anomaly name.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * The anomaly end time.
     */
    @JsonProperty(value = "endTimeUtc", required = true)
    private OffsetDateTime endTimeUtc;

    /*
     * The anomaly start time.
     */
    @JsonProperty(value = "startTimeUtc", required = true)
    private OffsetDateTime startTimeUtc;

    /*
     * The anomaly generated time.
     */
    @JsonProperty(value = "timeGenerated", required = true)
    private OffsetDateTime timeGenerated;

    /*
     * The name of the anomaly vendor.
     */
    @JsonProperty(value = "vendor")
    private String vendor;

    /*
     * The intent of the anomaly.
     */
    @JsonProperty(value = "intent")
    private String intent;

    /*
     * The techniques of the anomaly.
     */
    @JsonProperty(value = "techniques")
    private List<String> techniques;

    /*
     * The reasons that cause the anomaly.
     */
    @JsonProperty(value = "reasons")
    private List<String> reasons;

    /**
     * Get the azureResourceId property: The anomaly azure resource id.
     *
     * @return the azureResourceId value.
     */
    public String azureResourceId() {
        return this.azureResourceId;
    }

    /**
     * Set the azureResourceId property: The anomaly azure resource id.
     *
     * @param azureResourceId the azureResourceId value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withAzureResourceId(String azureResourceId) {
        this.azureResourceId = azureResourceId;
        return this;
    }

    /**
     * Get the productName property: The anomaly product name.
     *
     * @return the productName value.
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set the productName property: The anomaly product name.
     *
     * @param productName the productName value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get the description property: The anomaly description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The anomaly description.
     *
     * @param description the description value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The anomaly name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The anomaly name.
     *
     * @param displayName the displayName value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the endTimeUtc property: The anomaly end time.
     *
     * @return the endTimeUtc value.
     */
    public OffsetDateTime endTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * Set the endTimeUtc property: The anomaly end time.
     *
     * @param endTimeUtc the endTimeUtc value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withEndTimeUtc(OffsetDateTime endTimeUtc) {
        this.endTimeUtc = endTimeUtc;
        return this;
    }

    /**
     * Get the startTimeUtc property: The anomaly start time.
     *
     * @return the startTimeUtc value.
     */
    public OffsetDateTime startTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Set the startTimeUtc property: The anomaly start time.
     *
     * @param startTimeUtc the startTimeUtc value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withStartTimeUtc(OffsetDateTime startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
        return this;
    }

    /**
     * Get the timeGenerated property: The anomaly generated time.
     *
     * @return the timeGenerated value.
     */
    public OffsetDateTime timeGenerated() {
        return this.timeGenerated;
    }

    /**
     * Set the timeGenerated property: The anomaly generated time.
     *
     * @param timeGenerated the timeGenerated value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withTimeGenerated(OffsetDateTime timeGenerated) {
        this.timeGenerated = timeGenerated;
        return this;
    }

    /**
     * Get the vendor property: The name of the anomaly vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Set the vendor property: The name of the anomaly vendor.
     *
     * @param vendor the vendor value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get the intent property: The intent of the anomaly.
     *
     * @return the intent value.
     */
    public String intent() {
        return this.intent;
    }

    /**
     * Set the intent property: The intent of the anomaly.
     *
     * @param intent the intent value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withIntent(String intent) {
        this.intent = intent;
        return this;
    }

    /**
     * Get the techniques property: The techniques of the anomaly.
     *
     * @return the techniques value.
     */
    public List<String> techniques() {
        return this.techniques;
    }

    /**
     * Set the techniques property: The techniques of the anomaly.
     *
     * @param techniques the techniques value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withTechniques(List<String> techniques) {
        this.techniques = techniques;
        return this;
    }

    /**
     * Get the reasons property: The reasons that cause the anomaly.
     *
     * @return the reasons value.
     */
    public List<String> reasons() {
        return this.reasons;
    }

    /**
     * Set the reasons property: The reasons that cause the anomaly.
     *
     * @param reasons the reasons value to set.
     * @return the AnomalyTimelineItem object itself.
     */
    public AnomalyTimelineItem withReasons(List<String> reasons) {
        this.reasons = reasons;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (azureResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property azureResourceId in model AnomalyTimelineItem"));
        }
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property displayName in model AnomalyTimelineItem"));
        }
        if (endTimeUtc() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property endTimeUtc in model AnomalyTimelineItem"));
        }
        if (startTimeUtc() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property startTimeUtc in model AnomalyTimelineItem"));
        }
        if (timeGenerated() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property timeGenerated in model AnomalyTimelineItem"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AnomalyTimelineItem.class);
}
