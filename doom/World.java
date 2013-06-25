package doom;

import java.util.Arrays;

class World {
        private LevelManager levelManager;
	private GameField level;
	private Player gamer;
        private Inventory inventory;
	
	//constructor	
	public World() {
                this.levelManager = new LevelManager();		
                this.level = levelManager.getLevel();
		this.gamer = new Player(1, 1);
                this.inventory= new Inventory();
	}
        
        
	//checking the destination GameTile
	public boolean moveCheck (int x, int y, int secX, int secY) {
		boolean check = true;
                          		
		if (level.getTile(x,y).getID() == 2) {check = this.level.checkWallMove(x, y, secX, secY);}
                if (level.getTile(x,y).getID() == 4) {check = false;}

		return check;
	}

	//main-move-function
	public void move (String key) {
                int posX = this.gamer.getX();
		int posY = this.gamer.getY();
			switch (key.charAt(0)) {
				case 'w' : if (moveCheck(posX-1, posY, posX-2, posY)) {this.gamer.moveUp();}
					break;
				case 'a' : if (moveCheck(posX, posY-1, posX, posY-2)) {this.gamer.moveLeft();}
					break;
				case 's' : if (moveCheck(posX+1, posY, posX+2, posY)) {this.gamer.moveDown();}
					break;
				case 'd' : if (moveCheck(posX, posY+1, posX, posY+2)) {this.gamer.moveRight();}
					break;
			}
                        gamer.reducePlayerWater(3);
                        
        }

	//main-print-function
	public void draw (Gui mainWindow){
          
                Events event = new Events();
                //get current position of the player
                int x = this.gamer.getX();
		int y = this.gamer.getY();
                
                //get current gameTile
                GameTile eventGameTile = this.level.getTile(x, y);
                                         
		//get the event-code
		int eventCombinedIndex = event.eventManager(mainWindow, eventGameTile, inventory, levelManager, gamer);
                             
                //delete the event-GameTile
                if (eventCombinedIndex == 1) {
                    if (event.delEvent(eventGameTile.getID())) {
                        level.tileConv(x, y);
                    }
                }
                //create the new Gamefield
                if (eventGameTile.getID() == 10) {
                    this.level = levelManager.getLevel();
                    int[] XYArray = this.level.getPortalDestinationXY(((PortalTile)eventGameTile).getDestination());
                    this.gamer.setXY(XYArray[0], XYArray[1]);
                }
                
                //get current waterstatus
                int water = gamer.getPlayerWater();
                //edit the waterBar
                mainWindow.setWaterBar(water);
                //get current balance
                int money = gamer.getPlayerMoney();
                //edit the MoneyCounter
                mainWindow.setMoneyCounter(money);
                //get current health
                int health = gamer.getPlayerHealth();
                //edit health bar
                mainWindow.setHealthBar(health);
                
                //convert the GameField into a string
		String sub1 = level.toString();
                //integrate the player into the GameField
		String sub2 = gamer.draw(sub1, level.getWidth());
                              
                
                
                //convert the GameField-string into a '2D'-string
                String outString = "";
		for(int i=0; i<(level.getHeight()); i++) {
			outString = outString + ( sub2.substring(((level.getWidth())*i), ((level.getWidth())*(i+1))) ) + "<br/>";
		}
                
                if (!this.gamer.alive()){
                    mainWindow.dispose();
                }
                
                //draw-function
                mainWindow.setMainLabel(outString);               
	}

        //funtion to manage the events for all items
        public void useItem(String s, Gui mainWindow){
            int x = this.gamer.getX();
            int y = this.gamer.getY();
            int index = (Integer.parseInt(s))-1;
            
            GameTile item = this.inventory.getItem(index);
            int itemID = item.getID();
            
            switch(itemID){
                case 1:   break;
                    
                case 7:   gamer.addPlayerWater(66);
                            mainWindow.setWaterBar(gamer.getPlayerWater());
                            inventory.deleteItem(index, mainWindow);
                            break;
                
                case 9:   char itemColor = ((KeyTile)item).getColorIndex();
                            boolean rightKey = level.openDoor(x, y, itemColor);
                            if (rightKey) {
                                inventory.deleteItem(index, mainWindow);
                                draw(mainWindow);
                            }
                            break;
                
                case 8:     int[] dragonPos = level.nearDragon(x, y);
                            int[] defaultPos = {-1, -1};
                            if (!Arrays.equals(dragonPos, defaultPos)){
                                if(level.fight(dragonPos, item, gamer, mainWindow)){
                                    for(int i = -1; i <= 1; i++){
                                            level.tileConv(dragonPos[0] + i, dragonPos[1]);
                                            level.tileConv(dragonPos[0], dragonPos[1] + i);
                                    }
                                    draw(mainWindow);
                                }
                            }
                            if(((WeaponTile)item).getWeaponState() <= 0){
                                inventory.deleteItem(index, mainWindow);
                            }
                            inventory.setInventoryIcons(mainWindow);
                            break;
                            
            }   
    }
}

