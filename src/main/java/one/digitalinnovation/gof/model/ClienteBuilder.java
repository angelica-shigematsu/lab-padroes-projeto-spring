package one.digitalinnovation.gof.model;

import javax.persistence.ManyToOne;

public class ClienteBuilder {
    private Long id;

    private String nome;

    private String cpf;

    private String cnpj;
    @ManyToOne
    private Endereco endereco;

    private String typeUser;


    public ClienteBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ClienteBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClienteBuilder cnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public ClienteBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public ClienteBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public ClienteBuilder typeUser(String typeUser) {
        this.typeUser = typeUser;
        return this;
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    public Cliente build() {
        return new Cliente();
    }

}
