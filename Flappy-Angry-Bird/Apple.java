import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Template
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

     */
    ScoreManager scoreManager;
    Score sc = new Score();
    BottomPipe bp = new BottomPipe();
    boolean flag;
    public Apple(){
        //GreenfootImage img = this.getImage();
        //addObject(this, getWidth(), img.getHeight()*4);
        flag = true;
        scoreManager = ScoreManager.getInstance(); 
        
    }
    public boolean allowed() { return flag; }
    public void increasePoints(int score){
        System.out.println("Inside");
        //FlappyWorld.updateScore(20);
        flag = false;
        System.out.println(score+" <=> "+scoreManager.getScore());
        score = scoreManager.getScore() + score;
        scoreManager.setScore(score);
      
        sc.setScore(scoreManager.getScore());
    }
    
    public void decreaseSpeed(){
        bp.reducePipeSpeed();
    }
}
