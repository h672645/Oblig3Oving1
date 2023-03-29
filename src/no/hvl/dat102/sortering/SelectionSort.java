package no.hvl.dat102.sortering;

public class SelectionSort {

	public static void swap(Integer[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
	
	public static void selectionSort(Integer[] a) {
		
		for(int indeks = a.length-1; indeks > 0; indeks--) {
			
			int storste = 0;
			
			for(int i = 1; i <= indeks; i++) {
				
				if(a[i].compareTo(a[storste]) > 0) {
					
					storste = i;
					
				}
				
			}
			
			swap(a, storste, indeks);
			
		}
		
	}
	
}
