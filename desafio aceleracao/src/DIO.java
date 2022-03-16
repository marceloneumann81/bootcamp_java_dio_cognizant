import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, flag = 1;
        double media;


        int opcao;

        do{
            System.out.println("novo calculo (1-sim 2-nao)");
            opcao= leitor.nextInt();
            switch(opcao){
                case 1:
                    nota1 = leitor.nextDouble();
                    nota2 = leitor.nextDouble();
                    media = (nota1+nota2)/2;
                    System.out.println(media);
                case 2:
                    break;

            }

        }while (opcao!= 2);



    }
}
