package com.springframework.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());

        condutor.automovel();
    }

    @Autowired
    private Veiculo veiculo;

    public void automovel(){
        veiculo.acao();
    }

    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }
}