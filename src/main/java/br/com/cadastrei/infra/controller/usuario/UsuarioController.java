package br.com.cadastrei.infra.controller.usuario;

import br.com.cadastrei.application.usuario.usecases.CriarUsuario;
import br.com.cadastrei.application.usuario.usecases.ListarUsuarios;
import br.com.cadastrei.domain.entity.usuario.Usuario;
import br.com.cadastrei.domain.entity.usuario.dto.UsuarioDTO;
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
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody Usuario payload) {
        UsuarioDTO usuario = criarUsuario.criar(payload);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        List<UsuarioDTO> usuarios = listarUsuarios.listar();
        return ResponseEntity.status(HttpStatus.OK).body(usuarios);
    }
}
