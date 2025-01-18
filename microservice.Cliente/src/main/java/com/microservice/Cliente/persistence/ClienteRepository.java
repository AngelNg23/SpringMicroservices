package com.microservice.Cliente.persistence;

import com.microservice.Cliente.entities.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

@Query("SELECT c FROM Cliente c WHERE c.idPedido = :idPedido")
List<Cliente> findClienteByPedido(Long idPedido);

}
