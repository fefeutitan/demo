package com.example.demo.challenge;
import java.text.DecimalFormat;
import java.util.Scanner;
public class CachorroQuente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media,h,p;
		//System.out.println("Digite o numero de hotdogs a participantes");
		h = sc.nextInt();
		p = sc.nextInt();
		
		media = h/p;    
		System.out.println(new DecimalFormat("#,##0.00").format(media));
		

	}

}
