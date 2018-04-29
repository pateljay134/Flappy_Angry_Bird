import greenfoot.*;
import java.lang.Object;

public class Score extends Actor
{
    public Score() 
    {
        GreenfootImage newImage = new GreenfootImage(75, 50);
        setImage(newImage);
    }    
    
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        //Font fnt = new Font("Arial", Font.PLAIN, 30);
        //newImage.setFont(fnt);
        
        //Color clr = new Color(127,127,127,127);
        newImage.setColor(Color.GREEN);
        newImage.fill();
        newImage.setColor(Color.BLACK);
        newImage.setFont(newImage.getFont().deriveFont(50));
        newImage.drawString("" + score, 7, 42);
        setImage(newImage);
    }

    public void addObserver(Observers newObserver)
    {
        observers.add(newObserver);
        //System.out.println("Observer registered: " + newObserver);
    }
    public void removeObserver(Observers observer)
    {
            //System.out.println("Observer unregistered: " + observer);
            observers.remove(observers.indexOf(observer));
        
    }
    public void notifyObserver()
    {
            System.out.println(" Notifing observer ");
            for(Observers observer : observers)
            {
                //System.out.println("Name: " + observer);
                observer.updateSpeed();
            }
            
    }
}
