import java.util.ArrayList;
import java.util.List;

public class BancoTestes {

    private List<Cliente> clientesBanco;
    private List<Conta> contasBanco;

    public BancoTestes() {
        this.clientesBanco = new ArrayList<>();
        this.contasBanco = new ArrayList<>();
    }

    public List<Cliente> getClientesBanco() {
        return clientesBanco;
    }

    public void cadastrarCliente(String nome, int idade){
        clientesBanco.add(new Cliente(nome, idade));

    }

    public void criarConta(Cliente cliente){
        contasBanco.add(new Conta(cliente));
    }
    public static void main(String[] args) {

        Cliente vinicius = new Cliente();
        Cliente henrique = new Cliente();
        Cliente danilo = new Cliente();

        vinicius.setNome("Wesley Sales");
        vinicius.setIdade(22);

        danilo.setNome("Danilo BDS");
        danilo.setIdade(20);

        henrique.setNome("Charles Sales");
        henrique.setIdade(21);

        Conta conta1 = new Conta(vinicius);
        Conta conta2 = new Conta(henrique);
        Conta conta3 = new Conta(danilo);

        conta1.depositar(1200);
        conta2.depositar(1000);
        conta3.depositar(950);

        conta1.exibirConta();
        conta2.exibirConta();
        conta3.exibirConta();

        conta1.guardarDinheiro(500);
        conta2.guardarDinheiro(1200);
        conta1.transferir(1200,conta3);

        conta1.exibirConta();
        conta2.exibirConta();
        conta3.exibirConta();

    }
}
