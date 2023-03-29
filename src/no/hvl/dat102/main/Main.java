package no.hvl.dat102.main;

import no.hvl.dat102.sortering.*;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer[] tab = { 7, 4, 12311, 9, 57, 2, 13, 3, 6, 111, 2, -3, 15, 9, 532, 115 };

		Random tilfeldig = new Random();
		int n = 32000;
		int antal = 10;
		float start;
		float end;
		float sec;
		Integer[][] a = lagMatrise(n, antal);

		
		
		// SelectionSort
		a = lagMatrise(n, antal);
		start = System.nanoTime();
		for (int i = 0; i < antal; i++) {
			InsertionSort.insertionSort(a[i]);
		}
		end = System.nanoTime();
		sec = (end - start) / 1000000000;
		// printMatrise(a);
		System.out.println("SelectionSort: " + sec + "s");

		
		
		// InsertionSort
		a = lagMatrise(n, antal);
		start = System.nanoTime();
		for (int i = 0; i < antal; i++) {
			InsertionSort.insertionSort(a[i]);
		}
		end = System.nanoTime();
		sec = (end - start) / 1000000000;
		// printMatrise(a);
		System.out.println("InsertionSort: " + sec + "s");

		
		
		// QuickSort
		a = lagMatrise(n, antal);
		start = System.nanoTime();
		for (int i = 0; i < antal; i++) {
			QuickSort.quickSort(a[i], 0, a[i].length);
		}
		end = System.nanoTime();
		sec = (end - start) / 1000000000;
		// printMatrise(a);
		System.out.println("QuickSort: " + sec + "s");

		
		
//		// MergeSort
//		a = lagMatrise(n, antal);
//		start = System.nanoTime();
//		for (int i = 0; i < antal; i++) {
//			MergeSort.mergeSort(a[i], 0, a[i].length);
//		}
//		end = System.nanoTime();
//		sec = (end - start) / 1000000000;
//		// printMatrise(a);
//		System.out.println("MergeSort: " + sec + "s");

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

	public static void printMatrise(Integer[][] a) {

		for (Integer[] i : a) {

			for (int j : i) {

				System.out.println(j);

			}
		}

	}

}
