package doom;

//Player
class Player extends GameTile {
        private int playerMoney;
        private int playerWater;
        private int playerHealth;
        private boolean alive = true;
        
        
	//constructor
	public Player(int x, int y) {
		super.setXY(x,y);
                this.playerMoney = 0;
                this.playerWater = 1503;
                this.playerHealth = 2000;
	}
	
	//add the player to the canvas
	public String draw(String s, int n) {
		int x = this.getX();
		int y = this.getY();
		//Position des Spielers in einem String berechnen
		int i = (x*n)+y;		
		//Spieler einfuegen
		String newStr = (s.substring(0, (i))) + "O" + (s.substring(i+1, (s.length())));

		return newStr;	
	}

	//movement-functions
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

        
        //gamer-money
        public void setPlayerMoney(int n){
            this.playerMoney += n;
        }
        
        public void setXY (int x, int y) {
            super.setXY(x, y);
        }
        
        public int getPlayerMoney() {
            return playerMoney;
        }
        
        //Reduces Players water if alive. Kill Player if water=0
        public void reducePlayerWater(int n){
            this.playerWater -= n;
            if (getPlayerWater() > 0 && alive()){            
            }else{
                GameOver gameOver = new GameOver();
                gameOver.setVisible(true);
                die();
            }
        }
        
        //add to Players water
        public void addPlayerWater(int n){
            this.playerWater+= n;
        }
        
        public int getPlayerWater(){
            return playerWater;
        }
        
        public void setPlayerHealth(int n){
           if(playerHealth>0){
               this.playerHealth+=n;
           }else{
               GameOver gameOver = new GameOver();
               gameOver.setVisible(true);
               die();
           }
        }
        
        public int getPlayerHealth(){
            return playerHealth;
        }
        
        //function to set the live status to dead
        public void die(){
            this.alive = false;
        }
        
        //function to set the live status to alive
        public boolean alive(){
            return alive;
        }

}
