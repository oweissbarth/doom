package doom;
/*-----------------------------------------------------*/
//Achsenbelegung!
// x = Zeilen von oben nach unten
// y = Spalten von links nach rechts
/*-----------------------------------------------------*/

public class GameMain {

	private static World world;
        private static Gui mainWindow;
        
        //main-function
	public static void main (String[] args) {
                runGame();
                
        }
        
        //Opens Main Window and starts the Game
        public static void runGame(){
            mainWindow = new Gui();
                world = new World();
                world.draw(mainWindow);
                mainWindow.setVisible(true);
        }
        
        //function to reDraw the canvas
        public static void  play(String s) {
            world.move(s);
            world.draw(mainWindow);
            
        }
        
}









