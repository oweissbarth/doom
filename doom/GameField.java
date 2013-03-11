package doom;

class GameField {
	//definition of the GameField-Array
	private GameTile[][] field;
	private int height;
	private int width;

	//Constructor of GameField
	public GameField(String canvas, int width, int height) {
		
		this.height = height;
		this.width = width;
		this.field = new GameTile[height][width];
		String s = canvas;

		//i = lines; j = cols 
		for (int i=0; i<height; i++){
			for (int j=0; j<width; j++){
			
				char c = s.charAt((i*width)+j);
				
				switch (c) {
					case '#': field[i][j] = new WallTile(i,j);
							break;
					case '-' : field[i][j] = new EmptyTile(i,j);
							break;
					case '@' : field[i][j] = new DragonTile(i,j);
							break;
					case '+' : field[i][j] = new DoorTile(i,j); s = this.field[i][j].setColor(i, j, width, s);
							break;
					case '$' : field[i][j] = new MoneyTile(i,j);
							break;
                                        case 't' : field[i][j] = new DoorTrigger(i, j); s = this.field[i][j].setColor(i, j, width, s);
                                                        break;
                                        case 'w' : field[i][j] = new WaterTile(i, j);
                                                        break;
					default : field[i][j] = new GameTile();
							break;	
				}
			}		
		}
	}

	//convert GameFieldArray to a string
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

	//getter-functions
	public int getHeight (){
		return this.height;
	}

	public int getWidth (){
		return this.width;
	}

	//convert a GameTile into a string
	public String getTileString(int x, int y) {
		GameTile tile = this.field[x][y];
		String s = tile.toString();
		return s;
	}
        
        public String getTileIndex(int x, int y) {
		GameTile tile = this.field[x][y];
		String s = tile.getIndex();
		return s;
	}
        
        //replace a GameTile with a EmptyTile
        public void tileConv(int x, int y) {
            this.field[x][y] = new EmptyTile(x, y);
        }

}

