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
					case '#':   field[i][j] = new WallTile(i,j);
                                                    break;
					
                                        case '-' :  field[i][j] = new EmptyTile(i,j);
                                                    break;
					
                                        case '@' :  field[i][j] = new DragonTile(i,j);
                                                    break;
					
                                        case '+' :  field[i][j] = new DoorTile(i,j); 
                                                    s = this.field[i][j].setColor(i, j, width, s);
                                                    break;
					
                                        case '$' :  field[i][j] = new MoneyTile(i,j);
                                                    break;
                                        
                                        case 't' :  field[i][j] = new DoorTrigger(i, j);
                                                    s = this.field[i][j].setColor(i, j, width, s);
                                                    break;
                                        
                                        case 'k' :  field[i][j] = new KeyTile(i, j);
                                                    s = this.field[i][j].setColor(i, j, width, s);
                                                    break;
                                        
                                        case '0' :  field[i][j] = new WormTile(i, j); 
                                                    s = this.field[i][j].setLevelIndex(i, j, width, s);
                                                    break;                                      
                                        case 'w' :  field[i][j] = new WaterTile(i, j);
                                                    break;
                                        
                                        case '|' :  field[i][j] = new SwordTile(i, j); 
                                                    break;
					
                                        default :   field[i][j] = new GameTile();
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
        
        public int[] getTileXY (String index, int value){
            int[] XYArray = new int[2];
            
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    
                    GameTile tile = this.field[i][j];
                    String tileIndex = tile.getIndex().charAt(0) + "";
                    
                    if (tileIndex.equals(index)){
                        int tileValue = Integer.parseInt(tile.getIndex().charAt(1) + "");
                       
                        if (value == tileValue) {
                            XYArray[0] = tile.getX();
                            XYArray[1] = tile.getY();
                        }                       
                    }
                }
            } 
            return XYArray;
        }
        
        //replace a GameTile with a EmptyTile
        public void tileConv(int x, int y) {
            this.field[x][y] = new EmptyTile(x, y);
        }
        
        //open a door
        public boolean openDoor (int x, int y, char color) {
                String position = getTileIndex(x, y).charAt(0)+"";
                boolean bool = false;
                int[] xField = {x-1, x+1, x, x};
                int[] yField = {y, y, y-1, y+1};
                
                if (position.equals("t")) {
                    for (int i=0; i<4; i++) {
                        String nearTile = getTileIndex(xField[i], yField[i]);
                        if (nearTile.equals("+"+color)) {
                            tileConv(xField[i], yField[i]);
                            tileConv(x, y);
                            bool = true;
                        }
                    }
                } 
                return bool;
        }
        
        public boolean killDragon(int x, int y){
            boolean dragonKilled= false;
            int dragonPosX = 0;
            int dragonPosY = 0;
            
            for(int i = -1; i<=1; i++){
                if (getTileIndex(i+x, y).equals("@")){
                    tileConv(i+x,y);
                    dragonKilled = true;
                    dragonPosX = i+x;
                    dragonPosY = y;
                    
                }
            }
            for(int i = -1; i<=1; i++){
                if(getTileIndex(x, i+y).equals("@")){
                    tileConv(x, i+y);
                    dragonKilled = true;
                    dragonPosX = x;
                    dragonPosY = i+y;
                    
                }
            }
            if(dragonKilled){
                for(int i = -1; i <= 1; i++){
                    tileConv(dragonPosX + i, dragonPosY);
                    tileConv(dragonPosX, dragonPosY + i);
                }
            }
            return dragonKilled;
            }
}

