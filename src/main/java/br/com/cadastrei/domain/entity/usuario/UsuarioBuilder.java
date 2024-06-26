package br.com.cadastrei.domain.entity.usuario;

import br.com.cadastrei.domain.entity.endereco.Endereco;

import java.time.LocalDate;

public class UsuarioBuilder {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private Endereco endereco;

    public UsuarioBuilder setCPF(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UsuarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public UsuarioBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario build() {
        return new Usuario(cpf, nome, dataNascimento, email, endereco);
    }
}