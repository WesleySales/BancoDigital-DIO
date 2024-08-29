import entities.Cliente;
import entities.Conta;
import services.ClienteService;
import services.ContaService;

import java.util.ArrayList;
import java.util.List;

public class BancoTestes {

    public static void main(String[] args) {

        ContaService contaService = new ContaService();
        ClienteService clienteService = new ClienteService();

        clienteService.cadastrarCliente("Wesley Sales","wesley@gmail.com","1");
        clienteService.cadastrarCliente("Joao Mercio","joao@gmail.com","2");
        clienteService.cadastrarCliente("Maria Madalena","maria@gmail.com","3");

        System.out.println(clienteService.findByCPF("1"));
        contaService.criarConta("1");
//        System.out.println();
        System.out.println(clienteService.findAllCliente());

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
