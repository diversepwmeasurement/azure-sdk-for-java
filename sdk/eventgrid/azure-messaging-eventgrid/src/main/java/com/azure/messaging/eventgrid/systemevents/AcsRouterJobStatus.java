// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Router Job Received Job Status. */
public final class AcsRouterJobStatus extends ExpandableStringEnum<AcsRouterJobStatus> {
    /** Static value PendingClassification for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus PENDING_CLASSIFICATION = fromString("PendingClassification");

    /** Static value Queued for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus QUEUED = fromString("Queued");

    /** Static value Assigned for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus ASSIGNED = fromString("Assigned");

    /** Static value Completed for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus COMPLETED = fromString("Completed");

    /** Static value Closed for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus CLOSED = fromString("Closed");

    /** Static value Cancelled for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus CANCELLED = fromString("Cancelled");

    /** Static value ClassificationFailed for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus CLASSIFICATION_FAILED = fromString("ClassificationFailed");

    /** Static value Created for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus CREATED = fromString("Created");

    /** Static value PendingSchedule for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus PENDING_SCHEDULE = fromString("PendingSchedule");

    /** Static value Scheduled for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus SCHEDULED = fromString("Scheduled");

    /** Static value ScheduleFailed for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus SCHEDULE_FAILED = fromString("ScheduleFailed");

    /** Static value WaitingForActivation for AcsRouterJobStatus. */
    public static final AcsRouterJobStatus WAITING_FOR_ACTIVATION = fromString("WaitingForActivation");

    /**
     * Creates a new instance of AcsRouterJobStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AcsRouterJobStatus() {}

    /**
     * Creates or finds a AcsRouterJobStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AcsRouterJobStatus.
     */
    @JsonCreator
    public static AcsRouterJobStatus fromString(String name) {
        return fromString(name, AcsRouterJobStatus.class);
    }

    /**
     * Gets known AcsRouterJobStatus values.
     *
     * @return known AcsRouterJobStatus values.
     */
    public static Collection<AcsRouterJobStatus> values() {
        return values(AcsRouterJobStatus.class);
    }
}
