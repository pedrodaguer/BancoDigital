package com.daguer.BancoDigital.banco;

import com.daguer.BancoDigital.contas.Conta;

public class Cliente {

    private String nome;
    private Conta conta;

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
}
