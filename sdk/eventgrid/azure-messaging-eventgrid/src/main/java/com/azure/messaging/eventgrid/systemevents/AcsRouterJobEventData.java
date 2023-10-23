// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Schema of common properties of all Router Job events. */
@Fluent
public class AcsRouterJobEventData extends AcsRouterEventData {
    /*
     * Router Job events Queue Id
     */
    @JsonProperty(value = "queueId")
    private String queueId;

    /*
     * Router Job events Labels
     */
    @JsonProperty(value = "labels")
    private Map<String, String> labels;

    /*
     * Router Jobs events Tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /** Creates an instance of AcsRouterJobEventData class. */
    public AcsRouterJobEventData() {}

    /**
     * Get the queueId property: Router Job events Queue Id.
     *
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Router Job events Queue Id.
     *
     * @param queueId the queueId value to set.
     * @return the AcsRouterJobEventData object itself.
     */
    public AcsRouterJobEventData setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the labels property: Router Job events Labels.
     *
     * @return the labels value.
     */
    public Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: Router Job events Labels.
     *
     * @param labels the labels value to set.
     * @return the AcsRouterJobEventData object itself.
     */
    public AcsRouterJobEventData setLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: Router Jobs events Tags.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Router Jobs events Tags.
     *
     * @param tags the tags value to set.
     * @return the AcsRouterJobEventData object itself.
     */
    public AcsRouterJobEventData setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsRouterJobEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }
}
