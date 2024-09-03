package services;

import entities.Cliente;
import repositories.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    ClienteRepository repository = new ClienteRepository();
    public void cadastrarCliente(String name, String email, String cpf){
        Cliente cliente = new Cliente(name,email, cpf);
        repository.save(cliente);
    }
    public Cliente findByCPF(String cpf){
        if(!repository.findAll().isEmpty()){ //verifica se a lista tem elementos ou esta vazia
            for(Cliente c: repository.findAll()){ //cria um objeto que percorre a lista e compara os cpfs
                if(c.getCpf().equalsIgnoreCase(cpf)){
                    return c;
                }
            }
        }
        return null;
    }
    public Cliente getById(Long id){
        Cliente cliente = repository.findById(id);
        return cliente;
    }

    public List<Cliente> findAll(){
        return repository.findAll();
    }
//    public void deleteCliente(String cpf){
//        Cliente cliente = findByCPF(cpf);
//        banco.getClientesBanco().remove(cliente);
//    }


}
