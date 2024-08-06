import java.util.ArrayList;
import java.util.List;

public class BancoTestes {

    private List<Cliente> clientesBanco;
    protected List<Conta> contasBanco;

    public BancoTestes() {
        this.clientesBanco = new ArrayList<>();
        this.contasBanco = new ArrayList<>();
    }

    public Conta buscarConta(int numeroDaConta) {
        for (Conta contaProcurada : contasBanco) { // criando um parametro para procurar a conta
            if (contaProcurada.getNumeroDaConta() == numeroDaConta) {
                return contaProcurada;
            }
        }
        return null; // Conta não seja encontrada
    }


    public List<Cliente> getClientesBanco() {
        return clientesBanco;
    }

    public List<Conta> getContasBanco() {
        return contasBanco;
    }

    public void cadastrarCliente(String nome, int idade){
        clientesBanco.add(new Cliente(nome, idade));
    }
    public void criarConta(Cliente cliente){
        contasBanco.add(new Conta(cliente));
    }

//    public void transferir(double valor, int numeroDaConta){
//            double novoSaldo = 0;
//            for(Conta contaDestino: contasBanco){
//                if(contaDestino.getNumeroDaConta()==numeroDaConta && valor<=this.contasBanco.get()){
//                    novoSaldo=contaDestino.getSaldo()+valor;
//                    contaDestino.setSaldo(novoSaldo);
//                    System.out.println("Transferencia realizada com sucesso!");
//                }
//            }
//
//    }

    public static void main(String[] args) {

        BancoTestes bancoTestes = new BancoTestes();

        bancoTestes.cadastrarCliente("Vinicius Sales",23);
        bancoTestes.cadastrarCliente("Henrique Sales",20);
        bancoTestes.cadastrarCliente("Marilene Barbosa",20);

        bancoTestes.criarConta(bancoTestes.getClientesBanco().get(0));
        bancoTestes.criarConta(bancoTestes.getClientesBanco().get(1));
        bancoTestes.criarConta(bancoTestes.getClientesBanco().get(2));

        bancoTestes.contasBanco.get(0).depositar(3500);
        bancoTestes.contasBanco.get(1).depositar(1000);

        bancoTestes.contasBanco.get(1).guardarDinheiro(1200);
        bancoTestes.contasBanco.get(0).transferir(1000,1027, bancoTestes);
        bancoTestes.contasBanco.get(1).transferir(1000,1028, bancoTestes);



        System.out.println(bancoTestes.getClientesBanco());
        bancoTestes.contasBanco.get(1).exibirConta();
        bancoTestes.contasBanco.get(2).exibirConta();





    }
}
