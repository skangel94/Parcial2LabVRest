package com.utn.rest.service.integration;

import com.utn.rest.model.Call;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

import javax.annotation.PostConstruct;
import javax.xml.bind.ValidationException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;
    private static String url = "http://localhost:8080/test/callsProvinceDni";

    @PostConstruct
    private void init(){
        rest = new RestTemplateBuilder()
                .build();
    }
    /*
    public ResponseEntity<List<Call>> getCallsByDateByApi(String from, String to, Integer userId){
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("userId", String.valueOf(userId));


        URI uri = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(urlParams)
                .toUri();
        uri = UriComponentsBuilder
                .fromUri(uri)
                .queryParam("from", from)
                .queryParam("to", to)
                .build()
                .toUri();

        ResponseEntity<List<Call>> response = rest.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<List<Call>>() {});

        return response;

    }

     */

    public  ResponseEntity<List<Call>> getCallsByProvinceDni(String province, String parity) throws HttpClientErrorException {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("province", province)
                .queryParam("parity", parity);

        ResponseEntity<List<Call>> response = rest.exchange(builder.toUriString(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Call>>() {});

        return response;
    }
}
