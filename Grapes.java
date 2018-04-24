import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grapes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grapes extends Template
{
    /**
     * Act - do whatever the Grapes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Grapes(){
        setImage("grapes.png"); 
        
          flag = true;
        scoreManager = ScoreManager.getInstance();
    }

    public void increasePoints(int score){
        scoreManager.addScore(50);
    }
    
    public void decreaseSpeed(){
        
    }
    

}
