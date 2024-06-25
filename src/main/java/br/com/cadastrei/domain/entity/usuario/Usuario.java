package br.com.cadastrei.domain.entity.usuario;

import br.com.cadastrei.domain.entity.Endereco;

import java.time.LocalDate;

public record Usuario(
    String cpf,
    String nome,
    LocalDate dataNascimento,
    String email,
    Endereco endereco
) {
    public Usuario {
        if (!this.validaCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        if (!this.validaEmail(email)) {
            throw new IllegalArgumentException("Email inválido!");
        }
    }

    private boolean validaCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
    }

    private boolean validaEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }
}
