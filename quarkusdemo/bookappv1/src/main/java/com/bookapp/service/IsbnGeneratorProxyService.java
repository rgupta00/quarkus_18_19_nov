package com.bookapp.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/isbngenerator")
@Produces(MediaType.TEXT_PLAIN)
@RegisterRestClient //(baseUri = "http://localhost:8080")
public interface IsbnGeneratorProxyService {
    @GET
    public String isbnGenerator();
}
