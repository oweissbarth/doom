package doom;
class GameTile {
	private Position pos;
	
	//Standartausgabe von einem Tile
	public String toString() {
		return "";	
	}

	//Set-Funktion um Koordinaten zu definieren
	public void setXY(int x , int y) {
		this.pos = new Position();
		this.pos.setXY(x,y);
	}
	
	//Get-Funktion um X-Koordinate zu bestimmen
	public int getX(){
		int x = this.pos.getX();
		return x;
	}

	//Get-Funktion um Y-Koordinate zu bestimmen
	public int getY(){
		int y = this.pos.getY();
		return y;
	}	
}


//Leeres Feld
class EmptyTile extends GameTile {
		
	//Konstruktor eines leeren Feldes	
	public EmptyTile(int x, int y) {
		super.setXY(x,y);
	}	
	
	//Ausgabe eines leeren Feldes
	public String toString() {
		return super.toString() + "\u00A0";
	}
}

//Wand-Tile
class WallTile extends GameTile {

	//Konstruktor eines Wand Feldes
	public WallTile(int x, int y) {
		super.setXY(x,y);
	}

	//Ausgabe eines Wand Feldes
	public String toString() {
		return super.toString() + "#";	
	}
}

//Geld-Tile
class MoneyTile extends GameTile {

	//Konstruktor eines Geld Feldes
	public MoneyTile(int x, int y) {
		super.setXY(x,y);
	}

	//Ausgabe eines Geld Feldes
	public String toString() {
		return super.toString() + "$";	
	}
}

//Dragon-Tile
class DragonTile extends GameTile {

	//Konstruktor eines Drachen Feldes
	public DragonTile(int x, int y) {
		super.setXY(x,y);
	}

	//Ausgabe eines Drachen Feldes
	public String toString() {
		return super.toString() + "@";	
	}
}

//Door-Tile
class DoorTile extends GameTile {

	//Konstruktor eines Tuer Feldes
	public DoorTile(int x, int y) {
		super.setXY(x,y);
	}

	//Ausgabe eines Tuer Feldes
	public String toString() {
		return super.toString() + "+";	
	}
}
