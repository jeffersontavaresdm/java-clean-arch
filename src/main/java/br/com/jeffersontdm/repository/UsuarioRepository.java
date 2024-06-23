package br.com.jeffersontdm.repository;

import br.com.jeffersontdm.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
