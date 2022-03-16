package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println("Lista completa: " + stackCarros);
        System.out.println("Retira o último (pop): " + stackCarros.pop());

        System.out.println("Lista completa: " + stackCarros);
        System.out.println("Mostra o último (peek): " + stackCarros.peek());

        System.out.println("Lista completa: " + stackCarros);
        System.out.println("Lista está vazia? (empty): " + stackCarros.empty());


    }
}
