package no.hvl.dat102.main;
import no.hvl.dat102.sortering.*;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
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
			//
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
