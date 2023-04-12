package com.calificacion.calificacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;



@org.springframework.ws.server.endpoint.annotation.Endpoint
public class Endpoint {
    @Autowired // Cuando haga los procesos de inyeccion vincula las otras clases que tenemos
               // ahíi
    private RepositorioMateria iSaludadores;
    private  final String URI="https://calificaciones.com/materias";




}