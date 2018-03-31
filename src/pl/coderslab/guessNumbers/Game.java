package pl.coderslab.guessNumbers;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		guessNumbers();
	}
	
		
	private static void guessNumbers() {
		
		Random r = new Random();
		int a = r.nextInt(101);
//		System.out.println(a);
		while(true) {
			System.out.print("Zgadnij liczbę: ");
			try {
				
				Scanner sc = new Scanner(System.in);
				int b = sc.nextInt();
				if(b==a) {
					System.out.println("Brawo!");
					break;
				
				}else if (b>a) {
					System.out.println("Za dużo");
				
				}else if (b<a) {
					System.out.println("Za mało");
				}
				
			} catch (Exception e) {
				System.out.println("To nie jest liczba");
			}			
				
		
			
			
			
			}
		
		
	}
}
