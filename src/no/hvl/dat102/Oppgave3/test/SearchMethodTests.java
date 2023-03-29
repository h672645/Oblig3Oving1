package no.hvl.dat102.Oppgave3.test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static no.hvl.dat102.Oppgave3.test.SearchMethods.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

class SearchMethodTests {
	Random rn = new Random();
	int rndNumber = 97;
	int n = 50000000;
	
	//Oppretter tabeller med helltall mellom 0 og 99;
	Integer[] tabUsortert = SearchMethods.lagTabellUsortert(n);
	Integer[] tabSortert =  SearchMethods.lagTabellSortert(n);
	
	@Test
	void SortedTestTalletFinnes() {
		boolean sjekk = sortedLinearSearch(tabSortert, rndNumber);
		assertTrue(sjekk);
	}
	
	@Test
	void SortedTestTalletFinnesRakst() {
		boolean sjekk = sortedLinearSearch(tabSortert, 20);
		assertTrue(sjekk);
	}
	
	@Test
	void SortedTestTalletFinnesIkke() {
		boolean sjekk = sortedLinearSearch(tabSortert, 100);
		assertFalse(sjekk);
	}
	
	@Test
	void UnsortedTalletFinnes() {
		boolean sjekk = linearSearch(tabUsortert, rndNumber);
		assertTrue(sjekk);
	}
	
	@Test
	void UnsortedTestFinnesIkke() {
		boolean sjekk = linearSearch(tabUsortert, 100);
		assertFalse(sjekk);
	}

	@Test
	void BinarySearchFinnes() {
		assertTrue(binarySearch(tabSortert, rndNumber));
	}
	
	@Test
	void BinarySearchFinnesIkke() {
		assertFalse(binarySearch(tabSortert, 100));
	}
}
