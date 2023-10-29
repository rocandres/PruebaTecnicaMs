package com.inditex.prueba.mapper;

import com.inditex.prueba.entity.Brand;
import com.inditex.prueba.entity.Price;
import com.inditex.prueba.entity.Product;
import com.inditex.prueba.model.BrandDto;
import com.inditex.prueba.model.BrandDto.BrandDtoBuilder;
import com.inditex.prueba.model.PriceDto;
import com.inditex.prueba.model.PriceDto.PriceDtoBuilder;
import com.inditex.prueba.model.ProductDto;
import com.inditex.prueba.model.ProductDto.ProductDtoBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-29T14:23:49-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.20.1 (Amazon.com Inc.)"
)
public class PriceMapperImpl implements PriceMapper {

    @Override
    public PriceDto priceToPriceDto(Price entity) {
        if ( entity == null ) {
            return null;
        }

        PriceDtoBuilder priceDto = PriceDto.builder();

        priceDto.productDto( productToProductDto( entity.getProduct() ) );
        priceDto.brandDto( brandToBrandDto( entity.getBrand() ) );
        priceDto.id( entity.getId() );
        priceDto.startDate( entity.getStartDate() );
        priceDto.endDate( entity.getEndDate() );
        priceDto.priority( entity.getPriority() );
        priceDto.price( entity.getPrice() );
        priceDto.curr( entity.getCurr() );

        return priceDto.build();
    }

    @Override
    public List<PriceDto> priceListToPriceDtoList(List<Price> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PriceDto> list = new ArrayList<PriceDto>( entityList.size() );
        for ( Price price : entityList ) {
            list.add( priceToPriceDto( price ) );
        }

        return list;
    }

    protected ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDtoBuilder productDto = ProductDto.builder();

        productDto.id( product.getId() );
        productDto.name( product.getName() );

        return productDto.build();
    }

    protected BrandDto brandToBrandDto(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandDtoBuilder brandDto = BrandDto.builder();

        brandDto.id( brand.getId() );
        brandDto.name( brand.getName() );

        return brandDto.build();
    }
}
