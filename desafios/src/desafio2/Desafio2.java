package desafio2;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<String> traco = new ArrayList<>();
        List<String> pipe = new ArrayList<>();

        for (int i = 0; i < 39; i++) {
            traco.add("-");
            System.out.print(traco.get(i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            for (int j = 0; j < 39; j++) {
                if (j == 0 || j == 38)
                    pipe.add("|");
                else
                    pipe.add(" ");
                System.out.print(pipe.get(j));
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 39; i++) {
            traco.add("-");
            System.out.print(traco.get(i));
        }
    }
}

