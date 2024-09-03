package services;

import entities.Cliente;
import entities.Conta;

import repositories.ContaRepository;

import java.util.List;

public class ContaService {

    Conta conta = new Conta();

    private ContaRepository contaRepository;
    private ClienteService clienteService;

    public ContaService(ContaRepository contaRepository, ClienteService clienteService) {
        this.contaRepository = contaRepository;
        this.clienteService = clienteService;
    }

    public void criarConta(Long id){
        Cliente cliente = clienteService.getById(id);
        if(cliente!=null){
            Conta conta = new Conta(cliente);
            contaRepository.save(conta);
        }
        else {
            throw new RuntimeException("Não foi possível criar a conta");
        }
    }
    public List<Conta> findAllConta(){
        return contaRepository.findAll();
    }

    public Conta getByNumeroConta(int numConta){
        return contaRepository.findByConta(numConta);
    }

    public void sacar(Conta conta, double valor){
        verificarSaldo(conta,valor);
        conta.setSaldo(conta.getSaldo()-valor);
    }
    public boolean verificarSaldo(Conta conta, double valor){
        if(conta.getSaldo()>=valor){
            return true;
        }
        else throw new RuntimeException("Saldo insuficiente");
    }
    public void depositar(Conta conta, double valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void transferir(Conta contaRemetente, Conta contaDestino,double valor){
        if(verificarSaldo(contaRemetente,valor)) {
            contaRemetente.setSaldo(contaRemetente.getSaldo()-valor);
            contaDestino.setSaldo(contaDestino.getSaldo()+valor);
        }
        else throw new RuntimeException("Saldo insuficiente para realizar a operação");

    }
    public void guardarDinheiro(int numConta,double valor){
        verificarSaldo(conta,valor);
        conta.setSaldo(conta.getSaldo()-valor);
        conta.setSaldoGuardado(conta.getSaldoGuardado()+valor);
    }

    public void exibirConta(Conta conta){
        System.out.println(conta);
    }


}
