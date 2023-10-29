package com.inditex.prueba.ports.output;

import com.inditex.prueba.model.PriceDto;

import java.time.OffsetDateTime;
import java.util.List;

public interface PricePersistenceInterface {

    List<PriceDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId);

}
