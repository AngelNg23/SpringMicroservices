package com.microservice.Cliente.service;

import com.microservice.Cliente.entities.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();

    Cliente findById(Long id);

    Cliente save(Cliente cliente);

    List<Cliente> findClienteByPedido(Long idPedido);

    void deleteById(Long id);
}
