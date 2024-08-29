package entities;

public class Cliente {
    private static Long GENERATOR_ID = 100L;
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.id= GENERATOR_ID++;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public Cliente() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
