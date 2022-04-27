package br.com.itau.extrato.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Component
public class ClientWebTarget {

    @Value("${service.url}")
    private String url;

    public WebTarget client(){
        Client client = ClientBuilder.newClient();
        return client.target(url);
    }
}

