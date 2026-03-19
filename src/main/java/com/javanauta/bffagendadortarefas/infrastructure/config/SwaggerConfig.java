package com.javanauta.bffagendadortarefas.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI configOpenApi(){
        return new OpenAPI()
                .addServersItem(new Server().url("https://api-agendador-javanauta.cloud")
                        .description("Servidor de Produção"));
    }
}
