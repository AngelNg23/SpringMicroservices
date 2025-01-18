package com.microservice.Cliente.controller;

import com.microservice.Cliente.entities.Cliente;
import com.microservice.Cliente.service.IClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
    }

    @GetMapping("/buscar/{idCliente}")
    public ResponseEntity<?> findById(@PathVariable Long idCliente) {
        return ResponseEntity.ok(clienteService.findById(idCliente));
    }

    @GetMapping("/buscar/all")
    public ResponseEntity<?> findById() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/search-by-pedido/{idPedido}")
    public ResponseEntity<?> findByIdPedido(@PathVariable Long idPedido) {
        return ResponseEntity.ok(clienteService.findClienteByPedido(idPedido));
    }

    @PutMapping("/update-cliente/{idCliente}")
    public ResponseEntity<Cliente> updatePedido(@PathVariable Long idCliente, @RequestBody Cliente clienteActualizado) {
        Cliente clienteOptional = clienteService.findById(idCliente);
        if (Objects.isNull(clienteOptional)) {
            return ResponseEntity.notFound().build();
        }
        BeanUtils.copyProperties(clienteActualizado, clienteOptional, "id");
        clienteOptional.setIdCliente(idCliente);
        Cliente clienteGuardado = clienteService.save(clienteOptional);
        return ResponseEntity.ok(clienteGuardado);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> borrarCliente(@PathVariable Long id) {
        Cliente clienteOptional = clienteService.findById(id);
        if (Objects.isNull(clienteOptional)) {
            return ResponseEntity.notFound().build();
        }
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
