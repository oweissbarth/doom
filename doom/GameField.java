package doom;

class GameField {
	//Definition des Arrays
	private GameTile[][] field;
	private int height;
	private int width;

	//Konstruktor des Feldes
	public GameField(String canvas, int width, int height) {
		
		this.height = height;
		this.width = width;
		this.field = new GameTile[height][width];
		String s = canvas;

		//Jedes Zeichen des der Leinwand in das oben definierte Array schreiben 
		for (int i=0; i<height; i++){
			for (int j=0; j<width; j++){
			
				char c = s.charAt((i*width)+j);
				
				//Fallunterscheidung und gleichzeitiges definieren der Koordinaten
				switch (c) {
					case '#': field[i][j] = new WallTile(i,j);
							break;
					case '-' : field[i][j] = new EmptyTile(i,j);
							break;
					case '@' : field[i][j] = new DragonTile(i,j);
							break;
					case '+' : field[i][j] = new DoorTile(i,j);
							break;
					case '$' : field[i][j] = new MoneyTile(i,j);
							break;
					default : field[i][j] = new GameTile();
							break;	
				}
			}		
		}
	}

	//Das Array auslesen und in ein String umwandeln
	public String toString() {
		String s="";
		int size = this.height;

		for (int i = 0; i<size; i++){
			for(int j = 0; j<this.width; j++){
				GameTile tile = field[i][j];
				String sTile = tile.toString();
				s = s + sTile; 
				
			}
		}
		return s; 
	}

	//getter fuer hight und width
	public int getHeight (){
		return this.height;
	}

	public int getWidth (){
		return this.width;
	}

	//getTileString funktion
	public String getTileString(int x, int y) {
		GameTile tile = this.field[x][y];
		String s = tile.toString();
		return s;
	}
        
        //GameTile convertieren
        public void tileConv(int x, int y) {
            this.field[x][y] = new EmptyTile(x, y);
        }

}

