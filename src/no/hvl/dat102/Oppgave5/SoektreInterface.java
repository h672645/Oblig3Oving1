package no.hvl.dat102.Oppgave5;

import java.util.Iterator;

public interface SoektreInterface<T extends Comparable<? super T>> {
	/** S�ker etter et gitt element i treet.
	 * 
	 * @param element elementet vi s�ker etter.
	 * @return true om elementet finst, false elles.
	 */
	boolean inneholder(T element);

	/** Henter et element i treet.
	 * 
	 * @param element elementet vi leiter etter.
	 * @return Elementet dersom det finst, elles null.
	 */
	T finn(T element);

	/**
	 * Legg eit element til treet dersom det ikkje finst fr� f�r. Elles 
	 * etstattar blir det gamle elementet erstatta med det nye.
	 * 
	 * @param nyElement elementet som skal leggast til
	 * @return null om elementet ikkje finst fr� f�r. Elles det element som
	 * var i treet fr� f�r.
	 */
	T leggTil(T nyElement);

	/** Fjernar eit element fr� treet.
	 * 
	 * @param element elementet som skal fjernast.
	 * @return elementet som vart fjerna eller null om det ikkje finst.
	 */
	T fjern(T element);
	
	/** Lagar ein iterator som g�r gjennom alle element i treet i inorden.
	 *  
	 * @return ein iterator som elementa i sortert rekkef�lge.
	 */
	TreeIterator<T> getInordenIterator(BinaerTreNode<T> rot);

}