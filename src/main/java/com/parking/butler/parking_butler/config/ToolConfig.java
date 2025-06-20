package com.parking.butler.parking_butler.config;

import com.parking.butler.parking_butler.tools.ParkingButler;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {

    @Bean
    MethodToolCallbackProvider toolCallbackProvider(ParkingButler parkingButler) {
        return MethodToolCallbackProvider
                .builder()
                .toolObjects(parkingButler)
                .build();
    }

}
