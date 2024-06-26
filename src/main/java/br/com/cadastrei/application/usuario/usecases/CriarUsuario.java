package br.com.cadastrei.application.usuario.usecases;

import br.com.cadastrei.application.usuario.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.domain.entity.usuario.Usuario;
import br.com.cadastrei.domain.entity.usuario.dto.UsuarioDTO;

public class CriarUsuario {
    private final UsuarioApplicationRepository usuarioApplicationRepository;

    public CriarUsuario(UsuarioApplicationRepository usuarioApplicationRepository) {
        this.usuarioApplicationRepository = usuarioApplicationRepository;
    }

    public UsuarioDTO criar(Usuario usuario) {
        Usuario usuarioSalvo = this.usuarioApplicationRepository.salvar(usuario);
        return new UsuarioDTO(
            usuarioSalvo.nome(),
            usuarioSalvo.email()
        );
    }
}
