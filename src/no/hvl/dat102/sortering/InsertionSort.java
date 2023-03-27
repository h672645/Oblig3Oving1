package no.hvl.dat102.sortering;

public class InsertionSort {

	public static void insertionSort(Integer[] a) {
		
		for(int usortert = 1; usortert < a.length; usortert++) {
			
			int i;
			int temp = a[usortert];
			
			for(i = usortert; i > 0 && temp < a[i-1]; i--) {
				a[i] = a[i - 1];
			}
			
			a[i] = temp;
		}
	}
}
