import java.util.ArrayList;
import java.util.List;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int contadorContas = 1026;
    private static double saldoInicial=1000.0;
    private int agencia;
    private int numeroDaConta;
    private double saldo;
    private double saldoGuardado;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = contadorContas++;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }


    public void sacar(double valor){
        System.out.println(verificarSaldo(valor)==true?(saldo-=valor)+". Saque realizado": "Saldo insuficiente para operação");
    }

    public boolean verificarSaldo(double valor){
        if(saldo>=valor){return true;} else{return false;}
    }




    public void depositar(double valor){
            saldo += valor;
            System.out.println(String.format("%s, Seu depósito foi realizado com sucesso.", this.cliente.getNome()));
    }

    public void transferir(double valor, Conta contaDestino){
        if(verificarSaldo(valor)==true) {
            saldo-=valor;
            contaDestino.saldo+=valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para operação");
        }
    }
    public void guardarDinheiro(double valor){
        if(verificarSaldo(valor)==true) {
            saldo-=valor;
            saldoGuardado+=valor;
            System.out.println("Dinheiro guardado!");
        } else {
            System.out.println("Saldo insuficiente para operação");
        }
    }

    protected void exibirConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroDaConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("Saldo Guardado: %.2f\n", this.saldoGuardado));
    }

    protected void exibirSaldo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Saldo: %.2f\n", this.saldo));
    }


    public double getSaldoGuardado() {
        return saldoGuardado;
    }

    public void setSaldoGuardado(double saldoGuardado) {
        this.saldoGuardado = saldoGuardado;
    }

    public int getAgencia() {
        return agencia;
    }


    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }
}
