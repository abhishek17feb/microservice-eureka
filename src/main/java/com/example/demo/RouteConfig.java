package com.example.demo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(route -> route
                        .path("/api_india")
                        .filters(filter -> filter.addRequestHeader("x-rapidapi-key", "cfa5c70082msh04acd9436f7ed8fp17452ejsn7098d984e6b7")
                                .addRequestHeader("x-rapidapi-host", "corona-virus-world-and-india-data.p.rapidapi.com"))
                        .uri("https://corona-virus-world-and-india-data.p.rapidapi.com/")
                ).build();
    }
}
