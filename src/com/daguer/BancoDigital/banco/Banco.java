package com.daguer.BancoDigital.banco;

import com.daguer.BancoDigital.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addContas(Conta conta) {
        this.contas.add(conta);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

}
