package no.hvl.dat102.Oppgave5;

import java.util.NoSuchElementException;

public class TreeIterator<T> {
    private BinaerTreNode<T> next;

    public TreeIterator(BinaerTreNode<T> root) {
        next = root;
        if(next == null)
            return;

        while (next.getVenstre() != null)
           next = next.getVenstre();
    }

    public boolean hasNext(){
        return next != null;
    }

    public BinaerTreNode<T> next(){
        if(!hasNext()) throw new NoSuchElementException();
        BinaerTreNode<T> r = next;

        // If you can walk right, walk right, then fully left.
        // otherwise, walk up until you come from left.
        if(next.getHogre() != null) {
            next = next.getHogre();
            while (next.getVenstre() != null)
                next = next.getVenstre();
            return r;
        }

        while(true) {
            if(next.getForelder() == null) {
                next = null;
                return r;
            }
            if(next.getForelder().getVenstre() == next) {
                next = next.getForelder();
               return r;
            }
            next = next.getForelder();
        }
     }
 }