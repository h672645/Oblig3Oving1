package no.hvl.dat102.sortering;

public class MergeSort {

	public static void mergeSort(Integer[]a, int start, int slutt) {
		
		if(slutt - start < 2) {
			return;
		}
		
		int mid = (start + slutt) / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid, slutt);
		merge(a, start, mid, slutt);
	}
	
	public static void merge(Integer[] a, int start, int midtpunkt, int slutt) {
		
		if(a[midtpunkt-1] <= a[midtpunkt]) {
			return;
		}
		
		int i = start;
		int j = midtpunkt;
		int tellar = 0;
		
		int[] temp = new int[slutt - start];
		
		while(i < midtpunkt && j < slutt) {
			temp[tellar++] = a[i] <= a[j] ? a[i++] : a[j++];
		}
		
		System.arraycopy(a, i, a, start + tellar, midtpunkt - i);
		System.arraycopy(temp, 0, a, start, tellar);
	}
	
}
