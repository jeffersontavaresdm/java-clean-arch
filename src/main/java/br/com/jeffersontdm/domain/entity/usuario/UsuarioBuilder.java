package br.com.jeffersontdm.domain.entity.usuario;

import br.com.jeffersontdm.domain.entity.Endereco;

import java.time.LocalDate;

public class UsuarioBuilder {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private Endereco endereco;

    public UsuarioBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UsuarioBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario build() {
        return new Usuario(cpf, nome, dataNascimento, email, endereco);
    }
}
