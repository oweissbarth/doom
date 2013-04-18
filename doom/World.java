package doom;
class World {
        private LevelManager levelManager;
	private GameField level;
	private Player gamer;
        private Inventory inventory;
	
	//constructor	
	public World() {
                this.levelManager = new LevelManager();		
                this.level = new GameField(levelManager.getLevelString(), 90, 30);
		this.gamer = new Player(1, 1);
                this.inventory= new Inventory();
	}
        
        
	//checking the destination GameTile
	public boolean moveCheck (int x, int y) {
		boolean check = true;
		String tileString = level.getTileString(x, y);
		
		if (tileString.equals("#")) {check = false;}
                if (tileString.equals("+")) {check = false;}

		return check;
	}

	//main-move-function
	public void move (String key) {
                int posX = this.gamer.getX();
		int posY = this.gamer.getY();
			switch (key.charAt(0)) {
				case 'w' : if (moveCheck(posX-1, posY)) {this.gamer.moveUp();}
					break;
				case 'a' : if (moveCheck(posX, posY-1)) {this.gamer.moveLeft();}
					break;
				case 's' : if (moveCheck(posX+1, posY)) {this.gamer.moveDown();}
					break;
				case 'd' : if (moveCheck(posX, posY+1)) {this.gamer.moveRight();}
					break;
			}
                        gamer.reducePlayerWater(3);                                 
        }

	//main-print-function
	public void draw (Gui mainWindow){
		//Check if Player is alive
                if (!gamer.alive()){
                    mainWindow.dispose();
                }
          
                Events event = new Events();
                //get current position of the player
                int x = this.gamer.getX();
		int y = this.gamer.getY();
                //get current waterstatus
                int water = gamer.getPlayerWater();
                //get current gameTile
                String eventIndex = this.level.getTileIndex(x, y);
                                         
		//get the event-code
		String eventCombinedIndex = event.eventManager(mainWindow, eventIndex, inventory, levelManager);
                             
                //delete the event-GameTile
                if (event.delEvent(eventIndex)) {
                    level.tileConv(x, y);
                }
                
                if (event.refreshWorld(eventIndex)) {
                    this.level = new GameField(levelManager.getLevelString(), 90, 30);
                }
               
                //set player-attributes
                gamer.setAttributes(eventCombinedIndex);
                
                //edit the waterBar
                mainWindow.setWaterBar(water);
                //get current balance
                int money = gamer.getPlayerMoney();
                //edit the MoneyCounter
                mainWindow.setMoneyCounter(money);
                          
                
                //convert the GameField into a string
		String sub1 = level.toString();
                //integrate the player into the GameField
		String sub2 = gamer.draw(sub1, level.getWidth());
                              
                
                
                //convert the GameField-string into a '2D'-string
                String outString = "";
		for(int i=0; i<(level.getHeight()); i++) {
			outString = outString + ( sub2.substring(((level.getWidth())*i), ((level.getWidth())*(i+1))) ) + "<br/>";
		}
                
                //draw-function
                mainWindow.setMainLabel(outString);               
	}

        //funtion to manage the events for all items
        public void useItem(String s, Gui mainWindow){
            int x = this.gamer.getX();
            int y = this.gamer.getY();
            int index = (Integer.parseInt(s))-1;
            char item = inventory.getItem(index).charAt(0);
            
            switch(item){
                case 'e':   break;
                    
                case 'w':   gamer.addPlayerWater(50);
                            mainWindow.setWaterBar(gamer.getPlayerWater());
                            inventory.deleteItem(index, mainWindow);
                            break;
                
                case 'k':   char itemColor = inventory.getItem(index).charAt(1);
                            boolean rightKey = level.openDoor(x, y, itemColor);
                            if (rightKey) {
                                inventory.deleteItem(index, mainWindow);
                                draw(mainWindow);
                            }
                            break;
            }
        }
}

