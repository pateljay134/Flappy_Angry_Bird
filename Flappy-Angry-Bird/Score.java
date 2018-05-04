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
        
        newImage.setColor(Color.BLACK);
        newImage.fill();
        newImage.setColor(Color.WHITE);
        newImage.setFont(newImage.getFont().deriveFont(50));
        newImage.drawString("" + score, 7, 42);
        setImage(newImage);
    }
}
