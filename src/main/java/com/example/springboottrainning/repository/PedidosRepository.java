package com.example.springboottrainning.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidosRepository {
        private String atendente;
        private Integer id;
        private String mesa;
        private String pedido;
        private Integer quantidade;
        private Double valor;
}
