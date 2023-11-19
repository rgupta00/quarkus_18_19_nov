package com.bookapp.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.UUID;

@Path("/api")
public class IsbnGeneratorController {

    @Path("/isbngenerator")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String isbnGenerator() {
        return "remote-"+ UUID.randomUUID().toString();
    }
}
