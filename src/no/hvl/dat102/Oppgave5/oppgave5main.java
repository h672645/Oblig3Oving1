package no.hvl.dat102.Oppgave5;
import java.util.Formatter;
import java.util.Random;

public class oppgave5main {

	public static void main(String[] args) {
		
		Random random = new Random();
//		Formatter fmt = new Formatter();
		
		int antallNoder = 8191;
		int antallTre = 100;
		int maksHogde = -1;
		int minHogde = 1000;
		double gjennomsnittHogde = 0;
		double teoretiskMax = antallNoder-1;
		double teoretiskMin = Math.log(antallNoder+1)-1;;
		
		
		BS_Tre<Integer>[] treTab = new BS_Tre[antallTre];
		for(int i = 0; i < antallTre; i++) {
			
			treTab[i] = new BS_Tre<Integer>();
			for(int j = 0; j <= antallNoder; j++) {
				treTab[i].leggTil(random.nextInt());
			}	
			
			if(treTab[i].heightOfTree(treTab[i].getRot()) > maksHogde) {
				maksHogde = treTab[i].heightOfTree(treTab[i].getRot());
			}
			
			if(treTab[i].heightOfTree(treTab[i].getRot()) < minHogde) {
				minHogde = treTab[i].heightOfTree(treTab[i].getRot());
			}
			
			gjennomsnittHogde += treTab[i].heightOfTree(treTab[i].getRot());
			
			TreeIterator<Integer> treIterator = treTab[i].getInordenIterator(treTab[i].getRot());
			
//			while(treIterator.hasNext()) {
//				System.out.print(treIterator.next().getElement() + " ");
//			}
//			
//			System.out.println();
//			System.out.println("Høgde av tre Nr#" + i + " er: " + treTab[i].heightOfTree(treTab[i].getRot()));
		}
		
		System.out.println("Antall Tre: " + antallTre);
		System.out.println("Antall noder i hvert tre: " + antallNoder);
		System.out.println("Teoretisk minste høgde: " + teoretiskMin);
		System.out.println("Teoretisk maks høgde: " + teoretiskMax);
		System.out.println("Maks høgde: " + maksHogde);
		System.out.println("Minste høgde: " + minHogde);
		System.out.println("Gjennomsnittlig høgde: " + gjennomsnittHogde/antallTre);
		
	}

}
