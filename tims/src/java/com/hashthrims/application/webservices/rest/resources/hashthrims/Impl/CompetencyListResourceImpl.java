/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hashthrims.application.webservices.rest.resources.hashthrims.Impl;

import com.hashthrims.application.webservices.rest.resources.hashthrims.CompetencyListResource;
import com.hashthrims.application.webservices.rest.resources.hashthrims.util.CompetencyListForm;
import com.hashthrims.application.webservices.rest.resources.hashthrims.util.RequestForm;
import com.hashthrims.domain.employeelist.CompetencyList;
import com.hashthrims.services.CompetencyListService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author administrator.dat
 */
@Path("/competencyListservice")
@Produces("application/xml")
@Service("competencyListResource")
public class CompetencyListResourceImpl extends CompetencyListResource{

    @Autowired
    private CompetencyListService service;

    /**
     * @return the service
     */
    public CompetencyListService getService() {
        return service;
    }

     /**
     * @param service the service to set
     */
    public void setService(CompetencyListService service) {
        this.service = service;
    }


    @GET
    @Path("/competencyLists")
    @Override
    public Collection<CompetencyList> getCompetencyLists(){
        return service.findAll();
    }

    @GET
    @Path("/competencyList/{id}")
    @Override
    public CompetencyList getCompetencyList(@PathParam("id") Long id) {
       CompetencyList competencyList = service.find(id);
        if (competencyList == null) {
            ResponseBuilder builder = Response.status(Status.BAD_REQUEST);
            builder.type("application/xml");
            builder.entity("<error>Competency Not Found</error>");
            throw new WebApplicationException(builder.build());
        } else {
            return competencyList;
        }
    }

    @POST
    @Path("/competencyLists")
    @Override
    public Response createCompetencyList(@Context Request request, CompetencyListForm form) {
             CompetencyList u = new CompetencyList();
             u.setComp_name(form.getCompetency());


        try {
            service.persist(u);
//            TODO: i don't know what the exact url is
            ResponseBuilder builder = Response.created(new URI("http://localhost:8084/hashthrims/ws/competencyListservice/competencyLists"));
            return builder.build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    @Path("/competencyList")
    @Override
    public CompetencyList getCompetencyList(@Context Request request, RequestForm form) {
        try {
            CompetencyList competencyList = service.getByPropertyName(form.getPropertyName(), form.getPropertyValue());
            if(competencyList == null){
                throw new com.hashthrims.infrastructure.exceptions.CompetencyNotFoundException();
            }
            return competencyList;
        } catch (com.hashthrims.infrastructure.exceptions.CompetencyNotFoundException ex) {
            ResponseBuilder builder = Response.status(Status.BAD_REQUEST);
            builder.type("application/xml");
            builder.entity("<error>Invalid Code</error>");
            Logger.getLogger(CompetencyListResourceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new WebApplicationException(builder.build());
        }
    }

    @PUT
    @Path("/competencyList/update")
    @Override
    public Response updateCompetencyList(@Context Request request, CompetencyList competencyList) {

        if (competencyList == null) {
            return Response.status(Status.BAD_REQUEST).build();
        } else {
            service.merge(competencyList);
            return Response.ok(competencyList).build();
        }
    }




}
