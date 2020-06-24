package com.utn.rest.controller;


import com.utn.rest.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    IntegrationService integrationService;

}
