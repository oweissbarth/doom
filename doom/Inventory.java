package doom;

public class Inventory {
    String[] inventory;
    
    public Inventory () {
        this.inventory = new String[10];
        for (int i = 0; i<this.inventory.length; i++) {
            this.inventory[i] = "";
        }
    }
    
    public void fillInventory (String object) {
        boolean indicator = true;
        for (int i = 0; i<this.inventory.length; i++) {
            if (this.inventory[i].equals("") && indicator) {
                this.inventory[i] = object;
                indicator = false;
            }
        }
        
    }
}
