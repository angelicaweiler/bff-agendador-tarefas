package com.javanauta.bffagendadortarefas.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigDebug {

    private final Environment environment;

    public ConfigDebug(Environment environment) {
        this.environment = environment;
    }

    @PostConstruct
    public void init() {
        String usuarioUrl = environment.getProperty("usuario.url");
        System.out.println("USUARIO_URL carregada: " + usuarioUrl);
    }
}