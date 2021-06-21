package com.orchestration.controller;

import com.orchestration.model.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlayerController
{
    @GetMapping(value = "/players")
    private Player getPlayerObject()
    {
        String uri = "http://localhost:8080/api/players";
        RestTemplate restTemplate = new RestTemplate();
        Player result = restTemplate.getForObject(uri, Player.class);
        return result;
    }
}
