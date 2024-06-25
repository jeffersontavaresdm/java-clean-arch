package br.com.cadastrei.application.usecases;

import br.com.cadastrei.application.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.domain.entity.usuario.Usuario;

public class CriarUsuario {
    private final UsuarioApplicationRepository usuarioApplicationRepository;

    public CriarUsuario(UsuarioApplicationRepository usuarioApplicationRepository) {
        this.usuarioApplicationRepository = usuarioApplicationRepository;
    }

    public Usuario criar(Usuario usuario) {
        return this.usuarioApplicationRepository.salvar(usuario);
    }
}
