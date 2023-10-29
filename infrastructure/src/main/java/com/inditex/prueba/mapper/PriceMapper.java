package com.inditex.prueba.mapper;

import com.inditex.prueba.entity.Price;
import com.inditex.prueba.model.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {

    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    @Mapping(target="productDto", source="product")
    @Mapping(target="brandDto", source="brand")
    PriceDto priceToPriceDto(Price entity);

    List<PriceDto> priceListToPriceDtoList(List<Price> entityList);
}
