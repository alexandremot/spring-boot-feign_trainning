package com.example.springboottrainning.feign_client;

import com.example.springboottrainning.repository.PedidosRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "pedidoClient", url = "localhost:5000/pedido/")
public interface FeignController {


    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    PedidosRepository getPedido(@PathVariable String id);
}
