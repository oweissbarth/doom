package doom;
//hallo ich bin von mir
/*-----------------------------------------------------*/
//Axenbelegung!
// x = Zeilen von oben nach unten
// y = Spalten von links nach rechts
/*-----------------------------------------------------*/

public class GameMain {

	private static World world;
        private static Gui mainWindow;
            
	public static void main (String[] args) {
                mainWindow = new Gui();
                world = new World();
                world.draw(mainWindow);
                mainWindow.setVisible(true);
             
	}
        
        public static void makeNew(String s) {
            world.move(s);
            world.draw(mainWindow);
            
        }

}









