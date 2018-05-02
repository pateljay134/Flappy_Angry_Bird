import greenfoot.*; 

public class Bird extends Actor
{
    double dy = 0;
    double gr = 0.5;
    double BOOST_SPEED = -8;
    GreenfootSound bckgrnd = new GreenfootSound("Background_Sound.mp3");
    GreenfootSound bird_sound = new GreenfootSound("Wheee.mp3");
    
    public double acceleration() {
        double speed = (9.81 * dy)/gr;
        return speed;
    }

    public void act() 
    {
        setLocation( getX(), (int)(getY()+ dy) );
        bckgrnd.play();
        if ( (getOneIntersectingObject(BottomPipe.class) != null) ||
            (getOneIntersectingObject(TopPipe.class) != null) || 
            (getOneIntersectingObject(Clouds.class) != null) ||
            (getY() > getWorld().getHeight()) || (getY() < -100))
        {
            Died game_over = new Died();
            bckgrnd.stop();
            getWorld().addObject(game_over, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop(); 
        }
        
        if (Greenfoot.isKeyDown("space") == true)
        {   
            bird_sound.play();
            dy = BOOST_SPEED ;
        }
        
        if ( dy > -5 )
            setRotation(-20);
        else
            setRotation(0);
        
        dy = dy + gr ;       
    }
}
