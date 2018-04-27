import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Template
{
    ScoreManager sc= ScoreManager.getInstance();
    public Apple(){
        setImage("apple.png"); 
         
        flag = true;
        scoreManager = ScoreManager.getInstance();
    }
    public void increasePoints(int score){
        // checking hardcoded values
        scoreManager.addScore(100);
    }
    
    public void decreaseSpeed(){
    
    }
}
