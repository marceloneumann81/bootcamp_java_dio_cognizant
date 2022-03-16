package br.com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};
        int resultado = 0;

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador %2 >0)
                    throw new 
                resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch()
            {

                if(denominador[i] == 0)
                    throw new ArithmeticException(denominador[i]);
                throw new ArrayIndexOutOfBoundsException(denominador[i]);
            }
            }


            (DivisaoNaoExataException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());

            }
        }

        System.out.println("O programa continua...");
    }
}


