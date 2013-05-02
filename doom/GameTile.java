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

class WeaponTile extends GameTile{
    
    private int ID;
    private int damage;
    private int critChance;
    private float critDamageFactor;
    private int state;
    private String name;
    private int weaponIdentifier;
    
    
    public WeaponTile(int x, int y, int weaponIdentifier) {
        super.setXY(x, y);
        this.ID = 8;
        
        switch(weaponIdentifier){
            case 1:     this.name = "blunt sword";
                        this.weaponIdentifier = 1;
                        this.damage = 150;
                        this.critChance = 5;
                        this.critDamageFactor = 2;
                        this.state=100;
                        break;
            
            case 2:     this.name = "Moon Blade";
                        this.weaponIdentifier = 2;
                        this.damage = 200;
                        this.critChance = 15;
                        this.critDamageFactor = (float)2.5;
                        this.state=100;
                        break;
                
            case 3:     this.name = "Excalibur";
                        this.weaponIdentifier = 3;
                        this.damage = 500;
                        this.critChance = 7;
                        this.critDamageFactor = (float)1.5;
                        this.state=100;
                        break;
        }
        
            
        
        
        
        
       
            
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
    
    public float getCritDamageFactor(){
        return this.critDamageFactor;
    }
    
    public int getWeaponState(){
        return this.state;
    }
    
    public String getWeaponName(){
        return this.name;
    }
    
    public int getWeaponIdentifier(){
        return this.weaponIdentifier;
    }
    
    public void setWeaponName(String newName){
        this.name = newName;
    }
    
    public void setWeaponState(int n){
        this.state = n;
    }
}


