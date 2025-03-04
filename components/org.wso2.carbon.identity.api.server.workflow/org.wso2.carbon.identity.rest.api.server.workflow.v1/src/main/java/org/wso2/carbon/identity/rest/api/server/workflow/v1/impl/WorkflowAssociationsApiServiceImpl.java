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

package org.wso2.carbon.identity.rest.api.server.workflow.v1.impl;

import org.wso2.carbon.identity.rest.api.server.workflow.v1.*;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.WorkflowAssociationsApiService;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.core.WorkflowService;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.factories.WorkflowServiceFactory;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.*;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.WorkflowAssociationCreation;
import org.wso2.carbon.identity.rest.api.server.workflow.v1.model.WorkflowAssociationPatch;

import javax.ws.rs.core.Response;

public class WorkflowAssociationsApiServiceImpl implements WorkflowAssociationsApiService {

    private final WorkflowService workflowService;

    public WorkflowAssociationsApiServiceImpl() {

        try {
            this.workflowService = WorkflowServiceFactory.getWorkflowService();
        } catch (IllegalStateException e) {
            throw new RuntimeException("Error occurred while initiating WorkflowService.", e);
        }
    }

    @Override
    public Response createWorkflowAssociation(WorkflowAssociationCreation workflowAssociationCreation) {

        return Response.ok().entity(workflowService.addAssociation(workflowAssociationCreation)).build();
    }

    @Override
    public Response deleteWorkflowAssociationById(String associationId) {

        return Response.ok().entity(workflowService.removeAssociation(associationId)).build();
    }

    @Override
    public Response getWorkflowAssociationById(String associationId) {

        return Response.ok().entity(workflowService.getAssociation(associationId)).build();
    }

    @Override
    public Response listWorkflowAssociations(Integer limit, Integer offset, String filter) {

        return Response.ok().entity(workflowService.listPaginatedAssociations(limit, offset, filter)).build();
    }

    @Override
    public Response patchAssociation(String associationId, WorkflowAssociationPatch workflowAssociationPatch) {

        return Response.ok().entity(workflowService.changeAssociation(associationId, workflowAssociationPatch)).build();
    }
}
