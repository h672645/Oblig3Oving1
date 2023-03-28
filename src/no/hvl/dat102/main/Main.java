	package no.hvl.dat102.main;
import no.hvl.dat102.sortering.*;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer[] tab = { 7, 4, 12311, 9, 57, 2 , 13, 3, 6, 111, 2, -3, 15, 9, 532, 115};
		
		Random tilfeldig = new Random();
		int n = 32000;
		int antal = 10;
		Integer[][] a = new Integer[antal][n];
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antal; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = tilfeldig.nextInt();
			}
		}

		// start tidsmåling
		long start1 = System.nanoTime();
		
		
		for (int i = 0; i < antal; i++) {
			
			InsertionSort.insertionSort(a[i]);
			
		}
		
		long end1 = System.nanoTime();
		
		long sec = (end1 - start1) / 1000000000;

		// slutt tidsmåling

		for (Integer[] i : a) {

			for (int j : i) {

				System.out.println(j);

			}
		}

		System.out.println("Elapsed Time in nano seconds: " + sec);
		
		QuickSort.quickSort(tab, 0, tab.length);
		for(int i : tab) {
			System.out.print(i + " ");
		}
	}

}
