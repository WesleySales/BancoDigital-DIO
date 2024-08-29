package entities;

import java.util.ArrayList;
import java.util.List;
public class Banco {

    private String name;
    private List<Cliente> clientesBanco;
    private List<Conta> contasBanco;
    public Banco() {
        this.clientesBanco = new ArrayList<>();
        this.contasBanco = new ArrayList<>();
    }

    public List<Cliente> getClientesBanco() {
        return clientesBanco;
    }

    public List<Conta> getContasBanco() {
        return contasBanco;
    }
}
