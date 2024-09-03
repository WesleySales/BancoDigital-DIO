
import repositories.ClienteRepository;
import repositories.ContaRepository;
import services.ClienteService;
import services.ContaService;


public class BancoTestes {

    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();
        ContaRepository contaRepository = new ContaRepository();

        ClienteService clienteService = new ClienteService();
        ContaService contaService = new ContaService(contaRepository, clienteService);

        clienteService.cadastrarCliente("Wesley Sales","wesley@gmail.com","1");
        clienteService.cadastrarCliente("Joao Mercio","joao@gmail.com","2");
        clienteService.cadastrarCliente("Maria Madalena","maria@gmail.com","3");

//        System.out.println(clienteService.findByCPF("1"));

        System.out.println(clienteService.findAll());

        contaService.criarConta(100l);
        contaService.criarConta(101l);
        contaService.criarConta(102l);
        System.out.println(contaService.findAllConta());
//        Cliente cliente1 = clienteService.getById(100l);
//        Conta conta = new Conta(cliente1);
//        System.out.println(conta);
//        System.out.println();
//        System.out.println(b);

//        contaService. depositar(conta1,1000);
//        contaService. depositar(conta2,900);
//        contaService. depositar(conta3,100);
//
//        contaService.transferir(conta1, conta2,2100);
//
//        contaService.exibirConta(conta1);
//        contaService.exibirConta(conta2);

    }
}
