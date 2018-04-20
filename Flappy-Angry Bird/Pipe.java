import greenfoot.*;

public class Pipe extends Actor
{
    int PIPE_SPEED ;
    public void setSpeed(){
        PIPE_SPEED = -1000;
    }
    public Pipe(){
        PIPE_SPEED = -4;
    }
    public Pipe(int x){
        PIPE_SPEED = x;
    }
    public void act() 
    {
        setLocation ( getX() + PIPE_SPEED, getY());
    }    
}
