package no.hvl.dat102.Misc;

public class LinearNode<T> {

	private LinearNode<T> neste;
	private T element;
	
	public LinearNode() {
		neste = null;
		element = null;
	}
	
	public LinearNode<T> getNeste(LinearNode<T> node) {
		return neste;
	}
	
	public void setNeste(LinearNode<T> node){
		neste = node;
	}
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public void print() {
		System.out.println("Element i node: " + element);
	}
	
}
