package br.com.cadastrei.domain.entity.endereco;

public class EnderecoBuilder {
    private String cep;
    private Integer numero;
    private String complemento;

    public EnderecoBuilder setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoBuilder setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoBuilder setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Endereco build() {
        return new Endereco(cep, numero, complemento);
    }
}