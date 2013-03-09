package doom;

//Player
class Player extends GameTile {
        private int playerMoney;
        private int playerWater;
        
        
	//Konstruktor eines Spielers
	public Player(int x, int y) {
		super.setXY(x,y);
                this.playerMoney = 0;
                this.playerWater = 1503;
	}
	
	//Zeichen-Funktion eines Spielers
	public String draw(String s, int n) {
		int x = this.getX();
		int y = this.getY();
		//Position des Spielers in einem String berechnen
		int i = (x*n)+y;		
		//Spieler einfuegen
		String newStr = (s.substring(0, (i))) + "O" + (s.substring(i+1, (s.length())));

		return newStr;	
	}

	//Bewegungsfunktionen
	public void moveLeft() {
		int x = this.getX();
		int y = this.getY();
		super.setXY(x, y-1);
	}
	
	public void moveRight() {
		int x = this.getX();
		int y = this.getY();
		super.setXY(x, y+1);
	}

	public void moveUp() {
		int x = this.getX();
		int y = this.getY();
		super.setXY(x-1, y);
	}

	public void moveDown() {
		int x = this.getX();
		int y = this.getY();
		super.setXY(x+1, y);
	}

        
        //gamer-Money
        public void setPlayerMoney(int n){
            this.playerMoney += n;
        }
        
        public int getPlayerMoney() {
            return playerMoney;
        }
        
        //gamer-Water
        public void setPlayerWater(){
            this.playerWater -= 3;
        }
        
        public int getPlayerWater(){
            return playerWater;
        }
        
        
        
        
        
        
        
        
        
        
        
        public void setAtributes(String eventIndex) {
            char index = eventIndex.charAt(0);
            String value = eventIndex.substring(1, eventIndex.length());
            
            switch (index) {
                case 'm': setPlayerMoney(Integer.parseInt(value));
            }
        }
}
