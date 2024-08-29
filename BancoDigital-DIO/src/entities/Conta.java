package entities;

public class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int contadorContas = 1026;
    private static double saldoInicial=1000.0;

    private int agencia;
    private int numeroDaConta;
    private double saldo;
    private double saldoGuardado;
    private Cliente cliente;

    public Conta(){}
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = contadorContas++;
        this.saldo = saldoInicial;
        this.cliente = cliente;
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

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                ", saldoGuardado=" + saldoGuardado +
                ", cliente=" + cliente +
                '}';
    }
}
