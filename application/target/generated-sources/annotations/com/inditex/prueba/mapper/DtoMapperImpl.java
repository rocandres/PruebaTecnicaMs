package com.inditex.prueba.mapper;

import com.inditex.prueba.generated.model.ResponseDto;
import com.inditex.prueba.model.BrandDto;
import com.inditex.prueba.model.PriceDto;
import com.inditex.prueba.model.ProductDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-29T14:23:52-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.20.1 (Amazon.com Inc.)"
)
public class DtoMapperImpl implements DtoMapper {

    @Override
    public ResponseDto priceDtoToResponseDto(PriceDto source) {
        if ( source == null ) {
            return null;
        }

        ResponseDto responseDto = new ResponseDto();

        responseDto.setPriceId( source.getId() );
        responseDto.setProductId( sourceProductDtoId( source ) );
        responseDto.setBrandId( sourceBrandDtoId( source ) );
        responseDto.setEndDate( source.getEndDate() );
        responseDto.setStartDate( source.getStartDate() );
        responseDto.setPrice( source.getPrice() );

        return responseDto;
    }

    private Long sourceProductDtoId(PriceDto priceDto) {
        if ( priceDto == null ) {
            return null;
        }
        ProductDto productDto = priceDto.getProductDto();
        if ( productDto == null ) {
            return null;
        }
        Long id = productDto.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long sourceBrandDtoId(PriceDto priceDto) {
        if ( priceDto == null ) {
            return null;
        }
        BrandDto brandDto = priceDto.getBrandDto();
        if ( brandDto == null ) {
            return null;
        }
        Long id = brandDto.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
