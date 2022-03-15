package com.mycompany.atividadearrayoutofbounds;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ArrayOutOfBounds {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        int quant;
        int indice;
        int recebInd;
        
        try{
            System.out.println("---------------------QUANTIDADE DE ELEMENTO--------------------------");
            System.out.println("Digite a quantidade de elementos que deseja para a sua matriz: ");
            quant = t.nextInt();
            System.out.println("---------------------PREENCHENDO OS ELEMENTOS------------------------");

            int[] matriz = new int[quant];

            for (indice = 0; indice < quant; indice++) {
                System.out.println("\nDigite o numero na posição " + indice + ":");
                matriz[indice] = t.nextInt();
            }

            System.out.println("---------------------------------INDICE------------------------------");
            System.out.println("\nDigite o indice que deseja acessar: ");
            recebInd = t.nextInt();

            System.out.println("\nIndice: " + matriz[recebInd]);
        }
        catch(ArrayIndexOutOfBoundsException arrayOutOfBounds){
            System.err.printf("\nExceção: %s", arrayOutOfBounds);
            t.nextLine();
            System.out.println("O INDICE NÃO EXISTE! Tente novamente.");
        }
        
        catch(InputMismatchException inputMismatchException){
            System.err.printf("Exceção: %s", inputMismatchException); 
            System.out.println("DIGITE UM NUMERO DO TIPO INTEIRO! Tente novamente!");
        }
    }
}
