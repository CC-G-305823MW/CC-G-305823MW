package Thema7RekursionBinärBaum;

public class BaumKnotenProgramm {
	

	/**
	 * 				  							1

	 * 					2											3	
	 * 			4					5  					6					7
	 * 	 	8	   9		 	10    11	 		12	   13		     14	    15
	 * 
	 */
		
	    
		public static void main(String[] args) {
			int height;
			
			BaumKnoten wurzel = new BaumKnoten(1);
			
			wurzel.setLinks(new BaumKnoten	(2));
			wurzel.setRechts(new BaumKnoten	(3));
			//Höhe 1
			wurzel.setLinks(new BaumKnoten	(4));
			wurzel.setRechts(new BaumKnoten	(5));
			wurzel.setLinks(new BaumKnoten	(6));
			wurzel.setRechts(new BaumKnoten	(7));
			// Höhe 2
			wurzel.setLinks(new BaumKnoten	(8));
			wurzel.setRechts(new BaumKnoten	(9));
			wurzel.setLinks(new BaumKnoten	(10));
			wurzel.setRechts(new BaumKnoten	(11));
			wurzel.setLinks(new BaumKnoten	(12));
			wurzel.setRechts(new BaumKnoten	(13));
			wurzel.setLinks(new BaumKnoten	(14));
			wurzel.setRechts(new BaumKnoten	(15));
	
			
		}
	
}	

