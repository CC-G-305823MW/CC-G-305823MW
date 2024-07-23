package Thema7RekursionBinärBaum;

public class BaumKnoten {

		public int wert;
		
		public BaumKnoten links, rechts;
		
		public int knoten;
		
		public BaumKnoten(int wert) {
			this.wert = wert;
			links = rechts = null;
		}
		
		BaumKnoten wurzel;
		
		int getHeight(BaumKnoten knoten) {
			if (knoten == null) {
				return 0;
		}
		// Berechne die Höhe des linken und rechten Teilbaums
        int leftHeight = getHeight(knoten.links);
        int rightHeight = getHeight(knoten.rechts);	
		
        // Die Höhe des Baumes ist die größere der beiden Höhen plus 1
        return Math.max(leftHeight, rightHeight) + 1;	
	}
		
		public BaumKnoten getLinks() {
			return links;
		}
		
		public void setLinks(BaumKnoten links) {
			this.links = links;
		}
		
		public BaumKnoten getRechts() {
			return rechts;
		}
		
		public void setRechts(BaumKnoten rechts) {
			this.rechts = rechts;
		}
	
}
	

