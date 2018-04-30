import greenfoot.*;

public class airplane extends Actor implements Observers
{
    int PLANE_SPEED = -7;
    public void act() 
    {
        setLocation ( getX() + PLANE_SPEED, getY());
    }    
    
    
    public void updateSpeed()
    {
        PLANE_SPEED = PLANE_SPEED - 10;
    }
}
