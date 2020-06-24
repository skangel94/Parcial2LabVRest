package com.utn.rest.controller;

import com.utn.rest.model.Call;
import com.utn.rest.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.xml.bind.ValidationException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    IntegrationService integrationService;

    //Con parametros
    /*
    @GetMapping
    public ResponseEntity<List<Call>> getCallsByDuration(@RequestParam(value = "from") String from, @RequestParam(value = "to") String to){
        return integrationService.getCallsByDuration(from,to);
    }

     */

    //Con parámetros y variables
    /*
    @GetMapping("{userId}")
    public ResponseEntity<List<Call>> getCallsByDuration(@RequestParam(value = "from") String from, @RequestParam(value = "to") String to, @PathVariable Integer userId){
        return integrationService.getCallsByDuration(from,to,userId);
    }

     */

    @GetMapping
    public ResponseEntity<List<Call>> getCallsByProvinceDni(@RequestParam(value = "province") String province, @RequestParam(value = "parity") String parity) throws HttpClientErrorException {
        return integrationService.getCallsByProvinceDni(province,parity);
    }
}
