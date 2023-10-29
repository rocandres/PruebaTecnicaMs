package com.inditex.prueba.controller;

import com.inditex.prueba.generated.api.GetPriceApi;
import com.inditex.prueba.generated.model.ResponseDto;
import com.inditex.prueba.mapper.DtoMapper;
import com.inditex.prueba.ports.input.PriceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class PriceController implements GetPriceApi {

	@Autowired
	PriceServiceInterface priceService;

	@Override
	public ResponseEntity<ResponseDto> getPrice(OffsetDateTime applicationDate, Long productId, Long brandId){

		 return ResponseEntity.of(priceService.getPrice(applicationDate, productId, brandId)
				 .map(priceDto -> DtoMapper.INSTANCE.priceDtoToResponseDto(priceDto)));
		
	}

}
