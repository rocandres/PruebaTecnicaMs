package com.inditex.prueba.config;

import com.inditex.prueba.adapters.PriceJpaAdapter;
import com.inditex.prueba.ports.input.PriceServiceInterface;
import com.inditex.prueba.ports.output.PricePersistenceInterface;
import com.inditex.prueba.service.PriceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortConfig {

    @Bean
    public PricePersistenceInterface pricePersistence(){
        return new PriceJpaAdapter();
    }

    @Bean
    public PriceServiceInterface priceService(){
        return new PriceServiceImpl(pricePersistence());
    }
}
