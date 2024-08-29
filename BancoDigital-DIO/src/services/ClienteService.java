package services;

import entities.Banco;
import entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    Banco banco = new Banco();
    public void cadastrarCliente(String name, String email, String cpf){
        Cliente cliente = new Cliente(name,email, cpf);
        banco.getClientesBanco().add(cliente);
    }
    public Cliente findByCPF(String cpf){
        if(!banco.getClientesBanco().isEmpty()){ //verifica se a lista tem elementos ou esta vazia
            for(Cliente c: banco.getClientesBanco()){ //cria um objeto que percorre a lista e compara os cpfs
                if(c.getCpf().equalsIgnoreCase(cpf)){
                    return c;
                }
            }
        }
        return null;
    }
    public List<Cliente> findAllCliente(){
        return banco.getClientesBanco();
    }
//    public void deleteCliente(String cpf){
//        Cliente cliente = findByCPF(cpf);
//        banco.getClientesBanco().remove(cliente);
//    }


}
