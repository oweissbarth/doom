package doom;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Inventory {
    String[] inventory;
    
    //Constructor to creeate 
    public Inventory () {
        this.inventory = new String[8];
        for (int i = 0; i<this.inventory.length; i++) {
            this.inventory[i] = "e";
        }
    }
    
    public void fillInventory (String object, Gui mainWindow) {
        boolean indicator = true;
        for (int i = 0; i<this.inventory.length; i++) {
            if (this.inventory[i].equals("e") && indicator) {
                this.inventory[i] = object;
                setInventoryIcons(mainWindow);
                indicator = false;
            }
        }      
    }

    private void setInventoryIcons(Gui mainWindow){
      javax.swing.JLabel[] labels = mainWindow.getInventoryLabels();
      for(int i=0; i < labels.length; i++){
           labels[i].setIcon(chooseIcon(inventory[i]));
      }
    }
    
   private Icon chooseIcon(String s){
       Icon icon = null;
       
       switch(s.charAt(0)){
           case 'e':    icon = new ImageIcon(getClass().getResource("/doom/icons/empty.png")); 
                        break;
           case 'w':    icon = new ImageIcon(getClass().getResource("/doom/icons/water.png")); 
                        break;
       }
       
       return icon;
   }

}
