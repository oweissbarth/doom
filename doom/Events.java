package doom;

class Events {
  
    //event-manager
    public int eventManager (Gui window, GameTile eventGameTile, Inventory inventory, LevelManager levelManager, Player gamer) {
            int tileID = eventGameTile.getID();

            switch (tileID){
                case 6 : moneyEvent(window, gamer); return 1;
                case 3 : triggerEvent(window, ((TriggerTile)eventGameTile).getTriggerPurpose()); return 1;
                case 5 : gamer.setPlayerHealth(-400); return 1;
                case 10 : levelManager.setCurrentLevelIndex(((PortalTile)eventGameTile).getLevelIndex()); return 1;
                case 7 : if (inventory.fillInventory(eventGameTile, window)) {
                                window.setEventLabel("You found a bottle of water!"); return 1; 
                           } else {
                                window.setEventLabel("Your Inventory is already filled!"); return 0;
                           }
                case 9 : if (inventory.fillInventory(eventGameTile, window)) {
                                window.setEventLabel("You found a key!"); return 1; 
                           } else {
                                window.setEventLabel("Your Inventory is already filled!"); return 0;
                           }
                case 8 : if (inventory.fillInventory(eventGameTile, window)) {
                                window.setEventLabel("You found a sword!"); return 1; 
                           } else {
                                window.setEventLabel("Your Inventory is already filled!"); return 0;
                           }
                
                default  : return 1;
            }
    }
    
    //money-event
    public void moneyEvent(Gui window, Player gamer){
         double money = Math.random();
         int Pmoney = (int)((money *100) + 5);
         window.setEventLabel("You found "+ Pmoney +"$!");
         gamer.setPlayerMoney(Pmoney);
    }
    
    //trigger-event
    public void triggerEvent(Gui window, char index) {

        switch(index) {
            case 'r' : window.setEventLabel("Next to you is a red door!");
                break;
            case 'y' : window.setEventLabel("Next to you is a yellow door!");
                break;
            case '@' : window.setEventLabel("Next to you is a Dragon!");
                break;
            default  : window.setEventLabel("Next to you is a black hole!");
                break;
        }           
    }

    //should the programm delete the event-GameTile?
    public boolean delEvent(int tileID) {
            
        switch (tileID) {
            case 6: return true;
            case 7: return true;
            case 9: return true;
            case 8: return true;
            default : return false;
        }
    }
}
