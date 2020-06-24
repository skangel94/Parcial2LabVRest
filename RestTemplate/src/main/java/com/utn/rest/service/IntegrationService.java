package com.utn.rest.service;

import com.utn.rest.model.Call;
import com.utn.rest.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import javax.xml.bind.ValidationException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    // Con parámetros
    /*
    public ResponseEntity<List<Call>> getCallsByDuration(String from, String to){
        return integrationComponent.getCallsByDurationByApi(from,to);
    }

     */
    /*
    //Con parametros y variables
    public ResponseEntity<List<Call>> getCallsByDuration(String from, String to, Integer userId){
        return integrationComponent.getCallsByDateByApi(from,to,userId);
    }
     */

    public ResponseEntity<List<Call>> getCallsByProvinceDni(String province, String parity) throws HttpClientErrorException {
        return integrationComponent.getCallsByProvinceDni(province,parity);
    }

}
