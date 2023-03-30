package no.hvl.dat102.Oppgave5;

public class BinaerTreNode<T> {
	private T element;
	private BinaerTreNode<T> venstre;
	private BinaerTreNode<T> hogre;
	private BinaerTreNode<T> forelder;

	BinaerTreNode(T el) {
		element = el;
		venstre = null;
		hogre = null;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public BinaerTreNode<T> getVenstre() {
		return venstre;
	}

	public void setVenstre(BinaerTreNode<T> venstre) {
		this.venstre = venstre;
	}

	public BinaerTreNode<T> getHogre() {
		return hogre;
	}

	public void setHogre(BinaerTreNode<T> hogre) {
		this.hogre = hogre;
	}
	
	public BinaerTreNode<T> getForelder(){
		return forelder;
	}
	
	public void setForelder(BinaerTreNode<T> forelder) {
		this.forelder = forelder;
	}

}

