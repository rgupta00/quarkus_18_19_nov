package com.bookapp.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
//jax rs
@Path("/hello")
public class GreetingResource {

    //sb: pathvariable , requestparam
    //q: pathparam, queryparam
    @Path("/endpoint1")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @Path("/endpoint2")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2(@QueryParam("uname")String uname, @QueryParam("city")String city) {
        return "Hello RESTEasy QueryParam "+ uname+": "+city;
    }

    @Path("/endpoint3")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello3(@QueryParam("uname")String uname, @QueryParam("city")String city) {
        return "Hello RESTEasy QueryParam "+ uname+": "+city;
    }
}
