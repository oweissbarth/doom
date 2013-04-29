package doom;


//Empty GameTile
class GameTile {
        private int ID;
	private Position pos;

        GameTile() {
            this.ID = 0;
        }
	
	//GameTile -> string
	public char toChar() {
		return ' ';	
	}

	//setter-function
	public void setXY(int x , int y) {
		this.pos = new Position();
		this.pos.setXY(x,y);
	}
            
	//getter-functions
	public int getX(){
		int x = this.pos.getX();
		return x;
	}

	public int getY(){
		int y = this.pos.getY();
		return y;
	}
        
        public int getID() {
            return this.ID;
        }
}


//Empty GameTile
class EmptyTile extends GameTile {
        
        private int ID;
			
	public EmptyTile(int x, int y) {
            this.ID = 1;
            super.setXY(x,y);
	}	
	
        @Override
	public char toChar() {
            return '\u00A0';
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
}

//Water GameTile
class WaterTile extends GameTile {
    
    private int ID;
    
    public WaterTile (int x, int y) {
        this.ID = 7;
        super.setXY(x, y);
    }
    
    @Override
    public char toChar() {
        return 'w';
    }
    
    @Override
    public int getID() {
            return this.ID;
    }
    
}

//Wall GameTile
class WallTile extends GameTile {
    
        private int ID;

	public WallTile(int x, int y) {
            this.ID = 2;
            super.setXY(x,y);
	}

        @Override
	public char toChar() {
            return '#';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
}

//Money GameTile
class MoneyTile extends GameTile {
    
        private int ID;

	public MoneyTile(int x, int y) {
            this.ID = 6;
            super.setXY(x,y);
	}

        @Override
	public char toChar() {
            return '$';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
}

//Dragon GameTile
class DragonTile extends GameTile {
        
        private int ID;
        private int healthPoints;
        private int damage;
        private int critChance;
        private float critDamageFactor;
    
	public DragonTile(int x, int y) {
            this.ID = 5;
            super.setXY(x,y);
            this.damage = 500;
            this.critChance = 10;
            this.critDamageFactor = (float)1.5;
            this.healthPoints = 500;
	}

        @Override
	public char toChar() {
            return '@';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
        
        public int getDragonHealthPoints(){
            return healthPoints;
        }
        
        public int getDragonCritChance(){
            return this.critChance;
        }
        
        public int getDragonDamage(){
            return this.damage;
        }
        
        public float getDragonCritDamageFactor(){
            return this.critDamageFactor;
        }
        
        public void setDragonHealthPoints(int value){
            this.healthPoints = value;
        }
}

//Door GameTile
class DoorTile extends GameTile {
        
        private int ID;
        private char colorIndex;

	public DoorTile(int x, int y) {
                this.ID = 4;
		super.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            this.colorIndex = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }

        @Override
	public char toChar() {
            return '+';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
        
        public char getColorIndex() {
            return this.colorIndex;
        }
}

//Door trigger
class TriggerTile extends GameTile {
    
        private int ID;
        private char index;

	public TriggerTile(int x, int y) {
            this.ID = 3;
            super.setXY(x,y);
	}
        
        public String setIndex(int x, int y, int n, String s) {
            this.index = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }

        @Override
	public char toChar() {
            return '\u00A0';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
        
        public char getTriggerPurpose (){
            return this.index;
        }
}

//Key GameTile
class KeyTile extends GameTile {
        
        private int ID;
        private char colorIndex;

	public KeyTile(int x, int y) {
                this.ID = 9;
		super.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            this.colorIndex = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }
        
        public char getColorIndex () {
            return this.colorIndex;
        }

        @Override
	public char toChar() {
            return 'k';	
	}
        
        @Override
        public int getID() {
            return this.ID;
        }
}

//Wormehole GameTile
class PortalTile extends GameTile {
        
        private int ID;
        private int levelIndex;
        private int portalIndex;
        private int destination;

	public PortalTile(int x, int y) {
                this.ID = 10;
		super.setXY(x,y);
	}
        
        public String setLevelIndex(int x, int y, int n, String s) {
            this.levelIndex = Integer.parseInt(s.charAt((x*n)+y+2) + "");
            this.portalIndex = Integer.parseInt(s.charAt((x*n)+y+4) + "");
            this.destination = Integer.parseInt(s.charAt((x*n)+y+6) + "");
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+7);
            return s;
        }

        @Override
	public char toChar() {
            return '\u088C';	
	}
        
        public int getLevelIndex() {
            return this.levelIndex;
        }
        
        public int getPortalIndex() {
            return this.portalIndex;
        }
        
        public int getDestination() {
            return this.destination;
        }
        
        @Override
        public int getID() {
            return this.ID;
        }
}

class SwordTile extends GameTile{
    
    private int ID;
    private int damage;
    private int critChance;
    private int critDamageFactor;
    
    public SwordTile(int x, int y) {
            this.ID = 8;
            super.setXY(x,y);
            this.damage = 300;
            this.critChance = 5;
            this.critDamageFactor = 2;
    }

    @Override
    public char toChar(){
        return '|';
    }
    
    @Override
    public int getID() {
            return this.ID;
        }
    
    public int getDamage(){
        return damage;
    }
    
    public int getCritChance(){
        return this.critChance;
    }
    
    public int getCritDamageFactor(){
        return this.critDamageFactor;
    }
}


