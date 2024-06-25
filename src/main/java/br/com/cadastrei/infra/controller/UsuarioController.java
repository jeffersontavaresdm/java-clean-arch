package br.com.cadastrei.infra.controller;

import br.com.cadastrei.application.usecases.CriarUsuario;
import br.com.cadastrei.application.usecases.ListarUsuarios;
import br.com.cadastrei.domain.entity.usuario.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final CriarUsuario criarUsuario;
    private final ListarUsuarios listarUsuarios;

    public UsuarioController(CriarUsuario criarUsuario, ListarUsuarios listarUsuarios) {
        this.criarUsuario = criarUsuario;
        this.listarUsuarios = listarUsuarios;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody Usuario payload) {
        Usuario usuario = criarUsuario.criar(payload);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping
    public ResponseEntity<?> listar(){
        List<Usuario> usuarios = listarUsuarios.listar();
        return ResponseEntity.status(HttpStatus.OK).body(usuarios);
    }
}
