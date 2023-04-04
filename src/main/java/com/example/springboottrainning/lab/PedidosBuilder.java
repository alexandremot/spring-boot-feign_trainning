package com.example.springboottrainning.lab;

import com.example.springboottrainning.entity.AnimeEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Component;

@Component
public class PedidosBuilder {

    AnimeEntity meuPedido = new AnimeEntity();
    public String montaJsonPedido() throws JsonProcessingException {
        meuPedido.setId(2222L);
        meuPedido.setName("Shurato");
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = objectWriter.writeValueAsString(meuPedido);
        return json;
    }
}
