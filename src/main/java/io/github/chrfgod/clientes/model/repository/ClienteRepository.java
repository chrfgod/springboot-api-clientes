package io.github.chrfgod.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.chrfgod.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
