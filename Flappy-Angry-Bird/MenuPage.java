import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPage extends World
{

    /**
     * Constructor for objects of class MenuPage.
     * 
     */
    MenuItem start;
    
    public MenuPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false);
        
        start = new MenuItem("Begin");
        
        addObject(start,80, 80);
        
    }
}
