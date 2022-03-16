package com.projetoNo;

public class Main {

    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo no1");

        No<String> no2 = new No<>("conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("conteudo no4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println("No 1: " + no1);
        System.out.println("Prox. No: " + no1.getProximoNo());
        System.out.println("No2 : " + no2);

        System.out.println("-----------------");

        System.out.println("No 1: " + no1);
        System.out.println("Prox. No: " + no1.getProximoNo());
        System.out.println("Prox. No: " + no1.getProximoNo().getProximoNo());
        System.out.println("Prox. No: " + no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println("Prox. No: " + no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println("______________________________________________");

        No<Integer> noInt1 = new No<Integer>(1);

        No<Integer> noInt2 = new No<Integer>(2);
        noInt1.setProximoNo(noInt2);

        No<Integer> noInt3 = new No<Integer>(3);
        noInt2.setProximoNo(noInt3);

        System.out.println("No 1 (integer): " + noInt1);
        System.out.println("Prox. No: " + noInt1.getProximoNo());
        System.out.println("Prox. No: " + noInt1.getProximoNo().getProximoNo());
        System.out.println("Prox. No: " + noInt1.getProximoNo().getProximoNo().getProximoNo());



    }


}
