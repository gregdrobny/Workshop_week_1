package pl.coderslab.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Game {
	
	public static void main(String[] args) {
		
		Integer[] lottoNum = lotto(); //6 numbers shuffled
		System.out.println("Wylosowane liczby to: "+Arrays.toString(lottoNum));
	
	
	}
	
	static Integer[] lotto () {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (sc.hasNextInt()) {
			//fill in array with 6 elements from user
			break;
			
		}
		
				

		Integer[] arr = new Integer[49];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		Collections.shuffle(Arrays.asList(arr));
		Integer[] copyArray = Arrays.copyOf(arr, 6);
	
		sc.close();
		return copyArray;
	}
		
}

	


 