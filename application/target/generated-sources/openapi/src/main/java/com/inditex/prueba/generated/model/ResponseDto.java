package com.inditex.prueba.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-10T12:56:43.834231500+01:00[Europe/Paris]")
public class ResponseDto   {
  @JsonProperty("productId")
  private Long productId;

  @JsonProperty("brandId")
  private Long brandId;

  @JsonProperty("priceId")
  private Long priceId;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("price")
  private Double price;

  public ResponseDto productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(example = "35455", required = true, value = "")
  @NotNull


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public ResponseDto brandId(Long brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public ResponseDto priceId(Long priceId) {
    this.priceId = priceId;
    return this;
  }

  /**
   * Get priceId
   * @return priceId
  */
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Long getPriceId() {
    return priceId;
  }

  public void setPriceId(Long priceId) {
    this.priceId = priceId;
  }

  public ResponseDto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(example = "2020-06-14T10:00Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ResponseDto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(example = "2020-06-14T10:00Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ResponseDto price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(example = "5.0", required = true, value = "")
  @NotNull


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDto responseDto = (ResponseDto) o;
    return Objects.equals(this.productId, responseDto.productId) &&
        Objects.equals(this.brandId, responseDto.brandId) &&
        Objects.equals(this.priceId, responseDto.priceId) &&
        Objects.equals(this.endDate, responseDto.endDate) &&
        Objects.equals(this.startDate, responseDto.startDate) &&
        Objects.equals(this.price, responseDto.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, brandId, priceId, endDate, startDate, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDto {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

