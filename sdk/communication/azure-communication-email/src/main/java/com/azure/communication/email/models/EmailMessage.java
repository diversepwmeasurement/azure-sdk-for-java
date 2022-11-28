// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Message payload for sending an email. */
@Fluent
public final class EmailMessage {
    /*
     * Custom email headers to be passed.
     */
    @JsonProperty(value = "headers")
    private Iterable<EmailCustomHeader> customHeaders;

    /*
     * Sender email address from a verified domain.
     */
    @JsonProperty(value = "sender", required = true)
    private String sender;

    /*
     * Email content to be sent.
     */
    @JsonProperty(value = "content", required = true)
    private EmailContent content;

    /*
     * The importance type for the email.
     */
    @JsonProperty(value = "importance")
    private EmailImportance importance;

    /*
     * Recipients for the email.
     */
    @JsonProperty(value = "recipients", required = true)
    private EmailRecipients recipients;

    /*
     * list of attachments
     */
    @JsonProperty(value = "attachments")
    private Iterable<EmailAttachment> attachments;

    /*
     * Email addresses where recipients' replies will be sent to.
     */
    @JsonProperty(value = "replyTo")
    private Iterable<EmailAddress> replyTo;

    /*
     * Indicates whether user engagement tracking should be disabled for this
     * request if the resource-level user engagement tracking setting was
     * already enabled in the control plane.
     */
    @JsonProperty(value = "disableUserEngagementTracking")
    private Boolean disableUserEngagementTracking;

    /**
     * Constructor for EmailMessage
     * @param sender the sender email address from a verified domain
     * @param content the email content to be sent
     * @param recipients the recipients for the email
     */
    public EmailMessage(String sender, EmailContent content, EmailRecipients recipients) {
        this.sender = sender;
        this.content = content;
        this.recipients = recipients;
    }

    /**
     * Get the customHeaders property: Custom email headers to be passed.
     *
     * @return the customHeaders value.
     */
    public Iterable<EmailCustomHeader> getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * Set the customHeaders property: Custom email headers to be passed.
     *
     * @param customHeaders the customHeaders value to set.
     * @return the EmailMessage object itself.
     */
    public EmailMessage setCustomHeaders(Iterable<EmailCustomHeader> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get the sender property: Sender email address from a verified domain.
     *
     * @return the sender value.
     */
    public String getSender() {
        return this.sender;
    }

    /**
     * Get the content property: Email content to be sent.
     *
     * @return the content value.
     */
    public EmailContent getContent() {
        return this.content;
    }

    /**
     * Get the importance property: The importance type for the email.
     *
     * @return the importance value.
     */
    public EmailImportance getImportance() {
        return this.importance;
    }

    /**
     * Set the importance property: The importance type for the email.
     *
     * @param importance the importance value to set.
     * @return the EmailMessage object itself.
     */
    public EmailMessage setImportance(EmailImportance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the recipients property: Recipients for the email.
     *
     * @return the recipients value.
     */
    public EmailRecipients getRecipients() {
        return this.recipients;
    }

    /**
     * Get the attachments property: list of attachments.
     *
     * @return the attachments value.
     */
    public Iterable<EmailAttachment> getAttachments() {
        return this.attachments;
    }

    /**
     * Set the attachments property: list of attachments.
     *
     * @param attachments the attachments value to set.
     * @return the EmailMessage object itself.
     */
    public EmailMessage setAttachments(Iterable<EmailAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get the replyTo property: Email addresses where recipients' replies will be sent to.
     *
     * @return the replyTo value.
     */
    public Iterable<EmailAddress> getReplyTo() {
        return this.replyTo;
    }

    /**
     * Set the replyTo property: Email addresses where recipients' replies will be sent to.
     *
     * @param replyTo the replyTo value to set.
     * @return the EmailMessage object itself.
     */
    public EmailMessage setReplyTo(Iterable<EmailAddress> replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Get the disableUserEngagementTracking property: Indicates whether user engagement tracking should be disabled for
     * this request if the resource-level user engagement tracking setting was already enabled in the control plane.
     *
     * @return the disableUserEngagementTracking value.
     */
    public Boolean isDisableUserEngagementTracking() {
        return this.disableUserEngagementTracking;
    }

    /**
     * Set the disableUserEngagementTracking property: Indicates whether user engagement tracking should be disabled for
     * this request if the resource-level user engagement tracking setting was already enabled in the control plane.
     *
     * @param disableUserEngagementTracking the disableUserEngagementTracking value to set.
     * @return the EmailMessage object itself.
     */
    public EmailMessage setDisableUserEngagementTracking(Boolean disableUserEngagementTracking) {
        this.disableUserEngagementTracking = disableUserEngagementTracking;
        return this;
    }
}
