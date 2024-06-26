package br.com.cadastrei.domain.entity.endereco;

public record Endereco(String cep, Integer numero, String complemento) {

    public static EnderecoBuilder builder() {
        return new EnderecoBuilder();
    }

    public Endereco {
        if (!this.validaCEP(cep)) {
            throw new IllegalArgumentException("CEP inválido!");
        }
    }

    private boolean validaCEP(String cep) {
        return cep != null && cep.matches("\\d{5}-\\d{3}");
    }
}