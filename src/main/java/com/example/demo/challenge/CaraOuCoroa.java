package com.example.demo.challenge;

import java.util.Scanner;

public class CaraOuCoroa {
	static Scanner scan = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a = 0, b = 0, m = 0, j = 0;
		String vezes = null, s = null;
		
		s = scan.next();

			while (sc.hasNext()) {
				vezes = sc.next();
				b = a + 1;
				
				if (Integer.parseInt(vezes.substring(a, b)) == 0) {
					m = m + 1;
					
				} else if (Integer.parseInt(vezes.substring(a, b)) == 1) {
					j = j + 1;
					
				}

				if (m + j == Integer.parseInt(s)) {
					System.out.println("Mary won " + m + " times and John won " + j + " times");

				}
			}

	}
}