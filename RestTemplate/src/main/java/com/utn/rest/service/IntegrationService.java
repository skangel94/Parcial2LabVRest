package com.utn.rest.service;

import com.utn.rest.model.Call;
import com.utn.rest.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public ResponseEntity<List<Call>> getCallsByDuration(Integer duration) throws HttpClientErrorException {
        return integrationComponent.getCallsByDuration(duration);
    }
}
