package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    List<Carro> listCarros = new ArrayList<>();

    listCarros.add(new Carro("Ford"));
    listCarros.add(new Carro("Chevrolet"));
    listCarros.add(new Carro("Fiat"));
    listCarros.add(new Carro("Peugeot"));

        System.out.println("Possui um carro? (listCarros.contains): " + listCarros.contains(new Carro("Ford")));

        System.out.println("Pegar o carro que está no index 2: " + listCarros.get(2));

        System.out.println("Qual o index de (indexof): " + listCarros.indexOf(new Carro("Fiat2")));

        System.out.println(listCarros);
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);



    }
}
