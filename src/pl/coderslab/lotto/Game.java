package pl.coderslab.lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Game {
	
	public static void main(String[] args) {
		
		Integer[] lottoNum = lotto(); //6 numbers shuffled
		System.out.println("Wylosowane liczby to: "+Arrays.toString(lottoNum));
	
	
	}
	
	static Integer[] lotto () {
				
		Integer[] lottoNum = new Integer[49];
			for (int i=0; i<49; i++) {
				lottoNum[i] = i+1;
			}
			
		Collections.shuffle(Arrays.asList(lottoNum));
		Integer[] shuffledNum = Arrays.copyOf(lottoNum, 6);
		System.out.println(Arrays.toString(lottoNum));
				
		Integer[] pickedNum = new Integer [6];
	
			
		
		for (int i=0; i<pickedNum.length; i++) {
			try {
				while (true) {
				System.out.print("Pick your numbers: ");
				Scanner sc = new Scanner(System.in);
				Integer n = Integer.parseInt(sc.next());
				if(n>=1 && n<=49) {
			
				pickedNum[i] = n;
				break;
				
				}else if (n>49 || n<1) {
				
				System.out.println("Out of range number");
								
				}else if (pickedNum[i].contains) {//sprawdzić!!
				
				System.out.println("Pick a different number");
				i--;
										
				
				}
				}
			}catch (Exception e) {
				System.out.println("This is not a number");
				i--;
				}
						
		}
		
		System.out.println("liczby użytkownika "+Arrays.toString(pickedNum));
		System.out.println(Arrays.toString(shuffledNum));
		
		
		
		
//		sc.close();
		return shuffledNum;
		
		
			
	
		
	
	
	}
		
}

	


 