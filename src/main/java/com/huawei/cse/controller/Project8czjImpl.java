package com.huawei.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-11-21T01:14:58.694Z")

@RestSchema(schemaId = "project8czj")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project8czjImpl {

    @Autowired
    private Project8czjDelegate userProject8czjDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject8czjDelegate.helloworld(name);
    }

}
