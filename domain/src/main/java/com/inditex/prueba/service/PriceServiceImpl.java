package com.inditex.prueba.service;

import com.inditex.prueba.model.PriceDto;
import com.inditex.prueba.ports.input.PriceServiceInterface;
import com.inditex.prueba.ports.output.PricePersistenceInterface;

import java.time.OffsetDateTime;
import java.util.Optional;

public class PriceServiceImpl implements PriceServiceInterface {

    private PricePersistenceInterface pricePersistenceInterface;

    public PriceServiceImpl(PricePersistenceInterface pricePersistenceInterface) {
        this.pricePersistenceInterface = pricePersistenceInterface;
    }

    @Override
    public Optional<PriceDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId) {
        return pricePersistenceInterface.getPrice(applicationDate,productId,brandId)
                .stream()
                .findFirst();
    }
}
