import greenfoot.*;

public class Clouds extends Actor
{
    int CLOUD_SPEED = -13;
    int CLOUD_SIZE = 1;
    //int CLOUD_INTERIA = 0.8;
    String color;


    public void act() 
    {
        setLocation ( getX() + CLOUD_SPEED, getY());
    }    
}