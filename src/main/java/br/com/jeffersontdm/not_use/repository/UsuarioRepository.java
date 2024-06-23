package br.com.jeffersontdm.not_use.repository;

import br.com.jeffersontdm.not_use.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
