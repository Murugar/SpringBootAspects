package com.iqmsoft.boot.aop.rest;

import org.springframework.stereotype.Component;

import com.iqmsoft.boot.aop.logger.Loggable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Component
@Path("/aspect")
@Loggable
public class SpringBootAspectJController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Loggable
    public Response getMockData(){
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Loggable
    public Response getMockData(@PathParam("id") String id, @QueryParam("q") String q){
        return Response.ok().build();
    }

}
