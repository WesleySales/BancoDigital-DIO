package repositories;

import entities.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteRepository {

    private Map<Long, Cliente> map = new HashMap<>();
    public void save (Cliente cliente){
        map.put(cliente.getId(), cliente);
    }
    public List<Cliente> findAll(){
        return new ArrayList<Cliente>(map.values());
    }
    public Cliente findById(long id) {
        return map.get(id);
    }
}
