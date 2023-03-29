package no.hvl.dat102.Oppgave3.test;

import java.util.Random;

import no.hvl.dat102.sortering.MergeSort;

public class SearchTesting {

	public static void main(String[] args) {

		int n = 6;
		int antal = 4;
		Integer[][] tabSortert = lagMatriseSortert(n, antal);
		
		Integer[][] tabUsortert = lagMatriseUsortert(n, antal);
		
		skrivUt(tabSortert, "Sortert:");
		
		skrivUt(tabUsortert, "Usortert:");
		
	}

	public static Integer[][] lagMatriseSortert(int lengde, int antall) {
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
		
		for(int i = 0; i < antal; i++) {
			MergeSort.mergeSort(a[i], 0, a[i].length);
		}
		
		return a;
	}
	
	public static Integer[][] lagMatriseUsortert(int lengde, int antall) {
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
	
	public static void skrivUt(Integer[][] a, String txt) {
		
		System.out.print(txt + "\n");
		for(Integer[] i : a) {
			
			for(Integer j : i) {
				
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
		System.out.println();
	}
	
}
