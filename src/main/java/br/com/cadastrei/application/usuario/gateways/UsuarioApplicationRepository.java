package br.com.cadastrei.application.usuario.gateways;

import br.com.cadastrei.domain.entity.usuario.Usuario;

import java.util.List;

public interface UsuarioApplicationRepository {

    Usuario salvar(Usuario usuario);

    List<Usuario> listar();
}
