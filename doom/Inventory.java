package doom;

import javax.swing.Icon;
import javax.swing.ImageIcon;

class Inventory {
    private GameTile[] inventory;
    private Icon empty;
    private Icon water;
    private Icon bKey;
    private Icon yKey;
    private Icon rKey;
    private Icon gKey;
    private Icon moonBladeWeapon;
    private Icon bluntSwordWeapon;
    private Icon excaliburWeapon;
   
    
    //Constructor to create 
    public Inventory () {
        this.inventory = new GameTile[8];
        for (int i = 0; i<this.inventory.length; i++) {
            this.inventory[i] = new EmptyTile(0, 0);
        }
    empty = new ImageIcon(getClass().getResource("/doom/icons/empty.png"));
    water = new ImageIcon(getClass().getResource("/doom/icons/water.png"));
    bKey = new ImageIcon(getClass().getResource("/doom/icons/bKey.png"));
    yKey = new ImageIcon(getClass().getResource("/doom/icons/yKey.png"));
    rKey = new ImageIcon(getClass().getResource("/doom/icons/rKey.png"));
    gKey = new ImageIcon(getClass().getResource("/doom/icons/gKey.png"));
    bluntSwordWeapon = new ImageIcon(getClass().getResource("/doom/icons/bluntSwordWeapon.png"));
    moonBladeWeapon = new ImageIcon(getClass().getResource("/doom/icons/moonBladeWeapon.png"));
    excaliburWeapon = new ImageIcon(getClass().getResource("/doom/icons/excaliburWeapon.png"));
        
        
    }
    
   //Getter for Inventory Item
    public GameTile getItem(int i){
        return this.inventory[i];
    }
    
    public boolean fillInventory (GameTile object, Gui mainWindow) {
        boolean indicator = false;
        for (int i = 0; i<this.inventory.length; i++) {
            if ((this.inventory[i].getID() == 1) && !indicator) {
                this.inventory[i] = object;
                indicator = true;
            }
        }
        setInventoryIcons(mainWindow);
        return indicator;
    }

    
    //Sets up all the Icons for items in the inventory
    public void setInventoryIcons(Gui mainWindow){
      javax.swing.JLabel[] labels = mainWindow.getInventoryLabels();
      for(int i=0; i < labels.length; i++){
           labels[i].setIcon(chooseIcon(inventory[i]));
           GameTile obj = inventory[i];
           String description="";
           if(inventory[i] instanceof WaterTile)
               description = ((WaterTile) obj).getDescription();
           if(obj instanceof KeyTile)
               description =((KeyTile)obj).getDescription();
           if(obj instanceof WeaponTile)
               description=((WeaponTile)obj).getDescription();
           labels[i].setToolTipText(description);
      }
    }
    
   
    //Dictionary for the icon-locations
    private Icon chooseIcon(GameTile item){
       Icon icon = null;
       
       switch(item.getID()){
           case 1:    return empty; 
           case 7:    return water;
           case 9:      switch(((KeyTile)item).getColorIndex()){
                            case 'b' : return bKey;
                            case 'y' : return yKey;
                            case 'r' : return rKey;
                            case 'g' : return gKey;
                        }
           case 8:      switch(((WeaponTile)item).getWeaponIdentifier()){
                            case 1   : return bluntSwordWeapon;
                            case 2   : return moonBladeWeapon;
                            case 3   : return excaliburWeapon;
           }
       }
      return icon;
    }


    //Deletes an item from the inventory and rearranges the items
    public void deleteItem(int index, Gui mainWindow){
      this.inventory[index] = new EmptyTile(0, 0);

      for(int i= 0; i<7; i++){
          if(this.inventory[i].getID() == 1){
              this.inventory[i] = this.inventory[i+1];
              this.inventory[i+1] = new EmptyTile(0, 0);
          }
      }
      setInventoryIcons(mainWindow);
   }
}  
