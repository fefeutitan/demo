package com.example.demo.challenge;

import java.util.Scanner;

public class Copa {

	public static void main(String[] args) {
 
		Scanner leitor=new Scanner(System.in);
      
		int l,k;
		
	    System.out.print("Digite a posição de mestre Lu: ");
		l = leitor.nextInt();
		System.out.print("Digite a posição de mestre Kung: ");
		k = leitor.nextInt();
	    
		 if( (l-1)/2 == (k-1)/2 ){
		        System.out.println("oitavas\n");
		    } else if( (l-1)/4 == (k-1)/4 ){
		        System.out.println("quartas\n");
		    } else if( (l-1)/8 == (k-1)/8 ){
		        System.out.println("semifinal\n");
		    }else {
		        System.out.println("final\n");
		    }
	    	
    }
}