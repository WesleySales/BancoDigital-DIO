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

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Vinicius Sales");
        cliente1.setIdade(22);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Marilene Barbosa");
        cliente2.setIdade(23);

        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);

        conta1.depositar(3500);
        conta2.depositar(3600);

        conta1.exibirConta();
        conta2.exibirConta();

        conta1.transferir(500,conta2);

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta2.sacar(3200);
        conta2.exibirSaldo();

    }
}
