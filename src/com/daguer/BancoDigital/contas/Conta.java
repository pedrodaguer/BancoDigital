package com.daguer.BancoDigital.contas;

import com.daguer.BancoDigital.banco.Banco;
import com.daguer.BancoDigital.banco.Cliente;

public abstract class Conta implements ContaInterface {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    private static final int AGENCIA_PADRAO = 23;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setConta(this);
        banco.addContas(this);
        banco.addClientes(cliente);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirInformacoes() {
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Cliente: " + this.cliente.getNome());
    }
}
