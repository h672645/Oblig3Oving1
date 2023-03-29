package no.hvl.dat102.Oppgave2;

import no.hvl.dat102.sortering.*;
import java.util.Formatter;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer[] tab = { 7, 4, 12311, 9, 57, 2, 13, 3, 6, 111, 2, -3, 15, 9, 532, 115 };

		int n = 32000;
		int kjoringer = 3;
		int antal = 2;
		float start;
		float end;
		float sec;
		Formatter fmt = new Formatter();
		Integer[][] a = lagMatrise(n, antal);

		//SelectionSort
		fmt.format("\nSelectionSort:\n %3s %13s %12s %20s\n", "n", "#Målinger", "Tid", "Teoretisk Tid");
		for (int j = 0; j < kjoringer; j++) {
			a = lagMatrise(n, antal);
			start = System.nanoTime();
			for (int i = 0; i < antal; i++) {
				SelectionSort.selectionSort(a[i]);
			}
			end = System.nanoTime();
			sec = (end - start) / 1000000000;
			printMatrise(a, fmt, n, antal, sec);
			n = n * 2;
		}
		
		n = 32000;
		
		// InsertionSort
		fmt.format("\nInsertionSort:\n %3s %13s %12s %20s\n", "n", "#Målinger", "Tid", "Teoretisk Tid");
		for (int j = 0; j < kjoringer; j++) {
			a = lagMatrise(n, antal);
			start = System.nanoTime();
			for (int i = 0; i < antal; i++) {
				InsertionSort.insertionSort(a[i]);
			}
			end = System.nanoTime();
			sec = (end - start) / 1000000000;
			printMatrise(a, fmt, n, antal, sec);
			n = n * 2;
		}
		
		n = 32000;

		// QuickSort
		fmt.format("\nQuickSort:\n %3s %13s %12s %20s\n", "n", "#Målinger", "Tid", "Teoretisk Tid");
		for (int j = 0; j < kjoringer; j++) {
			a = lagMatrise(n, antal);
			start = System.nanoTime();
			for (int i = 0; i < antal; i++) {
				QuickSort.quickSort(a[i], 0, a[i].length);
			}
			end = System.nanoTime();
			sec = (end - start) / 1000000000;
			printMatrise(a, fmt, n, antal, sec);
			n = n * 2;
		}

		n = 32000;

		//MergeSort
		fmt.format("\nMergeSort:\n %3s %13s %12s %20s\n", "n", "#Målinger", "Tid", "Teoretisk Tid");
		for (int j = 0; j < kjoringer; j++) {
			a = lagMatrise(n, antal);
			start = System.nanoTime();
			for (int i = 0; i < antal; i++) {
				MergeSort.mergeSort(a[i], 0, a[i].length);
			}
			end = System.nanoTime();
			sec = (end - start) / 1000000000;
			printMatrise(a, fmt, n, antal, sec);
			n = n * 2;
		}
		
		System.out.println(fmt);

	}

	public static Integer[][] lagMatrise(int lengde, int antall) {
		Random tilfeldig = new Random();
		int n = lengde;
		int antal = antall;
		Integer[][] a = new Integer[antal][n];
		// set inn tilfeldige heiltal i alle rekker
		for (int i = 0; i < antal; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = tilfeldig.nextInt(99);
			}
		}
		return a;
	}

	public static Formatter printMatrise(Integer[][] a, Formatter fmt, int n, int antal, float tid) {

		fmt.format("%2s %8s %20s %16s\n", n, antal, tid / antal, (tid / antal) / n);

		return fmt;
	}

}
