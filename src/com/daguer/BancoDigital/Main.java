package com.daguer.BancoDigital;

import com.daguer.BancoDigital.banco.Banco;
import com.daguer.BancoDigital.banco.Cliente;
import com.daguer.BancoDigital.contas.Conta;
import com.daguer.BancoDigital.contas.ContaCorrente;
import com.daguer.BancoDigital.contas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");
        Cliente Daguer = new Cliente("Pedro Daguer");


        Conta cc = new ContaCorrente(Daguer, banco);
        Conta poupanca = new ContaPoupanca(Daguer, banco);

        cc.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir(poupanca, 73);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
