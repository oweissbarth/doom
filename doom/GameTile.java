package doom;
class GameTile {
	private Position pos;
	
	//GameTile -> string
	public String toString() {
		return "";	
	}

	//setter-function
	public void setXY(int x , int y) {
		this.pos = new Position();
		this.pos.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            return s;
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
        
        public String getIndex() {
            return "";
        }
}


//Empty GameTile
class EmptyTile extends GameTile {
			
	public EmptyTile(int x, int y) {
            super.setXY(x,y);
	}	
	
	public String toString() {
            return "\u00A0";
	}
        
        public String getIndex() {
            return "e";
        }
}

//Water GameTile
class WaterTile extends GameTile {
    public WaterTile (int x, int y) {
        super.setXY(x, y);
    }
    
    public String toString() {
        return "w";
    }
    
    public String getIndex() {
        return "w";
    }
}

//Wall GameTile
class WallTile extends GameTile {

	public WallTile(int x, int y) {
            super.setXY(x,y);
	}

	public String toString() {
            return "#";	
	}
        
        public String getIndex() {
            return "#";
        }
}

//Money GameTile
class MoneyTile extends GameTile {

	public MoneyTile(int x, int y) {
            super.setXY(x,y);
	}

	public String toString() {
            return "$";	
	}
        
        public String getIndex() {
            return "$";
        }
}

//Dragon GameTile
class DragonTile extends GameTile {

	public DragonTile(int x, int y) {
            super.setXY(x,y);
	}

	public String toString() {
            return "@";	
	}
        
        public String getIndex() {
            return "@";
        }
}

//Door GameTile
class DoorTile extends GameTile {
        
        private char colorIndex;

	public DoorTile(int x, int y) {
		super.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            this.colorIndex = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }

	public String toString() {
            return "+";	
	}
        
        public String getIndex() {
            return "+" + this.colorIndex;
        }
}

//Door trigger
class DoorTrigger extends GameTile {
    
        private char colorIndex;

	public DoorTrigger(int x, int y) {
            super.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            this.colorIndex = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }

	public String toString() {
            return "\u00A0";	
	}
        
        public String getIndex() {
            return "t" + this.colorIndex;
        }
}

//Key GameTile
class KeyTile extends GameTile {
        
        private char colorIndex;

	public KeyTile(int x, int y) {
		super.setXY(x,y);
	}
        
        public String setColor(int x, int y, int n, String s) {
            this.colorIndex = s.charAt((x*n)+y+2);
            s = s.substring(0,(x*n)+y) + s.substring((x*n)+y+3);
            return s;
        }

	public String toString() {
            return "k";	
	}
        
        public String getIndex() {
            return "k" + this.colorIndex;
        }
}
