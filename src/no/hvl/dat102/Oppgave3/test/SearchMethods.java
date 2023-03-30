package no.hvl.dat102.Oppgave3.test;

import java.util.Random;

import no.hvl.dat102.Oppgave1.Sortering.MergeSort;

public class SearchMethods {

	public static boolean linearSearch(Integer[] tab, int tall) {

		boolean sjekk = false;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == tall) {
				return sjekk = true;
			}
		}

		return sjekk;
	}

	public static boolean sortedLinearSearch(Integer[] tab, int tall) {

		boolean sjekk = false;

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == tall) {
				return sjekk = true;
			}

			if (tab[i] > tall) {
				return sjekk = false;
			}
		}

		return sjekk;
	}

	public static Integer[] lagTabellSortert(int lengde) {
		Random tilfeldig = new Random();
		int n = lengde;
		Integer[] a = new Integer[n];
		// set inn tilfeldige heiltal i alle rekker

		for (int j = 0; j < n; j++) {
			a[j] = tilfeldig.nextInt(99);
		}

		MergeSort.mergeSort(a, 0, a.length);

		return a;
	}

	public static Integer[] lagTabellUsortert(int lengde) {
		Random tilfeldig = new Random();
		int n = lengde;
		Integer[] a = new Integer[n];
		// set inn tilfeldige heiltal i alle rekker

		for (int j = 0; j < n; j++) {
			a[j] = tilfeldig.nextInt(99);
		}

		return a;
	}

	public static boolean binarySearch(Integer[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return true;
            }
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return false;
    }

    public static int recursiveBinarySearch(Integer[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

	public static int recursiveBinarySearch(Integer[] input, int start, int end, int value) {
		if (start >= end) {
			return -1;
		}

		int midpoint = (start + end) / 2;
		System.out.println("midpoint = " + midpoint);

		if (input[midpoint] == value) {
			return midpoint;
		} else if (input[midpoint] < value) {
			return recursiveBinarySearch(input, midpoint + 1, end, value);
		} else {
			return recursiveBinarySearch(input, start, midpoint, value);
		}
	}

}
