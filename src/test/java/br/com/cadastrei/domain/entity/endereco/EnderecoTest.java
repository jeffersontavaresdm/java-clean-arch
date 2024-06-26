package br.com.cadastrei.domain.entity.endereco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EnderecoTest {

    @Test
    public void deveCriarEnderecoComCepValidoTest() {
        String cep = "12345-678";
        Integer numero = 123;
        String complemento = "A";

        assertDoesNotThrow(() -> new Endereco(cep, numero, complemento));
    }

    @Test
    public void deveCriarEnderecoComCepInvalidoTest() {
        String cep = "12345678";
        Integer numero = 123;
        String complemento = "A";

        assertThrows(IllegalArgumentException.class, () -> new Endereco(cep, numero, complemento));
    }
}
