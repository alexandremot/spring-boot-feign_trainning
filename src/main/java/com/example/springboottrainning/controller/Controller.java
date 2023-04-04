package com.example.springboottrainning.controller;

import com.example.springboottrainning.feign_client.FeignClient;
import com.example.springboottrainning.lab.PedidosBuilder;
import com.example.springboottrainning.entity.AnimeEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import feign.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    FeignClient feignClient;

    @Autowired
    PedidosBuilder pedidosBuilder;

    @GetMapping("/animes/{id}")
    public AnimeEntity getAnimePorId(@RequestHeader(value = "param", required = true) String headerParam, @PathVariable String id) {
        AnimeEntity dadosAnime = feignClient.getAnime(headerParam, id);
        return dadosAnime;
    }

    @PostMapping("/enviapedido")
    public String postPedido() throws JsonProcessingException {
        String pedidoJson = pedidosBuilder.montaJsonPedido();
        return feignClient.postPedido(pedidoJson);
    }
}
