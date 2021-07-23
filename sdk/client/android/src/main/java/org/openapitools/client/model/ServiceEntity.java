/**
 * Lethean VPM
 * Distributed Virtual Private Marketplace
 *
 * The version of the OpenAPI document: 1
 * Contact: contact@lethean.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import org.openapitools.client.model.CertificatesEntity;
import org.openapitools.client.model.ProxySettingsEntity;
import org.openapitools.client.model.TimeRangeEntity;
import org.openapitools.client.model.VpnSettingsEntity;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ServiceEntity {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  public enum TypeEnum {
     vpn,  proxy, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("cost")
  private String cost = null;
  @SerializedName("firstPrePaidMinutes")
  private BigDecimal firstPrePaidMinutes = null;
  @SerializedName("firstVerificationsNeeded")
  private BigDecimal firstVerificationsNeeded = null;
  @SerializedName("subsequentPrePaidMinutes")
  private BigDecimal subsequentPrePaidMinutes = null;
  @SerializedName("subsequentVerificationsNeeded")
  private BigDecimal subsequentVerificationsNeeded = null;
  @SerializedName("allowRefunds")
  private Boolean allowRefunds = null;
  @SerializedName("downloadSpeed")
  private BigDecimal downloadSpeed = null;
  @SerializedName("uploadSpeed")
  private BigDecimal uploadSpeed = null;
  @SerializedName("proxy")
  private List<ProxySettingsEntity> proxy = null;
  @SerializedName("vpn")
  private List<VpnSettingsEntity> vpn = null;
  @SerializedName("validity")
  private TimeRangeEntity validity = null;
  @SerializedName("disable")
  private Boolean disable = null;
  @SerializedName("certificates")
  private List<CertificatesEntity> certificates = null;

  /**
   * ID of the service
   **/
  @ApiModelProperty(value = "ID of the service")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of the service
   **/
  @ApiModelProperty(required = true, value = "Name of the service")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Type of the service
   **/
  @ApiModelProperty(required = true, value = "Type of the service")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Per minute Cost of the service
   **/
  @ApiModelProperty(required = true, value = "Per minute Cost of the service")
  public String getCost() {
    return cost;
  }
  public void setCost(String cost) {
    this.cost = cost;
  }

  /**
   * Amount of pre-paid minutes for first payment
   * minimum: 10
   * maximum: 1440
   **/
  @ApiModelProperty(value = "Amount of pre-paid minutes for first payment")
  public BigDecimal getFirstPrePaidMinutes() {
    return firstPrePaidMinutes;
  }
  public void setFirstPrePaidMinutes(BigDecimal firstPrePaidMinutes) {
    this.firstPrePaidMinutes = firstPrePaidMinutes;
  }

  /**
   * Number of verifications needed for first payment
   * minimum: 0
   * maximum: 2
   **/
  @ApiModelProperty(value = "Number of verifications needed for first payment")
  public BigDecimal getFirstVerificationsNeeded() {
    return firstVerificationsNeeded;
  }
  public void setFirstVerificationsNeeded(BigDecimal firstVerificationsNeeded) {
    this.firstVerificationsNeeded = firstVerificationsNeeded;
  }

  /**
   * Amount of pre-paid minutes for subsequent payments
   * minimum: 10
   * maximum: 1440
   **/
  @ApiModelProperty(value = "Amount of pre-paid minutes for subsequent payments")
  public BigDecimal getSubsequentPrePaidMinutes() {
    return subsequentPrePaidMinutes;
  }
  public void setSubsequentPrePaidMinutes(BigDecimal subsequentPrePaidMinutes) {
    this.subsequentPrePaidMinutes = subsequentPrePaidMinutes;
  }

  /**
   * Number of verifications needed for subsequent payments
   * minimum: 0
   * maximum: 1
   **/
  @ApiModelProperty(value = "Number of verifications needed for subsequent payments")
  public BigDecimal getSubsequentVerificationsNeeded() {
    return subsequentVerificationsNeeded;
  }
  public void setSubsequentVerificationsNeeded(BigDecimal subsequentVerificationsNeeded) {
    this.subsequentVerificationsNeeded = subsequentVerificationsNeeded;
  }

  /**
   * Whether or not refunds are allowed
   **/
  @ApiModelProperty(value = "Whether or not refunds are allowed")
  public Boolean getAllowRefunds() {
    return allowRefunds;
  }
  public void setAllowRefunds(Boolean allowRefunds) {
    this.allowRefunds = allowRefunds;
  }

  /**
   * Service download speed in Mbits
   * minimum: 0
   * maximum: 99999999999
   **/
  @ApiModelProperty(required = true, value = "Service download speed in Mbits")
  public BigDecimal getDownloadSpeed() {
    return downloadSpeed;
  }
  public void setDownloadSpeed(BigDecimal downloadSpeed) {
    this.downloadSpeed = downloadSpeed;
  }

  /**
   * Service upload speed in Mbits
   * minimum: 0
   * maximum: 99999999999
   **/
  @ApiModelProperty(required = true, value = "Service upload speed in Mbits")
  public BigDecimal getUploadSpeed() {
    return uploadSpeed;
  }
  public void setUploadSpeed(BigDecimal uploadSpeed) {
    this.uploadSpeed = uploadSpeed;
  }

  /**
   * array containing Proxy related settings. only available if service is of type proxy, null otherwise
   **/
  @ApiModelProperty(value = "array containing Proxy related settings. only available if service is of type proxy, null otherwise")
  public List<ProxySettingsEntity> getProxy() {
    return proxy;
  }
  public void setProxy(List<ProxySettingsEntity> proxy) {
    this.proxy = proxy;
  }

  /**
   * array containing VPN related settings. only available if service is of type vpn, null otherwise
   **/
  @ApiModelProperty(value = "array containing VPN related settings. only available if service is of type vpn, null otherwise")
  public List<VpnSettingsEntity> getVpn() {
    return vpn;
  }
  public void setVpn(List<VpnSettingsEntity> vpn) {
    this.vpn = vpn;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimeRangeEntity getValidity() {
    return validity;
  }
  public void setValidity(TimeRangeEntity validity) {
    this.validity = validity;
  }

  /**
   * disable or not the service
   **/
  @ApiModelProperty(required = true, value = "disable or not the service")
  public Boolean getDisable() {
    return disable;
  }
  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  /**
   * inside each service, there should be a field named certificates that has a list of IDs, referencing the certificates at the provider level.
   **/
  @ApiModelProperty(value = "inside each service, there should be a field named certificates that has a list of IDs, referencing the certificates at the provider level.")
  public List<CertificatesEntity> getCertificates() {
    return certificates;
  }
  public void setCertificates(List<CertificatesEntity> certificates) {
    this.certificates = certificates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEntity serviceEntity = (ServiceEntity) o;
    return (this.id == null ? serviceEntity.id == null : this.id.equals(serviceEntity.id)) &&
        (this.name == null ? serviceEntity.name == null : this.name.equals(serviceEntity.name)) &&
        (this.type == null ? serviceEntity.type == null : this.type.equals(serviceEntity.type)) &&
        (this.cost == null ? serviceEntity.cost == null : this.cost.equals(serviceEntity.cost)) &&
        (this.firstPrePaidMinutes == null ? serviceEntity.firstPrePaidMinutes == null : this.firstPrePaidMinutes.equals(serviceEntity.firstPrePaidMinutes)) &&
        (this.firstVerificationsNeeded == null ? serviceEntity.firstVerificationsNeeded == null : this.firstVerificationsNeeded.equals(serviceEntity.firstVerificationsNeeded)) &&
        (this.subsequentPrePaidMinutes == null ? serviceEntity.subsequentPrePaidMinutes == null : this.subsequentPrePaidMinutes.equals(serviceEntity.subsequentPrePaidMinutes)) &&
        (this.subsequentVerificationsNeeded == null ? serviceEntity.subsequentVerificationsNeeded == null : this.subsequentVerificationsNeeded.equals(serviceEntity.subsequentVerificationsNeeded)) &&
        (this.allowRefunds == null ? serviceEntity.allowRefunds == null : this.allowRefunds.equals(serviceEntity.allowRefunds)) &&
        (this.downloadSpeed == null ? serviceEntity.downloadSpeed == null : this.downloadSpeed.equals(serviceEntity.downloadSpeed)) &&
        (this.uploadSpeed == null ? serviceEntity.uploadSpeed == null : this.uploadSpeed.equals(serviceEntity.uploadSpeed)) &&
        (this.proxy == null ? serviceEntity.proxy == null : this.proxy.equals(serviceEntity.proxy)) &&
        (this.vpn == null ? serviceEntity.vpn == null : this.vpn.equals(serviceEntity.vpn)) &&
        (this.validity == null ? serviceEntity.validity == null : this.validity.equals(serviceEntity.validity)) &&
        (this.disable == null ? serviceEntity.disable == null : this.disable.equals(serviceEntity.disable)) &&
        (this.certificates == null ? serviceEntity.certificates == null : this.certificates.equals(serviceEntity.certificates));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.cost == null ? 0: this.cost.hashCode());
    result = 31 * result + (this.firstPrePaidMinutes == null ? 0: this.firstPrePaidMinutes.hashCode());
    result = 31 * result + (this.firstVerificationsNeeded == null ? 0: this.firstVerificationsNeeded.hashCode());
    result = 31 * result + (this.subsequentPrePaidMinutes == null ? 0: this.subsequentPrePaidMinutes.hashCode());
    result = 31 * result + (this.subsequentVerificationsNeeded == null ? 0: this.subsequentVerificationsNeeded.hashCode());
    result = 31 * result + (this.allowRefunds == null ? 0: this.allowRefunds.hashCode());
    result = 31 * result + (this.downloadSpeed == null ? 0: this.downloadSpeed.hashCode());
    result = 31 * result + (this.uploadSpeed == null ? 0: this.uploadSpeed.hashCode());
    result = 31 * result + (this.proxy == null ? 0: this.proxy.hashCode());
    result = 31 * result + (this.vpn == null ? 0: this.vpn.hashCode());
    result = 31 * result + (this.validity == null ? 0: this.validity.hashCode());
    result = 31 * result + (this.disable == null ? 0: this.disable.hashCode());
    result = 31 * result + (this.certificates == null ? 0: this.certificates.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEntity {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  cost: ").append(cost).append("\n");
    sb.append("  firstPrePaidMinutes: ").append(firstPrePaidMinutes).append("\n");
    sb.append("  firstVerificationsNeeded: ").append(firstVerificationsNeeded).append("\n");
    sb.append("  subsequentPrePaidMinutes: ").append(subsequentPrePaidMinutes).append("\n");
    sb.append("  subsequentVerificationsNeeded: ").append(subsequentVerificationsNeeded).append("\n");
    sb.append("  allowRefunds: ").append(allowRefunds).append("\n");
    sb.append("  downloadSpeed: ").append(downloadSpeed).append("\n");
    sb.append("  uploadSpeed: ").append(uploadSpeed).append("\n");
    sb.append("  proxy: ").append(proxy).append("\n");
    sb.append("  vpn: ").append(vpn).append("\n");
    sb.append("  validity: ").append(validity).append("\n");
    sb.append("  disable: ").append(disable).append("\n");
    sb.append("  certificates: ").append(certificates).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
