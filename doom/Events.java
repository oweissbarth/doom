package doom;

public class Events {
  
    //event-manager
    public String eventManager (Gui window, String eventIndex, Inventory inventory) {
            char c = eventIndex.charAt(0);
            
            switch (c){
                case '$' : return "m" + moneyEvent(window);
                case 't' : triggerEvent(window, eventIndex.charAt(1)); return " ";
                case 'w' : inventory.fillInventory("water", window); return " ";

                default:    window.setVisibility(false); return "e";
            }
    }
    
    //money-event
    public int moneyEvent(Gui window){
         double money = Math.random();
         int Pmoney = (int)((money *100) + 5);
         window.setEventLabel("You found "+ Pmoney +"$!");
         return Pmoney;
    }
    
    //trigger-event
    public void triggerEvent(Gui window, char index) {
        
        switch(index) {
            case 'r' : window.setEventLabel("Next to you is a red door!");
                break;
            case 'y' : window.setEventLabel("Next to you is a yellow door!");
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
            default : return false;
        }
    }
}
