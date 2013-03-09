package doom;

public class Events {
  

public int MoneyEvent(Gui window){
     double money = Math.random();
     int Pmoney = (int)((money *100) + 5);
     window.setEventLabel("You found "+ Pmoney +"$!");
     return Pmoney;
}
    
public String eventManager (Gui window, String s) {
    char tile = s.charAt(0);
        
        switch (tile){
            case '$':   return "m" + MoneyEvent(window);
               
            default:    window.setVisibility(false); return "e";
        }
}

public boolean delEvent(String eventString) {
    char c = eventString.charAt(0);
    
    switch (c) {
        case '$': return true;
        default : return false;
    }
    
    
    

		
}

}
