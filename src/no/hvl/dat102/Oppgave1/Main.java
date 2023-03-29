package no.hvl.dat102.Oppgave1;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Integer[] tab = { 7, 4, 12311, 9, 57, 2 , 13, 3, 6, 111, 2, -3, 15, 9, 532, 115};
		// String[] tab2 = {"b", "a"};

		// SorterTabell.utvalgssortering(tab, tab.length);
		//SorterTabell.sorteringVedInsetting(tab, tab.length);

		//for (Integer e : tab) {
		//	System.out.print(e + " ");
		//}

		//System.out.println();

		Random tilfeldig = new Random();
		int n = 8;
		int antal = 1;
		Integer[][] a = new Integer[antal][n];
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antal; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = tilfeldig.nextInt(10);
			}
		}

		// start tidsmåling
		long start1 = System.nanoTime();
		
		for (int i = 0; i < antal; i++) {
			//SorterTabell.sorteringVedInsetting(a[i], 1);
		}

		// slutt tidsmåling
		long end1 = System.nanoTime();
		long sec = (end1 - start1) / 1000000000;
		
		for (Integer[] i : a) {

			for (int j : i) {

				System.out.print(j +",");

			}
			System.out.println();
		}
		
		System.out.println("Elapsed Time in nano seconds: " + sec);

		//----------------------------------------------------------//
		
		SorterTabell.sorteringVedInsettingToOmGangen(tab);
		
		start1 = System.nanoTime();
		
		for (int i = 0; i < antal; i++) {
			SorterTabell.sorteringVedInsettingToOmGangen(a[i]);
		}

		sec = (System.nanoTime() - start1)/1000000;
		
		System.out.println("Elapsed Time in nano seconds: " + sec);
	}
}
