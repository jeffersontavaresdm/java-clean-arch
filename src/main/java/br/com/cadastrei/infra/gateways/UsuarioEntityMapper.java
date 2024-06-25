package br.com.cadastrei.infra.gateways;

import br.com.cadastrei.domain.entity.Endereco;
import br.com.cadastrei.domain.entity.usuario.Usuario;
import br.com.cadastrei.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {

    UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(
            usuario.cpf(),
            usuario.nome(),
            usuario.dataNascimento(),
            usuario.email()
        );
    }

    Usuario toDomain(UsuarioEntity usuario, Endereco endereco) {
        return new Usuario(
            usuario.getCpf(),
            usuario.getNome(),
            usuario.getDataNascimento(),
            usuario.getEmail(),
            endereco
        );
    }
}
