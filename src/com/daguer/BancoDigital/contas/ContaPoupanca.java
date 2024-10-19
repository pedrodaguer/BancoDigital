package com.daguer.BancoDigital.contas;
import com.daguer.BancoDigital.banco.Banco;
import com.daguer.BancoDigital.banco.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta poupança:");
        super.ImprimirInformacoes();
    }
}
