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

        Cliente cliente1 = new Cliente("wesley sales",23);
        Cliente cliente2 = new Cliente("Joao silva",26);
        Cliente cliente3 = new Cliente("maria madalena",30);

        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);
        Conta conta3 = new Conta(cliente3);

        conta1.depositar(1200);
        conta2.depositar(1000);
        conta3.depositar(950);

        conta1.sacar(1000);
        conta2.sacar(200);
        conta3.sacar(15000);

        conta1.guardarDinheiro(500);
        conta2.guardarDinheiro(1200);
        conta1.transferir(1200,conta3);

//        conta1.exibirConta();
//        conta2.exibirConta();
//        conta3.exibirConta();

    }
}
