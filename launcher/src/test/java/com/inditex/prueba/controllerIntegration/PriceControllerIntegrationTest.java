package com.inditex.prueba.controllerIntegration;

import com.inditex.prueba.PriceApplication;
import com.inditex.prueba.generated.model.ResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = PriceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class PriceControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testPriceControllerIt_200() {
        var uri = UriComponentsBuilder.fromHttpUrl("http://localhost:" + port).path("/getPrice")
                .queryParam("applicationDate", "2020-06-16T19:17:57.689Z")
                .queryParam("productId","35455").queryParam("brandId","1").build().toUri();

        var result= this.restTemplate. getForEntity(uri, ResponseDto.class);

        assertEquals(HttpStatus.OK,result.getStatusCode());
        assertEquals(result.getBody().getBrandId(),1);
        assertEquals(result.getBody().getProductId(),35455);
        assertEquals(result.getBody().getPrice(),38.95);
    }

    @Test
    void testPriceControllerIt_400() {
        var uri = UriComponentsBuilder.fromHttpUrl("http://localhost:" + port).path("/getPrice")
                .queryParam("applicationDate", "2020-06-16T19:17:57.689Z")
                .queryParam("productId","35455").queryParam("brandId","1***").build().toUri();

        var result= this.restTemplate. getForEntity(uri, ResponseDto.class);

        assertEquals(HttpStatus.BAD_REQUEST,result.getStatusCode());

    }

    @Test
    void testPriceControllerIt_404() {
        var uri = UriComponentsBuilder.fromHttpUrl("http://localhost:" + port).path("/getPrice")
                .queryParam("applicationDate", "2020-06-16T19:17:57.689Z")
                .queryParam("productId","3545566").queryParam("brandId","1").build().toUri();

        var result= this.restTemplate. getForEntity(uri, ResponseDto.class);

        assertEquals(HttpStatus.NOT_FOUND,result.getStatusCode());

    }
}
