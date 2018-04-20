import greenfoot.*;

public class Clouds extends Actor
{
    int CLOUD_SPEED = -7;
    public void act() 
    {
        setLocation ( getX() + CLOUD_SPEED, getY());
    }    
}
