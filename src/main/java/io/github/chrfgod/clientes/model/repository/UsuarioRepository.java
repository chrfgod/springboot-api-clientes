package io.github.chrfgod.clientes.model.repository;

import io.github.chrfgod.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
