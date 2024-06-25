package br.com.cadastrei.config;

import br.com.cadastrei.application.gateways.UsuarioApplicationRepository;
import br.com.cadastrei.application.usecases.CriarUsuario;
import br.com.cadastrei.application.usecases.ListarUsuarios;
import br.com.cadastrei.infra.gateways.UsuarioEntityMapper;
import br.com.cadastrei.infra.gateways.UsuarioJPARepository;
import br.com.cadastrei.infra.persistence.UsuarioRepository;
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
