package doom;

class Position {

	private int x;
	private int y;

	//Setter-Funktion um Koordinaten einzustellen
	public void setXY ( int x, int y) {
		this.x = x;
		this.y = y;
	} 

	//Getter-Funktionen um Koordinaten auszulesen
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}

	//Vergleichs-Funktion um zwei Positionen zu vergleichen
	public static boolean equals (Position pos1, Position pos2) {
		if ((pos1.x == pos2.x) && (pos1.y == pos2.y)) {
			return true;		
		} else {
			return false;
		}
		
	}
}
