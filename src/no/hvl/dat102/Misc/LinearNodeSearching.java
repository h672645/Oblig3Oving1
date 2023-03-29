package no.hvl.dat102.Misc;
import no.hvl.dat102.Misc.*;

public class LinearNodeSearching<T> {

	private LinearNode<T> neste;
	private int antall;
	
	public LinearNodeSearching(){
		neste = null;
		antall = 0;
	}
	
	public void leggTil(LinearNode<T> nyNode) {
		LinearNode<T> node = nyNode;
		
		if(neste == null) {
			neste = node;
			antall++;
		}
		
		node.setNeste(neste.getNeste(node));
		neste = node;
		antall++;
	}
	
}
