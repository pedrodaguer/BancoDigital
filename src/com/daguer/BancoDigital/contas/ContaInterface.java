package com.daguer.BancoDigital.contas;

public interface ContaInterface {

    void transferir(Conta conta, double valor);

    void depositar(double valor);

    void sacar(double valor);

    void imprimirExtrato();

}
