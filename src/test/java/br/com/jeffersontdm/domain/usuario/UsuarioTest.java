package br.com.jeffersontdm.domain.usuario;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void testCriarUsuarioValido() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";

        new Usuario(cpf, nome, nascimento, email);

        assertDoesNotThrow(() -> new Usuario(cpf, nome, nascimento, email));
    }

    @Test
    public void testCriarUsuarioComCPFInvalido() {
        String cpf = "12345678900";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";

        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email));
    }

    @Test
    public void testCriarUsuarioComEmailValido() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email = "usuario@email.com";

        assertDoesNotThrow(() -> new Usuario(cpf, nome, nascimento, email));
    }

    @Test
    public void testCriarUsuarioComEmailInvalido() {
        String cpf = "123.456.789-00";
        String nome = "usuario_nome";
        LocalDate nascimento = LocalDate.of(1990, 1, 10);
        String email1 = "usuarioemail.com";
        String email2 = "usuario@abc_123.com";
        String email3 = "usuario@email";

        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email1));
        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email2));
        assertThrows(IllegalArgumentException.class, () -> new Usuario(cpf, nome, nascimento, email3));
    }
}