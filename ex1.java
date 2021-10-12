/*
Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ex1 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        List<Double> data = new ArrayList<>(); 

        while (sc.hasNext()) {
          data.add(sc.nextDouble());
        }
        sc.close();
        
        for (int i = 0; i < data.size(); i++) {
          if (data.get(i) % 2 == 0) {
            pares++;
          } else {
            impares++;
          }
          
          if (data.get(i) > 0) {
            positivos++;
          } else if (data.get(i) < 0){
            negativos++;
          }
        }

        System.out.println(pares + " par(es)");
        System.out.println(impares + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");
    }
	
}