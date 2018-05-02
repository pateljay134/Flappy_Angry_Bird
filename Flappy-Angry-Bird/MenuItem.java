import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuItem extends Actor
{
    /**
     * Act - do whatever the MenuItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String label;
    
    public MenuItem(String label){
        
        this.label = label;
    
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
           
             FlappyWorld w = new FlappyWorld();
             Greenfoot.setWorld(w);
            
        }
    }    
}
