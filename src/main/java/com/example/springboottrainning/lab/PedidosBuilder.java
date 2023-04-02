package com.example.springboottrainning.lab;

import com.example.springboottrainning.repository.PedidosRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Component;

@Component
public class PedidosBuilder {

    PedidosRepository meuPedido = new PedidosRepository();
    public String montaJsonPedido() throws JsonProcessingException {
        meuPedido.setValor(1.99);
        meuPedido.setPedido("banana");
        meuPedido.setMesa("42");
        meuPedido.setAtendente("Bentilys");
        meuPedido.setQuantidade(3);
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = objectWriter.writeValueAsString(meuPedido);
        return json;
    }
}
