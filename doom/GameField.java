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
                                                    s = ((DoorTile)this.field[i][j]).setColor(i, j, width, s);
                                                    break;
					
                                        case '$' :  field[i][j] = new MoneyTile(i,j);
                                                    break;
                                        
                                        case 't' :  field[i][j] = new TriggerTile(i, j);
                                                    s = ((TriggerTile)this.field[i][j]).setIndex(i, j, width, s);
                                                    break;
                                        
                                        case 'k' :  field[i][j] = new KeyTile(i, j);
                                                    s = ((KeyTile)this.field[i][j]).setColor(i, j, width, s);
                                                    break;
                                        
                                        case '0' :  field[i][j] = new PortalTile(i, j); 
                                                    s = ((PortalTile)this.field[i][j]).setLevelIndex(i, j, width, s);
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
        @Override
	public String toString() {
		String s="";
		int size = this.height;

		for (int i = 0; i<size; i++){
			for(int j = 0; j<this.width; j++){
				GameTile tile = field[i][j];
				char sTile = tile.toChar();
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
        
        public int[] getPortalDestinationXY (int destination){
            int[] XYArray = new int[2];
            boolean check = true;
            
            for (int i = 0; (i < this.height) && (check); i++) {
                for (int j = 0; (j < this.width)  && (check); j++) {
                    
                    GameTile tile = this.field[i][j];
                    
                    if (tile.getID() == 10){
                        
                        int portalIndex = ((PortalTile)tile).getPortalIndex();
                       
                        if (destination == portalIndex) {
                            XYArray[0] = tile.getX();
                            XYArray[1] = tile.getY();
                                check = false;
                        }                       
                    }
                }
            } 
            return XYArray;
        }
        
        public GameTile getTile (int x, int y) {
            return this.field[x][y];
        }
        
        //replace a GameTile with a EmptyTile
        public void tileConv(int x, int y) {
            this.field[x][y] = new EmptyTile(x, y);
        }
        
        //open a door
        public boolean openDoor (int x, int y, char color) {
                GameTile currentTile = this.field[x][y];
                boolean bool = false;
                int[] xField = {x-1, x+1, x, x};
                int[] yField = {y, y, y-1, y+1};
                
                if ((currentTile.getID() == 3)&&(((TriggerTile)currentTile).getTriggerPurpose() != '@' )) {
                    for (int i=0; i<4; i++) {
                        currentTile = getTile(xField[i], yField[i]);
                        if ((currentTile.getID()== 4)&&(((DoorTile)currentTile).getColorIndex() == color)) {
                            tileConv(xField[i], yField[i]);
                            tileConv(x, y);
                            bool = true;
                        }
                    }
                }
                return bool;
        }
        
        public boolean checkWallMove (int x, int y, int secX, int secY) {
            if ((x == 0)||(x == 29)||(y == 0)||(y ==89)) {
                return false;
            } else {
                if (getTile(secX, secY).getID() == 1) {
                    tileConv(x,y);
                    this.field[secX][secY] = new WallTile(secX, secY);
                    return true;
                } else {
                    return false;
                }
            }
        }
        
        public int[] nearDragon(int x, int y){
            int dragonPosX = -1;
            int dragonPosY = -1;
            
            for(int i = -1; i<=1; i++){
                if (getTile(i + x, y).getID() == 5){
                    dragonPosX = i+x;
                    dragonPosY = y;
                }
            }
            
            for(int i = -1; i<=1; i++){
                if(getTile(x, i+y).getID() == 5){
                    dragonPosX = x;
                    dragonPosY = i+y;
                }
            }
        int[] pos = {dragonPosX, dragonPosY};
        return pos;
        }
        
        
        
        public boolean killDragon(int x, int y, int swordDamage, int dragonHealthpoints){
            boolean dragonKilled= false;
            
            if(swordDamage >= dragonHealthpoints){
                dragonKilled = true;
                for(int i = -1; i <= 1; i++){
                    tileConv(x + i, y);
                    tileConv(x, y + i);
                }
            }
            return dragonKilled;
            }
}

