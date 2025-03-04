/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.workflow.common;

/**
 * Common constants for workflow API.
 */
public class Constants {

    public static final String WORKFLOW_PREFIX = "WF";

    private Constants() {

    }

    /**
     * Enum for error messages.
     */
    public enum ErrorMessage {

        ERROR_CODE_ERROR_LISTING_WORKFLOWS("50020", "Unable to list existing workflows",
                "Encountered an error while listing the workflows."),
        ERROR_CODE_ERROR_REMOVING_WORKFLOW("50021", "Unable to delete the workflow","Encountered an error while " +
                "deleting the workflow for the identifier %s."),
        ERROR_CODE_WORKFLOW_NOT_FOUND("50022", "Resource not found.", "Unable to find a resource matching the provided " +
                "workflow identifier %s."),
        ERROR_CODE_ERROR_RETRIEVING_WORKFLOW("50023",
                "Unable to retrieve workflow.",
                "Server encountered an error while retrieving the workflow for identifier %s."),
        ERROR_CODE_ERROR_ADDING_WORKFLOW("50024", "Unable to add workflow",
                "encountered an error while adding the workflow."),
        ERROR_CODE_ERROR_UPDATING_WORKFLOW("50025", "Unable to update workflow", "Server " +
                "encountered an error while updating the workflow for identifier %s."),
        ERROR_CODE_ERROR_ADDING_ASSOCIATION("50026", "Unable to add workflow association", "Server " +
                "encountered an error while adding the workflow association."),
        ERROR_CODE_ERROR_LISTING_ASSOCIATIONS("50027", "Unable to list existing workflows associations",
                "Encountered an error while listing the workflow associations."),
        ERROR_CODE_ERROR_REMOVING_ASSOCIATION("50028", "Unable to delete the workflow association","Encountered an " +
                "error while deleting the workflow association."),
        ERROR_CODE_ERROR_RETRIEVING_ASSOCIATION("50029",
                "Unable to retrieve workflow.",
                "Server encountered an error while retrieving the workflow association for identifier %s."),
        ERROR_CODE_ERROR_UPDATING_ASSOCIATION("50030", "Unable to update workflow association", "Server " +
                                                   "encountered an error while updating the workflow association."),
        ERROR_CODE_ASSOCIATION_NOT_FOUND("50031", "Resource not found.", "Unable to find a resource matching the " +
                "provided workflow association identifier %s.");

        private final String code;
        private final String message;
        private final String description;

        ErrorMessage(String code, String message, String description) {
            this.code = code;
            this.message = message;
            this.description = description;
        }

        public String getCode() {
            return WORKFLOW_PREFIX + code;
        }

        public String getMessage() {
            return message;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return code + " | " + message;
        }
    }
}
