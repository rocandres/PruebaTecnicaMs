package com.inditex.prueba.ports.input;

import com.inditex.prueba.model.PriceDto;

import java.time.OffsetDateTime;
import java.util.Optional;

public interface PriceServiceInterface {

    /**
     * Find first price by product id, brand id and application date
     * ordered by priority descending
     *
     * @param applicationDate price application date
     * @param productId price product
     * @param brandId product brand
     * @return Optional of PriceDto, object if there
     * 		  is at least one coincidence, or empty
     */
    Optional<PriceDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId);

}
