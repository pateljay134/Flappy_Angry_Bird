import greenfoot.*; 

public class Bird extends Actor
{
    double dy = 0;
    double gr = 0.8;
    double BOOST_SPEED = -10;
    
    public void act() 
    {
        setLocation( getX(), (int)(getY()+ dy) );
        
        if (getOneIntersectingObject(Pipe.class)!=null||getOneIntersectingObject(Clouds.class) != null)
        {
            gameOver();        
        }
        
        if (Greenfoot.isKeyDown("space") == true)
        {
            dy = BOOST_SPEED ;
        }
        
        if ( dy > -5 )
        {   
            setRotation(-15);
        }
        else
        {
            setRotation(0);
        }
        
        if (getY() > getWorld().getHeight() || getY() < -100)
        {
           gameOver();
        }
        dy = dy + gr ;       
    }
    private void gameOver()
    {
        Died bye = new Died();
        getWorld().addObject(bye, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
}
