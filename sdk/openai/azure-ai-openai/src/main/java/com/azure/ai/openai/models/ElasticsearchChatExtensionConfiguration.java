// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A specific representation of configurable options for Elasticsearch when using it as an Azure OpenAI chat
 * extension.
 */
@Immutable
public final class ElasticsearchChatExtensionConfiguration extends AzureChatExtensionConfiguration {

    /*
     * The parameters to use when configuring Elasticsearch®.
     */
    @Generated
    private final ElasticsearchChatExtensionParameters parameters;

    /**
     * Get the parameters property: The parameters to use when configuring Elasticsearch®.
     *
     * @return the parameters value.
     */
    @Generated
    public ElasticsearchChatExtensionParameters getParameters() {
        return this.parameters;
    }

    /**
     * Creates an instance of ElasticsearchChatExtensionConfiguration class.
     *
     * @param parameters the parameters value to set.
     */
    @Generated
    public ElasticsearchChatExtensionConfiguration(ElasticsearchChatExtensionParameters parameters) {
        this.parameters = parameters;
    }

    /*
     *   The label for the type of an Azure chat extension. This typically corresponds to a matching Azure resource.
     *   Azure chat extensions are only compatible with Azure OpenAI.
     */
    @Generated
    private AzureChatExtensionType type = AzureChatExtensionType.ELASTICSEARCH;

    /**
     * Get the type property: The label for the type of an Azure chat extension. This typically corresponds to a
     * matching Azure resource.
     * Azure chat extensions are only compatible with Azure OpenAI.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public AzureChatExtensionType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("parameters", this.parameters);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ElasticsearchChatExtensionConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ElasticsearchChatExtensionConfiguration if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ElasticsearchChatExtensionConfiguration.
     */
    @Generated
    public static ElasticsearchChatExtensionConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ElasticsearchChatExtensionParameters parameters = null;
            AzureChatExtensionType type = AzureChatExtensionType.ELASTICSEARCH;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("parameters".equals(fieldName)) {
                    parameters = ElasticsearchChatExtensionParameters.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = AzureChatExtensionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            ElasticsearchChatExtensionConfiguration deserializedElasticsearchChatExtensionConfiguration
                = new ElasticsearchChatExtensionConfiguration(parameters);
            deserializedElasticsearchChatExtensionConfiguration.type = type;
            return deserializedElasticsearchChatExtensionConfiguration;
        });
    }
}
