package doom;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Inventory {
    String[] inventory;
    
    //Constructor to create 
    public Inventory () {
        this.inventory = new String[8];
        for (int i = 0; i<this.inventory.length; i++) {
            this.inventory[i] = "e";
        }
    }
    
   //Getter for Inventory Item
    public String getItem(int i){
        return inventory[i];
    }
    
    
    public boolean fillInventory (String object, Gui mainWindow) {
        boolean indicator = true;
        for (int i = 0; i<this.inventory.length; i++) {
            if (this.inventory[i].equals("e") && indicator) {
                this.inventory[i] = object;
                indicator = false;
            }
        }
        setInventoryIcons(mainWindow);
        return indicator;
    }

    
    //Sets up all the Icons for items in the inventory
    private void setInventoryIcons(Gui mainWindow){
      javax.swing.JLabel[] labels = mainWindow.getInventoryLabels();
      for(int i=0; i < labels.length; i++){
           labels[i].setIcon(chooseIcon(inventory[i]));
      }
    }
    
   
    //Dictionary for the icon-locations
    private Icon chooseIcon(String s){
       Icon icon = null;
       
       switch(s.charAt(0)){
           case 'e':    icon = new ImageIcon(getClass().getResource("/doom/icons/empty.png")); 
                        break;
           case 'w':    icon = new ImageIcon(getClass().getResource("/doom/icons/water.png")); 
                        break;
           case 'k':    icon = new ImageIcon(getClass().getResource("/doom/icons/"+ s.charAt(1) +"Key.png"));
                        break;
           case 's':    icon = new ImageIcon(getClass().getResource("/doom/icons/sword.png"));
                        break;
       }
       
       return icon;
   }


    //Deletes an item from the inventory and rearranges the items
    public void deleteItem(int index, Gui mainWindow){
      inventory[index] = "e";
      String[] newInventory = new String[8];
      int ni=0;
      
      for(int oi= 0; oi<inventory.length; oi++){
          if(!inventory[oi].equals("e")){
              newInventory[ni]=inventory[oi];
              ni++;
          }
      }
      
      while(ni<newInventory.length){
          newInventory[ni]="e";
          ni++;
      }
      inventory = newInventory;
      setInventoryIcons(mainWindow);
   }
}  
