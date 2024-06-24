package br.com.jeffersontdm.application.gateways;

import br.com.jeffersontdm.domain.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioApplicationRepository {

    Usuario salvar(Usuario usuario);

    List<Usuario> listar();
}
