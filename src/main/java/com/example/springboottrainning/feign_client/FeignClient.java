package com.example.springboottrainning.feign_client;

import com.example.springboottrainning.repository.PedidosRepository;
import org.springframework.web.bind.annotation.*;

@org.springframework.cloud.openfeign.FeignClient(name = "pedidoClient", url = "localhost:5000")
public interface FeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/pedido/{id}")
    PedidosRepository getPedido(@PathVariable String id);

    @RequestMapping(method = RequestMethod.POST, value = "/pedido", consumes = "application/json", produces = "application/json")
    String postPedido(@RequestBody String payload);
}
