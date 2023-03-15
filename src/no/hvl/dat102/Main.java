package no.hvl.dat102;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer[] tab = { 7, 4, 1, 9, 5, 2 };
		// String[] tab2 = {"b", "a"};

		// SorterTabell.utvalgssortering(tab, tab.length);
		SorterTabell.sorteringVedInsetting(tab, tab.length);

		for (Integer e : tab) {
			System.out.print(e + " ");
		}

		System.out.println();

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

		
		long start1 = System.nanoTime();
		
		// start tidsmåling
		for (int i = 0; i < antal; i++) {
			SorterTabell.sorteringVedInsetting(a[i], 16000);
		}
		// slutt tidsmåling

		for (Integer[] i : a) {

			for (int j : i) {

				System.out.println(j);

			}
		}

		long end1 = System.nanoTime();
		
		long sec = (end1 - start1) / 1000000000;
		System.out.println("Elapsed Time in nano seconds: " + sec);

	}
}
