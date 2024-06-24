package br.com.jeffersontdm.application.usecases;

import br.com.jeffersontdm.application.gateways.UsuarioApplicationRepository;
import br.com.jeffersontdm.domain.entity.usuario.Usuario;

public class CriarUsuario {
    private final UsuarioApplicationRepository usuarioApplicationRepository;

    public CriarUsuario(UsuarioApplicationRepository usuarioApplicationRepository) {
        this.usuarioApplicationRepository = usuarioApplicationRepository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return this.usuarioApplicationRepository.salvar(usuario);
    }
}
