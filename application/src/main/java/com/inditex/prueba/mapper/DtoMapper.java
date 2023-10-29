package com.inditex.prueba.mapper;

import com.inditex.prueba.generated.model.ResponseDto;
import com.inditex.prueba.model.PriceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DtoMapper {

    DtoMapper INSTANCE = Mappers.getMapper(DtoMapper.class);

    @Mapping(target="priceId", source="source.id")
    @Mapping(target="productId", source="source.productDto.id")
    @Mapping(target="brandId", source="source.brandDto.id")
    ResponseDto priceDtoToResponseDto(PriceDto source);

}
