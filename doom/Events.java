package doom;

class Events {
  
    //event-manager
    public int eventManager (Gui window, GameTile eventGameTile, Inventory inventory, LevelManager levelManager, Player gamer) {
            char c = eventGameTile.toString().charAt(0);
            switch (c){
                case '$' : moneyEvent(window, gamer); return 1;
                case 't' : triggerEvent(window, ((DoorTrigger)eventGameTile).getTriggerPurpose()); return 1;
                case '@' : gamer.setPlayerHealth(-400); return 1;
                case '0' : levelManager.setCurrentLevelIndex(((WormTile)eventGameTile).getLevelIndex()); return ((WormTile)eventGameTile).getDestination();
                case 'w' : if (inventory.fillInventory(eventGameTile, window)) {
                                window.setEventLabel("You found a bottle of water!"); return 1; 
                           } else {
                                window.setEventLabel("Your Inventory is already filled!"); return 0;
                           }
                case 'k' : if (inventory.fillInventory(eventGameTile, window)) {
                                window.setEventLabel("You found a key!"); return 1; 
                           } else {
                                window.setEventLabel("Your Inventory is already filled!"); return 0;
                           }
                case '|' : if (inventory.fillInventory(eventGameTile, window)) {
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
    public boolean delEvent(String eventIndex) {
        char c = eventIndex.charAt(0);
        
        switch (c) {
            case '$': return true;
            case 'w': return true;
            case 'k': return true;
            case '|': return true;
            default : return false;
        }
    }
    
    //should the programm print a new gamefield?
    public boolean refreshWorld(String eventIndex) {
        char c = eventIndex.charAt(0);
        
        switch (c) {
            case '0': return true;
            default : return false;
        }
    }
}
