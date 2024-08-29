package services;

import entities.Banco;
import entities.Cliente;
import entities.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaService {

    Conta conta = new Conta();
    Banco banco = new Banco();

    private ClienteService clienteService = new ClienteService();
    public void criarConta(String cpf){
        System.out.println(clienteService.findByCPF(cpf));
//        System.out.println("Chegou Aqui e o cliente é: "+cliente);
//        if(cliente!=null){
//            Conta conta = new Conta(cliente);
//            contaList.add(conta);
//        }
//        else throw new RuntimeException("Não foi possível criar a conta");
    }
    public List<Conta> findAllConta(){
        return banco.getContasBanco();
    }

    public Conta findByNumeroConta(int numConta){
        if(!banco.getContasBanco().isEmpty()){ //verifica se a lista tem elementos ou esta vazia
            for(Conta c: banco.getContasBanco()){ //cria um objeto que percorre a lista e compara os cpfs
                if(c.getNumeroDaConta()==numConta){
                    return c;
                }
            }
        }
        return null;
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
