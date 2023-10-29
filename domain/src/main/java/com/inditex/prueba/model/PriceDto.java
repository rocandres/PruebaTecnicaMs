package com.inditex.prueba.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceDto {

	 private Long id;
	 private BrandDto brandDto;
	 private OffsetDateTime startDate;
	 private OffsetDateTime endDate;
	 private ProductDto productDto;
	 private Integer priority;
	 private Double price;
	 private String curr;

}
