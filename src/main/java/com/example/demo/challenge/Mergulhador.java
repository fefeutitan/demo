package com.example.demo.challenge;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Mergulhador {
 
	public static void main(String[] args) throws IOException {
 
		Scanner input=new Scanner(System.in);
      
		int i, j, y, competidores;
		double menor = 10.0, maior = 0.0, media = 0.0,dificuldade = 0.0;
		String nome = null;


	    //System.out.print("Digite a quantidade de mergulhadores: ");
	    competidores = input.nextInt();
	        double notas[][] = new double[competidores][7];
	     
		    for (i = 0; i < notas.length; i = i + 1) {
		        //System.out.print("Digite o nome do mergulhador: ");
		        nome = input.next();
		        //System.out.print("Digite o grau de dificuldade do mergulho: ");
		        dificuldade = input.nextDouble();
		        menor = 10.0;
		        maior = 0.0;
		            for (j = 0; j < notas[0].length; j = j + 1) {
		                //System.out.println("Digite a nota " + (1 + j) + " do mergulhador " + (i + 1));
		                notas[i][j] = input.nextDouble();
		                if (notas[i][j] > maior) {
		                   maior = notas[i][j];
		                }
		                if (notas[i][j] < menor) {
		                   menor = notas[i][j];
		                }
		            }

		            	media = 0.0;
	    	            for (y = 0; y < notas[0].length; y = y + 1) {
	    	                media = media + notas[i][y];
	    	            }
	    	            media = media - (maior + menor);
		    	        media = media * dificuldade;
		    	        
		    	        System.out.println("Nome " + nome + " Média = " + new DecimalFormat("#,##0.00").format(media));
		    }
	    	
    }
}
      