package com.orchestration.controller;

import com.orchestration.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlayerController
{
    @GetMapping(value = "players")
    public Player getPlayer()
    {
        return new Player();
    }

    @GetMapping(value = "/getplayerstring")
    private String getPlayerString()
    {
        String url = "http://localhost:8081/players";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

    @GetMapping(value = "/getplayer")
    private Player getPlayerObject()
    {
        String url = "http://localhost:8081/players";
        RestTemplate restTemplate = new RestTemplate();
        Player result = restTemplate.getForObject(url, Player.class);
        return result;
    }
}
