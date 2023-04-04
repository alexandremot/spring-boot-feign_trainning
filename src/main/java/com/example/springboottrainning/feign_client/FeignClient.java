package com.example.springboottrainning.feign_client;

import com.example.springboottrainning.entity.AnimeEntity;
import feign.Headers;
import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient(name = "animes-client", url = "localhost:8080")
public interface FeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/animes/{id}")
    AnimeEntity getAnime(@RequestHeader("x-api-id") String customHeader, @PathVariable String id);

    @RequestMapping(method = RequestMethod.POST, value = "/pedido", consumes = "application/json", produces = "application/json")
    String postPedido(@RequestBody String payload);
}
