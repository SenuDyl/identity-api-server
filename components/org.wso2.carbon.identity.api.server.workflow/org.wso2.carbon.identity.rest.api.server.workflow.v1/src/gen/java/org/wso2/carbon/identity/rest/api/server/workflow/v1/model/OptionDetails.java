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

package org.wso2.carbon.identity.rest.api.server.workflow.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import java.util.Objects;
import javax.validation.Valid;

public class OptionDetails  {
  
    private String entity;
    private String values;

    /**
    **/
    public OptionDetails entity(String entity) {

        this.entity = entity;
        return this;
    }
    
    @ApiModelProperty(example = "roles", required = true, value = "")
    @JsonProperty("entity")
    @Valid
    @NotNull(message = "Property entity cannot be null.")

    public String getEntity() {
        return entity;
    }
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
    **/
    public OptionDetails values(String values) {

        this.values = values;
        return this;
    }
    
    @ApiModelProperty(example = "admin", required = true, value = "")
    @JsonProperty("values")
    @Valid
    @NotNull(message = "Property values cannot be null.")

    public String getValues() {
        return values;
    }
    public void setValues(String values) {
        this.values = values;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionDetails optionDetails = (OptionDetails) o;
        return Objects.equals(this.entity, optionDetails.entity) &&
            Objects.equals(this.values, optionDetails.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, values);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class OptionDetails {\n");
        
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

