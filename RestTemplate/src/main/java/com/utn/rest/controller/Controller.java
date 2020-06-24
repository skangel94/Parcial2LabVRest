package com.utn.rest.controller;


import com.utn.rest.model.Call;
import com.utn.rest.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    IntegrationService integrationService;

    @GetMapping
    public ResponseEntity<List<Call>> getCallsByDuration(@RequestParam(value = "duration") Integer duration) throws HttpClientErrorException {
        return integrationService.getCallsByDuration(duration);
    }
}
