package doom;
class World { 
	private GameField level;
	private Player gamer;
	private String canvas = "##########################################################################################" +
				"#------$---------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#-------###+###--------------------------------------------$-----------------------------#" +
				"#-------#-----#--------------------------------------------------------------------------#" +
				"#-------#######--------------------------------------------------------------------------#" +
				"#------------------------------$---------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#------------------------$---------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#-########################################################################################" +
				"#----------------------------------------------------------------------------------------#" +
				"########################################################################################-#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"#----------------------------------------------------------------------------------------#" +
				"##########################################################################################";
	
	//Konstruktor der Welt	
	public World() {
		this.level = new GameField(canvas, 90, 30);
		this.gamer = new Player(1, 1);
	}

	//Wird eine richtige Taste gedrueckt?
	public boolean onKeyPressed(String key) {
		if ((key.equals("w")) || (key.equals("a")) || (key.equals("s")) || (key.equals("d"))) {
			return true;
		} else {return false;}
	}

	//Darf der Gamer in diese richting laufen?
	public boolean moveCheck (int x, int y) {
		boolean check = true;
		String tileString = this.level.getTileString(x, y);
		
		if (tileString.equals("#")) {check = false;}

		return check;
	}

	//move Funktion
	public void move (String key) {
		int posX = this.gamer.getX();
		int posY = this.gamer.getY();
		if (onKeyPressed(key)) {
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
                }                
	}

	//Ausgabe der Welt
	public void draw (Gui mainWindow){
		Events event = new Events();
                int x = this.gamer.getX();
		int y = this.gamer.getY();
                String s = "";
                String eventString = this.level.getTileString(x, y);
                
                
                
		//event erkennen und ausgeben
		String eventIndex = event.eventManager(mainWindow, eventString);
                //event tile eventuell loeschen
                if (event.delEvent(eventString)) {
                    level.tileConv(x, y);
                }
               
                //Player-Atribute setzen
                gamer.setAtributes(eventIndex);
                //Player-Wasserstand
                gamer.setPlayerWater();
                int water = gamer.getPlayerWater();
                mainWindow.setWaterBar(water);
                
                
                
                
                
                //level in ein String umwandeln
		String sub1 = level.toString();
                //Spieler in level-String einfuegen
		String sub2 = gamer.draw(sub1, level.getWidth());
                
                
                
                
                
                
                //String in ein '2D'-String umwandeln
		for(int i=0; i<(level.getHeight()); i++) {
			s = s + ( sub2.substring(((level.getWidth())*i), ((level.getWidth())*(i+1))) ) + "<br/>";
		}
                mainWindow.addText(s);
                
	}
        

}

