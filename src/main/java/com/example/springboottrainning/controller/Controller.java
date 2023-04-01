package com.example.springboottrainning.controller;

import com.example.springboottrainning.feign_client.FeignController;
import com.example.springboottrainning.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class Controller {

    @Autowired
    FeignController feignController;

    @GetMapping("/test/{id}")
    public PedidosRepository hello(@PathVariable String id){
        PedidosRepository daddosDoPedido = feignController.getPedido(id);
        return daddosDoPedido;
    }
}
