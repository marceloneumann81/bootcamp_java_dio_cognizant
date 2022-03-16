package one.digitalinovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> ListaCarros = new ArrayList<>();

        ListaCarros.add(new Carro("Ford"));
        ListaCarros.add(new Carro("Chevrolet"));
        ListaCarros.add(new Carro("Volskvagen"));

        System.out.println(ListaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));

    }
}
