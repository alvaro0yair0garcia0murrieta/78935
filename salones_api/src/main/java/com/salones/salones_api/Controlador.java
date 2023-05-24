package com.salones.salones_api;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Controlador {
    private static final Profesor Profesor = new Profesor("Mapache");
    ;

    @SchemaMapping
    public Profesor profesor(){
        return Profesor;
    }
}
