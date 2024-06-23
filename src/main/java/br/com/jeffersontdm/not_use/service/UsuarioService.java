package br.com.jeffersontdm.not_use.service;

import br.com.jeffersontdm.not_use.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
