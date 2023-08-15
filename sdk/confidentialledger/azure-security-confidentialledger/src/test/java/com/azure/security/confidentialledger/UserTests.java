// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public final class UserTests extends ConfidentialLedgerClientTestBase {
    @Test
    public void testGetUserTests() throws Exception {
        String userAad = ConfidentialLedgerEnvironment.getConfidentialLedgerAdminOid();
        RequestOptions requestOptions = new RequestOptions();

        Response<BinaryData> response = confidentialLedgerClient.getUserWithResponse(userAad, requestOptions);

        BinaryData parsedResponse = response.getValue();

        Assertions.assertEquals(200, response.getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseBodyJson = null;

        try {
            responseBodyJson = objectMapper.readTree(parsedResponse.toBytes());
        } catch (IOException e) {
            e.printStackTrace();
            Assertions.assertTrue(false);
        }

        Assertions.assertEquals(responseBodyJson.get("assignedRole").asText(), "Administrator");
        Assertions.assertEquals(responseBodyJson.get("userId").asText(), userAad);
    }
}
