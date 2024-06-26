package br.com.cadastrei.config;

import br.com.cadastrei.application.usuario.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.application.usuario.usecases.CriarUsuario;
import br.com.cadastrei.application.usuario.usecases.ListarUsuarios;
import br.com.cadastrei.infra.gateways.usuario.UsuarioEntityMapper;
import br.com.cadastrei.infra.gateways.usuario.UsuarioJPARepository;
import br.com.cadastrei.infra.persistence.usuario.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    UsuarioJPARepository criaJPARepository(UsuarioRepository usuarioRepository, UsuarioEntityMapper entityMapper) {
        return new UsuarioJPARepository(usuarioRepository, entityMapper);
    }

    @Bean
    UsuarioEntityMapper criaUsuarioEntityMapper() {
        return new UsuarioEntityMapper();
    }

    @Bean
    CriarUsuario criarUsuario(UsuarioApplicationRepository repository) {
        return new CriarUsuario(repository);
    }

    @Bean
    ListarUsuarios listarUsuarios(UsuarioApplicationRepository repository) {
        return new ListarUsuarios(repository);
    }
}
