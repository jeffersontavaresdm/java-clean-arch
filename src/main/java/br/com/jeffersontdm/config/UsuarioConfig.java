package br.com.jeffersontdm.config;

import br.com.jeffersontdm.application.gateways.UsuarioApplicationRepository;
import br.com.jeffersontdm.application.usecases.CriarUsuario;
import br.com.jeffersontdm.infra.gateways.UsuarioEntityMapper;
import br.com.jeffersontdm.infra.gateways.UsuarioJPARepository;
import br.com.jeffersontdm.infra.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    CriarUsuario criarUsuario(UsuarioApplicationRepository repository) {
        return new CriarUsuario(repository);
    }

    @Bean
    UsuarioJPARepository criaJPARepository(UsuarioRepository usuarioRepository, UsuarioEntityMapper entityMapper) {
        return new UsuarioJPARepository(usuarioRepository, entityMapper);
    }

    @Bean
    UsuarioEntityMapper criaUsuarioEntityMapper() {
        return new UsuarioEntityMapper();
    }
}
