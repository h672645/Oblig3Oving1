package F13Oppgave1;

import java.util.Random;

public class SorterTabell {
	// Byter om a[i] og a[j]. Antar at b�de i og j er lovlege indeksar i tabellen.
	private static void swap(Object[] a, int i, int j) {
		if (i == j) {
	        return;
	    }
		Object temp = a[i];
		a[i] = a[j];
	    a[j] = temp;
	}
	
	public static <T extends Comparable<? super T>> void sorter(T[] a, int i, int j) {
		
		if(a[i].compareTo(a[j])>0) {
			T temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}

	// Utvalgssortering / Plukksortering (DAT100) (Selction sort)
	// Sorterer dei f�rste n elmementa i tabellen. Kanskje litt uvanlig
	// Kunne ogs� utelatt n og sortert heile tabellen.

	public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int minstePos = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j].compareTo(a[minstePos]) < 0) {
					minstePos = j;
				}
			}

			swap(a, i, minstePos);
		}
	}

	// Sortering ved innsetting (Insertion sort)
	public static <T extends Comparable<? super T>> void sorteringVedInsetting(T[] a, int n) {
		sorteringVedInsetting(a, 0, n - 1);
	}

	// Sorterer ein del av tabellen, start ... slutt (begge grensene er med)
	public static <T extends Comparable<? super T>> void sorteringVedInsetting(T[] a, int start, int slutt) {
		for (int i = start + 1; i <= slutt; i++) {
			T tmp = a[i];
			int j = i - 1; // siste i sortert del
			boolean ferdig = false;

			while (!ferdig && j >= 0) {
				
				if (tmp.compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
					j--;
				} else {
					ferdig = true;
				}

			}

			a[j + 1] = tmp;
		}
	}
	
	public static <T extends Comparable<? super T>> void sorteringVedInsettingToOmGangen(T[] a) {
		
		for(int usortert = 2; usortert < a.length; usortert+=2) {
			
			if (a[usortert - 1].compareTo(a[usortert - 2]) < 0) {
	            T tmp = a[usortert - 1];
	            a[usortert - 1] = a[usortert - 2];
	            a[usortert - 2] = tmp;
	        }
			
			T temp = a[usortert];
			int j = usortert;
			
			if(j+1 == a.length) {
				break;
			}
			while(j > 1 && (a[j+1].compareTo(a[j-1]) < 0)) {
				
				swap(a, j, j-2);
				swap(a, j+1, j-1);
				
				j -= 2;
			}
	    
		}
		System.out.println("----------------");
		System.out.print("Innsetting av tall-par sortert etter høgste:\n");
		print(a);
		System.out.println("----------------");
		SorterTabell.sorteringVedInsetting(a, a.length);
		System.out.print("Sortert med vanlig insertion-sort:\n");
		print(a);
	}

	public static <T> void print(T[] a) {
		System.out.print("Test: ");
		for(int i = 0; i < a.length; i++) {
			
			if(i == a.length-1) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}
			
		}
		System.out.println();
	}
	
}
