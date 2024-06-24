package br.com.jeffersontdm.domain.entity.usuario;

import br.com.jeffersontdm.domain.entity.Endereco;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioEntityTest {

    @Test
    public void criarUsuarioValidoTest() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";
        Endereco endereco = new Endereco("12345-678", 123, "A");

        assertDoesNotThrow(() -> new Usuario(cpf, nome, nascimento, email, endereco));
    }

    @Test
    public void criarUsuarioComCPFInvalidoTest() {
        String cpf = "12345678900";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";
        Endereco endereco = new Endereco("12345-678", 123, "A");

        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email, endereco));
    }

    @Test
    public void criarUsuarioComEmailValidoTest() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";
        Endereco endereco = new Endereco("12345-678", 123, "A");

        assertDoesNotThrow(() -> new Usuario(cpf, nome, nascimento, email, endereco));
    }

    @Test
    public void criarUsuarioComEmailInvalidoTest() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email1 = "usuario!email.com";
        String email2 = "usuario@abc_123.com";
        String email3 = "usuario@email";
        Endereco endereco = new Endereco("12345-678", 123, "A");

        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email1, endereco));
        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email2, endereco));
        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email3, endereco));
    }
}