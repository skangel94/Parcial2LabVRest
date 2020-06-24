package com.utn.rest.service.integration;

import com.utn.rest.model.Call;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/test/duration";

    @PostConstruct
    private void init(){
        rest = new RestTemplateBuilder()
                .build();
    }

    public ResponseEntity<List<Call>> getCallsByDuration(Integer duration) throws HttpClientErrorException {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("duration", duration);

        ResponseEntity<List<Call>> response = rest.exchange(builder.toUriString(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Call>>() {});

        return response;
    }
}
