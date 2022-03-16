package one.digitalinovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Adicionou o carro? Se sim = true; (queueCarros.add): " + queueCarros.add(new Carro("Peugeot")));
        System.out.println("Fila de carros: " + queueCarros);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Adicionou o carro? Se não = false; (queueCarros.add): " + queueCarros.offer(new Carro("Renault")));
        System.out.println("Fila de carros: " + queueCarros);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Pega primeiro carro da fila (queue.peek): " + queueCarros.peek());
        System.out.println("Fila de carros: " + queueCarros);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Pega primeiro carro da fila e remove (queue.poll): " + queueCarros.poll());
        System.out.println("Fila de carros: " + queueCarros);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Fila está vazia? (isEmpty): " + queueCarros.isEmpty());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Tamanho da lista (size): " + queueCarros.size());
        System.out.println("Fila de carros: " + queueCarros);

    }
}
