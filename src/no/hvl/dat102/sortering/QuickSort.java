package no.hvl.dat102.sortering;

public class QuickSort {

	public static <T> void quickSort(Integer[] a, int start, int slutt) {
		
		if(slutt - start < 2) {
			return;
		}
		
		int pivotIndeks = partition(a, start, slutt);
		
		quickSort(a, start, pivotIndeks);
		quickSort(a, pivotIndeks + 1, slutt);
		
	}
	
	public static <T> int partition(Integer[] a, int start, int slutt) {
		
		int pivot = a[start];
		int i = start;
		int j = slutt;
		
		while(i < j) {
			
			while(i < j && a[--j] >= pivot);
			if(i < j) {
				a[i] = a[j];
			}
			
			while(i < j && a[++i] <= pivot);
			if(i < j) {
				a[j] = a[i];
			}
			
		}
		
		a[j] = pivot;
		return j;
	}
	
}
