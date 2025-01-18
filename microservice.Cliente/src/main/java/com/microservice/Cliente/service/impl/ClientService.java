package com.microservice.Cliente.service.impl;

import com.microservice.Cliente.entities.Cliente;
import com.microservice.Cliente.persistence.ClienteRepository;
import com.microservice.Cliente.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow();
    }

    @Override
    public Cliente save(Cliente cliente) {
        clienteRepository.save(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> findClienteByPedido(Long idPedido) {
        return clienteRepository.findClienteByPedido(idPedido);
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}
