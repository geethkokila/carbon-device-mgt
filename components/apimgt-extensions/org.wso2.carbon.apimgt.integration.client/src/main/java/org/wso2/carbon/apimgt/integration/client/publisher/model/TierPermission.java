/**
 * WSO2 API Manager - Publisher API
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: 0.10.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.apimgt.integration.client.publisher.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * TierPermission
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-24T00:03:49.624+05:30")
public class TierPermission   {
  /**
   * Gets or Sets permissionType
   */
  public enum PermissionTypeEnum {
    ALLOW("allow"),
    
    DENY("deny");

    private String value;

    PermissionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionTypeEnum fromValue(String text) {
      for (PermissionTypeEnum b : PermissionTypeEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("permissionType")
  private PermissionTypeEnum permissionType = null;

  @JsonProperty("roles")
  private List<String> roles = new ArrayList<String>();

  public TierPermission permissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
    return this;
  }

   /**
   * Get permissionType
   * @return permissionType
  **/
  @ApiModelProperty(example = "deny", required = true, value = "")
  public PermissionTypeEnum getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(PermissionTypeEnum permissionType) {
    this.permissionType = permissionType;
  }

  public TierPermission roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public TierPermission addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TierPermission tierPermission = (TierPermission) o;
    return Objects.equals(this.permissionType, tierPermission.permissionType) &&
        Objects.equals(this.roles, tierPermission.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionType, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierPermission {\n");

    sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

