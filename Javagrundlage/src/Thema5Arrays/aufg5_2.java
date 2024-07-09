package Thema5Arrays;

import java.util.ArrayList;
import java.util.List;


public class aufg5_2 {

	public static void main(String[] args) {
		
		int[] maxarray = new int[20];
		int max = 0;
		List<Integer> maxIndexes = new ArrayList<>();
		int i;		
		
	    for (  i = 0; i < maxarray.length; i++) {
	    	maxarray[i] = (int) (Math.random()*101)	 ; 
	    if (maxarray[i] > max) {
	    	max = maxarray[i];
	    	maxIndexes.clear();
	    	maxIndexes.add(i);
	    }
	    else if (maxarray[i] == max) {
            maxIndexes.add(i);
        }
	    System.out.println(maxarray [i] +"\t" + i) ;
	    
	    	
	    	}
	    System.out.println("Größte Zahl im Array ist: \t" + max +"\t" +maxIndexes) ;
	}

}


