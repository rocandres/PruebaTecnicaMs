package com.inditex.prueba.controller;

import com.inditex.prueba.generated.model.ResponseDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.OffsetDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
class PriceControllerTest {

	@Autowired
    PriceController priceController;
    
    private final Long productId = 35455L;
    private final Long brandId = 1L;
    
    @BeforeAll
    public static void setUp() {
    	MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    }
     
    @Test
    public void testPriceController() 
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-16T19:17:57.689Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));

    }

    @Test
    public void testPriceController1()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T10:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));
        assertEquals(Double.valueOf("35.50"), responseEntity.getBody().getPrice());

    }

    @Test
    public void testPriceController2()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T16:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));
        assertEquals(Double.valueOf("25.45"), responseEntity.getBody().getPrice());

    }

    @Test
    public void testPriceController3()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T21:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));
        assertEquals(Double.valueOf("35.50"), responseEntity.getBody().getPrice());

    }

    @Test
    public void testPriceController4()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-15T10:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));
        assertEquals(Double.valueOf("30.50"), responseEntity.getBody().getPrice());

    }

    @Test
    public void testPriceController5()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-16T21:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, productId, brandId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(brandId, responseEntity.getBody().getBrandId());
        assertEquals(productId, responseEntity.getBody().getProductId());
        assertThat(applicationDate.isBefore(responseEntity.getBody().getEndDate()));
        assertThat(applicationDate.isAfter(responseEntity.getBody().getStartDate()));
        assertEquals(Double.valueOf("38.95"), responseEntity.getBody().getPrice());

    }

    @Test
    public void testPriceControllerNotFound()
    {
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-16T21:00:00.00Z");
        ResponseEntity<ResponseDto> responseEntity = priceController.getPrice(applicationDate, 23L, brandId);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }


}
