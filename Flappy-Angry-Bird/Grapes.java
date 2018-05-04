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
    
    ScoreManager scoreManager;
    Score sc = new Score();
    public Grapes(){
        //GreenfootImage img = this.getImage();
        //addObject(this, getWidth(), img.getHeight()*4);
        
        scoreManager = ScoreManager.getInstance(); 
        
    }
    
    public void increasePoints(int score){
        System.out.println("Inside");
        //FlappyWorld.updateScore(20);
        //scoreManager.addScore(5);
      
      //  sc.setScore(scoreManager.getScore());

    }
    
    public void decreaseSpeed(){}
}
