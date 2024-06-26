package br.com.cadastrei.application.usuario.usecases;

import br.com.cadastrei.application.usuario.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.domain.entity.usuario.Usuario;

import java.util.List;

public class ListarUsuarios {
    private final UsuarioApplicationRepository usuarioApplicationRepository;

    public ListarUsuarios(UsuarioApplicationRepository usuarioApplicationRepository) {
        this.usuarioApplicationRepository = usuarioApplicationRepository;
    }

    public List<Usuario> listar() {
        return usuarioApplicationRepository.listar();
    }
}
