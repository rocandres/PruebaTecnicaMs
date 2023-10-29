package com.inditex.prueba.adapters;

import com.inditex.prueba.entity.Price;
import com.inditex.prueba.mapper.PriceMapper;
import com.inditex.prueba.model.PriceDto;
import com.inditex.prueba.ports.output.PricePersistenceInterface;
import com.inditex.prueba.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class PriceJpaAdapter implements PricePersistenceInterface {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public List<PriceDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId) {
        List<Price> priceList = priceRepository.findByApplicationDateAndProductIdAndBrandId(applicationDate,productId,brandId);
        return PriceMapper.INSTANCE.priceListToPriceDtoList(priceList);
    }
}
