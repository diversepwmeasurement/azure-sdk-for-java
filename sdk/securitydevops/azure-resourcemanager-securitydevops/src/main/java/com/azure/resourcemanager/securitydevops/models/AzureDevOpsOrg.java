// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsOrgInner;

/** An immutable client-side representation of AzureDevOpsOrg. */
public interface AzureDevOpsOrg {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: AzureDevOps Org properties.
     *
     * @return the properties value.
     */
    AzureDevOpsOrgProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsOrgInner object.
     *
     * @return the inner object.
     */
    AzureDevOpsOrgInner innerModel();

    /** The entirety of the AzureDevOpsOrg definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AzureDevOpsOrg definition stages. */
    interface DefinitionStages {
        /** The first stage of the AzureDevOpsOrg definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AzureDevOpsOrg definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, azureDevOpsConnectorName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param azureDevOpsConnectorName Name of the AzureDevOps Connector.
             * @return the next definition stage.
             */
            WithCreate withExistingAzureDevOpsConnector(String resourceGroupName, String azureDevOpsConnectorName);
        }
        /**
         * The stage of the AzureDevOpsOrg definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AzureDevOpsOrg create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AzureDevOpsOrg create(Context context);
        }
        /** The stage of the AzureDevOpsOrg definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: AzureDevOps Org properties..
             *
             * @param properties AzureDevOps Org properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(AzureDevOpsOrgProperties properties);
        }
    }
    /**
     * Begins update for the AzureDevOpsOrg resource.
     *
     * @return the stage of resource update.
     */
    AzureDevOpsOrg.Update update();

    /** The template for AzureDevOpsOrg update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AzureDevOpsOrg apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AzureDevOpsOrg apply(Context context);
    }
    /** The AzureDevOpsOrg update stages. */
    interface UpdateStages {
        /** The stage of the AzureDevOpsOrg update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: AzureDevOps Org properties..
             *
             * @param properties AzureDevOps Org properties.
             * @return the next definition stage.
             */
            Update withProperties(AzureDevOpsOrgProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AzureDevOpsOrg refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AzureDevOpsOrg refresh(Context context);
}