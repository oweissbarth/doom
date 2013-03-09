package doom;

class Position {

	private int x;
	private int y;

	//setter-function
	public void setXY ( int x, int y) {
		this.x = x;
		this.y = y;
	} 

	//getterfunctions
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}

	//equal-function 
	public static boolean equals (Position pos1, Position pos2) {
		if ((pos1.x == pos2.x) && (pos1.y == pos2.y)) {
			return true;		
		} else {
			return false;
		}
		
	}
}
