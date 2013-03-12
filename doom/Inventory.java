package doom;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Inventory {
    String[] inventory;
    
    public Inventory () {
        this.inventory = new String[8];
        for (int i = 0; i<this.inventory.length; i++) {
            this.inventory[i] = "";
        }
    }
    
    public void fillInventory (String object, Gui mainWindow) {
        boolean indicator = true;
        for (int i = 0; i<this.inventory.length; i++) {
            if (this.inventory[i].equals("") && indicator) {
                this.inventory[i] = object;
                setInventoryIcons(mainWindow);
                indicator = false;
            }
        }
        
    }

    private void setInventoryIcons(Gui mainWindow){
      javax.swing.JLabel[] labels = mainWindow.getInventoryLabels();
      for(int i=0; i < labels.length; i++){
          if(!inventory[i].equals("")){
              labels[i].setIcon(chooseIcon(inventory[i]));
          }
          else{
              Icon icon = null;
              icon = new  ImageIcon("./src/doom/icons/empty.png");
              labels[i].setIcon(icon);
          }
      }
    }
    
   private Icon chooseIcon(String s){
       Icon icon = null;
       
       switch(s.charAt(0)){
           case 'w':    icon = new ImageIcon("./src/doom/icons/water.png");
                        break;
       }
       
       return icon;
   }

}
