package com.example.demo.challenge;

import java.util.Scanner;

import java.util.Scanner;

public class TrocaGarrafa {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);

		int n = 0,k = 0,j = 0;
		String s = null;
		System.out.println("Digite Numero de testes");
        int t = scan.nextInt();

        if((1 <= t) && (t <= 10000)) {
           for(  int i = 0 ; i < t ; i++ ){
        	   
        	   int x = 0;
        	   System.out.println("Digite os numeros");
        	   while (scan.hasNext()) {
            	   s =scan.next();
            	   if (x == 0) {
                	   n = Integer.parseInt(s);
                	   k=0;
            	   }else if (x == 1) {
					k = Integer.parseInt(s);
					x = -1;
            	   }
            	   x++;
                   if(k>=1 && n<=10000){
                       j=n/k;
                       System.out.println(j);
                   }
        	   }
        	   
        	}
          }
    }
       
}