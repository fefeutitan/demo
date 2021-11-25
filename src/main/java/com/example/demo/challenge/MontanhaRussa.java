package com.example.demo.challenge;

import java.util.Scanner;

public class MontanhaRussa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant = 0,flag = 0,alt,n,amin,amax;
		
//		System.out.println("Digite o numero de visitantes a altura maxima e a altura minima");
		n = sc.nextInt();
		amin = sc.nextInt();
		amax = sc.nextInt();
//		System.out.println("Digite as alturas");		
		while (sc.hasNext()) {
			alt = sc.nextInt();
			flag = flag+1;
			if(alt >= amin && alt <= amax){
				quant = quant+1;
			}
			if(flag==n){
				System.out.println(quant);
				
			}
		}
		sc.close();

	}

}
