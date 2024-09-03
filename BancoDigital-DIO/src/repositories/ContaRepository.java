package repositories;

import entities.Cliente;
import entities.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaRepository {

    private Map<Integer, Conta> map = new HashMap<>();

    public void save (Conta conta){
        map.put(conta.getNumeroDaConta(), conta);
    }
    public List<Conta> findAll(){
        return new ArrayList<Conta>(map.values());
    }
    public Conta findByConta(int numConta) {
        return map.get(numConta);
    }
}
