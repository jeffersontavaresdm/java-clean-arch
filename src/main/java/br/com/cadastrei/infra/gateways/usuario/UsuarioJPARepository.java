package br.com.cadastrei.infra.gateways.usuario;

import br.com.cadastrei.application.usuario.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.domain.entity.usuario.Usuario;
import br.com.cadastrei.infra.persistence.usuario.UsuarioEntity;
import br.com.cadastrei.infra.persistence.usuario.UsuarioRepository;

import java.util.List;

public class UsuarioJPARepository implements UsuarioApplicationRepository {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioEntityMapper entityMapper;

    public UsuarioJPARepository(UsuarioRepository usuarioRepository, UsuarioEntityMapper entityMapper) {
        this.usuarioRepository = usuarioRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        UsuarioEntity usuarioSalvo = usuarioRepository.save(entityMapper.toEntity(usuario));
        return entityMapper.toDomain(usuarioSalvo, null);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository
            .findAll()
            .stream()
            .map(usuario -> entityMapper.toDomain(usuario, null))
            .toList();
    }
}
