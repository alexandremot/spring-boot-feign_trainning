package com.example.springboottrainning.controller;

import com.example.springboottrainning.feign_client.FeignClient;
import com.example.springboottrainning.lab.PedidosBuilder;
import com.example.springboottrainning.repository.PedidosRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    FeignClient feignClient;

    @Autowired
    PedidosBuilder pedidosBuilder;


    @GetMapping("/consultapedido/{id}")
    public PedidosRepository getPedidoPorId(@PathVariable String id) {
        PedidosRepository daddosDoPedido = feignClient.getPedido(id);
        return daddosDoPedido;
    }

    @PostMapping("/enviapedido")
    public String postPedido() throws JsonProcessingException {
        String pedidoJson = pedidosBuilder.montaJsonPedido();
        return feignClient.postPedido(pedidoJson);
    }
}
