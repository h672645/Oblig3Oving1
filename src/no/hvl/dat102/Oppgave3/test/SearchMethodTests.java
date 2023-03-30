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
	Integer[] tabTom = {};
	
	//Oppretter tabeller med helltall mellom 0 og 99;
	Integer[] tabUsortert = SearchMethods.lagTabellUsortert(n);
	Integer[] tabSortert =  SearchMethods.lagTabellSortert(n);
	
	@Test
	void sortedLinearSearchFinnes() {
		assertTrue(sortedLinearSearch(tabSortert, rndNumber));
	}
	
	@Test
	void sortedLinearSearchFinnesRakst() {
		assertTrue(sortedLinearSearch(tabSortert, 20));
	}
	
	@Test
	void sortedLinearSearchFinnesIkke() {
		assertFalse(sortedLinearSearch(tabSortert, 100));
	}
	
	@Test
	void linearSearchTomTabell() {
		assertFalse(linearSearch(tabTom, 0));
	}
	
	@Test
	void linearSearchFinnes() {
		assertTrue(linearSearch(tabUsortert, rndNumber));
	}
	
	@Test
	void linearSearchFinnesIkke() {
		assertFalse(linearSearch(tabUsortert, 100));
	}

	@Test
	void BinarySearchFinnes() {
		assertTrue(binarySearch(tabSortert, rndNumber));
	}
	
	@Test
	void BinarySearchFinnesIkke() {
		assertFalse(binarySearch(tabSortert, 100));
	}
	
	@Test
	void BinarySearchTomTabell() {
		assertFalse(binarySearch(tabTom,0));
	}
	
}
