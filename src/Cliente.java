import java.util.Set;

public class Cliente {

    protected String nome;
    protected int idade;
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrarCliente(String nome, int idade){
        Cliente cliente = new Cliente();
        this.nome= nome;
        this.idade= idade;
    }
    @Override
    public String toString() {
        return
                "\nnome= " + nome +
                ", idade= " + idade
                ;
    }
}
