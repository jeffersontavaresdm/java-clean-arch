package br.com.jeffersontdm.infra.gateways;

import br.com.jeffersontdm.application.gateways.UsuarioApplicationRepository;
import br.com.jeffersontdm.domain.entity.usuario.Usuario;
import br.com.jeffersontdm.infra.persistence.UsuarioEntity;
import br.com.jeffersontdm.infra.persistence.UsuarioRepository;

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
