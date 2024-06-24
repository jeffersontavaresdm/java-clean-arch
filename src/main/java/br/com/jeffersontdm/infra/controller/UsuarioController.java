package br.com.jeffersontdm.infra.controller;

import br.com.jeffersontdm.application.usecases.CriarUsuario;
import br.com.jeffersontdm.domain.entity.usuario.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;

    public UsuarioController(CriarUsuario criarUsuario) {
        this.criarUsuario = criarUsuario;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody Usuario payload) {
        Usuario usuario = criarUsuario.criarUsuario(payload);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }
}
