package br.com.cadastrei.application.usuario.usecases;

import br.com.cadastrei.application.usuario.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.domain.entity.usuario.dto.UsuarioDTO;
import br.com.cadastrei.infra.gateways.usuario.UsuarioEntityMapper;

import java.util.List;

public class ListarUsuarios {
    private final UsuarioApplicationRepository usuarioApplicationRepository;

    public ListarUsuarios(UsuarioApplicationRepository usuarioApplicationRepository) {
        this.usuarioApplicationRepository = usuarioApplicationRepository;
    }

    public List<UsuarioDTO> listar() {
        return usuarioApplicationRepository
            .listar()
            .stream()
            .map(usuario -> new UsuarioEntityMapper().toDTO(usuario))
            .toList();
    }
}
