package no.hvl.dat102.Oppgave5;

import java.util.Iterator;

public class BS_Tre<T extends Comparable<? super T>> implements SoektreInterface<T> {

	private BinaerTreNode<T> rot;
	// Kunne hatt med
	// private int antall;

	public BS_Tre() {
		rot = null;
	}

	public BS_Tre(T element) {
		rot = new BinaerTreNode<T>(element);
	}

	public boolean erTom() {
		boolean sjekk = false;
		if (rot == null) {
			sjekk = true;
		}
		return sjekk;
	}
	
	public BinaerTreNode<T> getRot() {
		return rot;
	}

	public int heightOfTree(BinaerTreNode<T> rot) {
		// standard verdi for tomt binært søketre er -1.
		if (rot == null) {
			return -1;
		} else {
			int vestreHogde = heightOfTree(rot.getHogre());
			int hogreHogde = heightOfTree(rot.getVenstre());
			return Math.max(vestreHogde, hogreHogde) + 1;
		}
	}

	public boolean inneholder(T element) {
		T sjekk = finn(element);
		if(sjekk != null) {
			return true;
		}
		return false;
	}

	public T finn(T element) {

		return finn(element, rot);
	}

	private T finn(T element, BinaerTreNode<T> p) {

		T svar = null;

		// basis: p == null -> tomt undertre, elementet finst ikkje

		if (p != null) {
			int sml = element.compareTo(p.getElement());
			if (sml == 0) { // basistilfelle
				svar = p.getElement();
			}
			if (sml < 0) {
				svar = finn(element, p.getVenstre());
			} else {
				svar = finn(element, p.getHogre());
			}
		}

		return svar;
	}

	public T leggTil(T nyElement) {
		T resultat = null;
		if (rot == null) {
			rot = new BinaerTreNode<T>(nyElement);
		} else {
			resultat = leggTil(nyElement, rot);
			
		}
		return resultat;
	}

	private T leggTil(T nyttElement, BinaerTreNode<T> p) {

		// p er ulik null

		T resultat = null;
		int sml = nyttElement.compareTo(p.getElement());

		if (sml == 0) { // elementet finst allerede
			resultat = p.getElement(); // sender tilbake gammel verdi
			p.setElement(nyttElement);
		} else if (sml < 0) {
			if (p.getVenstre() != null) { // p har venstrebarn
				resultat = leggTil(nyttElement, p.getVenstre());
				p.getVenstre().setForelder(p);
			} else {
				p.setVenstre(new BinaerTreNode<T>(nyttElement));
				p.getVenstre().setForelder(p);
			}
		} else {
			if (p.getHogre() != null) { // p har h�grebarn
				resultat = leggTil(nyttElement, p.getHogre());
				p.getHogre().setForelder(p);
			} else {
				p.setHogre(new BinaerTreNode<T>(nyttElement));
				p.getHogre().setForelder(p);
			}
		}

		return resultat;
	}

	public T fjern(T element) {

		return null;
	}

	public TreeIterator<T> getInordenIterator(BinaerTreNode<T> rot) {
		TreeIterator<T> iterator = new TreeIterator<T>(rot);
		return iterator;
	}

}
