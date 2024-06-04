/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.identity.rest.api.server.notification.template.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class SimpleTemplate  {
  
    private String locale;
    private String self;

    /**
    * Locale of the template.
    **/
    public SimpleTemplate locale(String locale) {

        this.locale = locale;
        return this;
    }
    
    @ApiModelProperty(example = "en_US", required = true, value = "Locale of the template.")
    @JsonProperty("locale")
    @Valid
    @NotNull(message = "Property locale cannot be null.")

    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
    * Location of the created/updated resource.
    **/
    public SimpleTemplate self(String self) {

        this.self = self;
        return this;
    }
    
    @ApiModelProperty(example = "/t/{tenant-domain}/api/server/v1/notification/sms/template-types/YWNjb3VudGNvbmZpcm1hdGlvbg/templates/en_US", required = true, value = "Location of the created/updated resource.")
    @JsonProperty("self")
    @Valid
    @NotNull(message = "Property self cannot be null.")

    public String getSelf() {
        return self;
    }
    public void setSelf(String self) {
        this.self = self;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleTemplate simpleTemplate = (SimpleTemplate) o;
        return Objects.equals(this.locale, simpleTemplate.locale) &&
            Objects.equals(this.self, simpleTemplate.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, self);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleTemplate {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

