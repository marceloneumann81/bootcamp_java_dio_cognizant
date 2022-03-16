import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2a {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

//declare suas variaveis corretamente
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();
        int num4 = leitor.nextInt();
        int num5 = leitor.nextInt();


        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        numeros.add(num5);


        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for(int i=0 ; i < 5 ; i++){
//            System.out.println("Digite o número " + (i+1) + ":");
//            numeros.add(Integer.parseInt(leitor.next()));
            if(numeros.get(i)  %2 == 0){
                par += 1 ;
            }else{
                impar += 1;
                }
            if(numeros.get(i) >= 0 ){
                if(numeros.get(i) != 0 ){
                    positivo += 1;
                }
            }else{
                negativo += 1;
            }
        }
        System.out.println( par + " par(es)");
        System.out.println( impar + " impar(es)");
        System.out.println( positivo + " positivo(s)");
        System.out.println( negativo + " negativo(s)");





    }
}



