package doom;
/**
 * Class to manage the different levels
 * 
 */
class LevelManager {
    /**
     * The current index of the level
     */
    private int currentLevelIndex;
    
    /**
     * This array contains all levels
     */
    private GameField[] levelCollection;
    
    /**
     * Constructor which is creating the level-array and setting the level-index to '1'
     */
    public LevelManager () {
        this.levelCollection = new GameField[3];
        this.currentLevelIndex = 1;
        makeLevelCollection();
    }
    
    /**
     * Function to get the current level-index
     * @return current level-index
     */
    public int getCurrentLevelIndex() {
        return this.currentLevelIndex;
    }
    
    /**
     * Function to get the string of the current level
     * @return a string of the current level
     */
    public GameField getLevel() {
        int i = getCurrentLevelIndex();
        GameField f = levelCollection[i-1];
        return f;
    }
    
    /**
     * Function to set the level-index to a new value
     * @param i will be the new level-index
     */
    public void setCurrentLevelIndex(int i) {
        this.currentLevelIndex = i;
    }
    
    /**
     * This function contains all level and insert each into the level-array
     * Portals -> 0(destinationLevel, portalAdress, destinationPortalAdress)
     * Trigger -> t(color | dragon)
     * Door -> +(color)
     * Money -> $
     * Weapon -> |
     * Wall -> #
     * Dragon -> 'at'
     * Water -> w
     */
    private void makeLevelCollection(){
        //level one
        String levelOne =           "##########################################################################################" +
                                    "#------k(r)---------------------------------------------------------------------------------#" +
                                    "#----------------------------|------------------#----------------------------------------#" +
                                    "#----------t(r)#-----------------------------------#----------------------------------------#" +
                                    "#-------###+(r)###---------------------------------#----------------------------------------#" +
                                    "#-------#$$$$$#---------------------------------#----------------------------------------#" +
                                    "#-------#######----------|----------------------#----------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#---------------------------------------@------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#-########################################################################################" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#-######################################################################################-#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#---------------------------------------------------------------------------------------##" +
                                    "###########------------------------------------------------------------------------------0(1,0,2)" +
                                    "#wwwwwwwww#-----------------------------------------------------------------------------##" +
                                    "#---k(r)-----#-----------------------------------------------------------------------------##" +
                                    "#---------#------------------------------------------------------------------------------0(2,1,0)" +
                                    "#0(3,3,1)--------#--------------------------#-#------------------------------------------------##" +
                                    "######################################0(1,2,0)###################################################";
        this.levelCollection[0] = new GameField(levelOne, 90, 30);
        //level two
        String levelTwo =           "##########################################################################################" +
                                    "#0(1,0,1)---------------------------------------------------------------------------------------#" +
                                    "#--------------------------------------###-----------------------------------------------#" +
                                    "#----------------------------------------#-----------------------------------------------#" +
                                    "#--------------------------------------###-----------------------------------------------#" +
                                    "#--------------------------------------#-------------------------------------------------#" +
                                    "#--------------------------------------###-----------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#---------------------------------------t(@)------------------------------------------------#" +
                                    "#--------------------------------------t(@)@t(@)-----------------------------------------------#" +
                                    "#---------------------------------------t(@)------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#0(3,1,0)---------------------------------------------------------------------------------------#" +
                                    "##########################################################################################";
        this.levelCollection[1] = new GameField(levelTwo, 90, 30);
        //level three
        String levelThree =         "##########################################################################################" +
                                    "#0(2,0,1)---------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#---------------------------------------###----------------------------------------------#" +
                                    "#-----------------------------------------#----------------------------------------------#" +
                                    "#---------------------------------------###----------------------------------------------#" +
                                    "#-----------------------------------------#----------------------------------------------#" +
                                    "#---------------------------------------###----------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#---------------------------------------ww-----------------------------------------------#" +
                                    "#---------------------------------------ww-----------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#----------------------------------------------------------------------------------------#" +
                                    "#0(1,1,3)---------------------------------------------------------------------------------------#" +
                                    "##########################################################################################";
        this.levelCollection[2] = new GameField(levelThree, 90, 30);
    }
}
