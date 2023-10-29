/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.inditex.prueba.generated.api;

import com.inditex.prueba.generated.model.Error;
import java.time.OffsetDateTime;
import com.inditex.prueba.generated.model.ResponseDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-10T12:56:43.834231500+01:00[Europe/Paris]")
@Validated
@Api(value = "getPrice", description = "the getPrice API")
public interface GetPriceApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /getPrice : Get product price by application date, product and brand
     *
     * @param applicationDate application date of buy (required)
     * @param productId product identification code (required)
     * @param brandId product brand (required)
     * @return Retrieve final price and product details (status code 200)
     *         or BadRequest (status code 400)
     *         or Internal server error (status code 500)
     *         or Service unavailable (status code 503)
     */
    @ApiOperation(value = "Get product price by application date, product and brand", nickname = "getPrice", notes = "", response = ResponseDto.class, tags={ "price", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieve final price and product details", response = ResponseDto.class),
        @ApiResponse(code = 400, message = "BadRequest", response = Error.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Error.class),
        @ApiResponse(code = 503, message = "Service unavailable", response = Error.class) })
    @GetMapping(
        value = "/getPrice",
        produces = { "application/json" }
    )
    default ResponseEntity<ResponseDto> _getPrice(@NotNull @ApiParam(value = "application date of buy", required = true) @Valid @RequestParam(value = "applicationDate", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime applicationDate,@NotNull @ApiParam(value = "product identification code", required = true) @Valid @RequestParam(value = "productId", required = true) Long productId,@NotNull @ApiParam(value = "product brand", required = true) @Valid @RequestParam(value = "brandId", required = true) Long brandId) {
        return getPrice(applicationDate, productId, brandId);
    }

    // Override this method
    default  ResponseEntity<ResponseDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"productId\" : 35455, \"endDate\" : \"2020-06-14T10:00:00Z\", \"price\" : 5.0, \"brandId\" : 1, \"priceId\" : 1, \"startDate\" : \"2020-06-14T10:00:00Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
