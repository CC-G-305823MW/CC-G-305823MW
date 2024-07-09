package Thema5Arrays;

import java.util.Arrays;

public class aufg51_2 {

	public static void main(String[] args) {
	
	
	  int[] geradesarray = new int[20];
	    for ( int i = 0; i < geradesarray.length; i++) {
	    	geradesarray[i] = (int) (Math.random()*50)	*2 ; // Nur gerade Zahlen
	    	System.out.println("20 zufällige gerade Zahlen: \t" + geradesarray[i]);
	    	}
	    
	    
	    int[] sortedarray = new int[20];
	    for ( int i = 0; i < sortedarray.length; i++) {
	    	sortedarray[i] = (int) (Math.random()*100)	; // Sortierte Zahlen
	    	Arrays.sort(sortedarray);
	    	System.out.println("20 sortierte Zahlen: \t" + sortedarray[i]);
	    
	    
	    }

		}

	}

