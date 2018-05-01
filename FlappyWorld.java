import greenfoot.*;
import java.util.Random;
import java.util.*;

public class FlappyWorld
{
    
    GameStrategy gameStrategy;
    Store store = Store.getInstance();
   
    public FlappyWorld()
    {    
       gameStrategy = new MediumGameStrategy();
       
       
    }
    
    
    public void changeStrategy(String difficulty) {
        
         switch(difficulty) {
        
<<<<<<< HEAD
        addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());

            Random rand = new Random();
            
            int  n = rand.nextInt(2) + 1;
            
            
                Clouds cloud = new Clouds();
                GreenfootImage img_cloud = cloud.getImage();
                Random rndm_cloud = new Random();
                myscore.addObserver(cloud);
                int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;


        
        if ( pipe_counter >= FIRST_PIPE)
        {
            if ( flappy_counter % 100 == 0 )
            {
               score++ ; 
               myscore.setScore(score);
            }
            flappy_counter++ ;
=======
            case "Easy" : gameStrategy = new EasyGameStrategy(); break;
            default :
            case "Medium" :gameStrategy = new MediumGameStrategy(); break;
            case "Hard" :gameStrategy = new HardGameStrategy(); break;
            case "Brutal" : gameStrategy = new BrutalGameStrategy(); break;
>>>>>>> 8c5e6dc5ecb7dd728c2e11eff6fa06dd3c5dc264
        }
        
    }
    
    public void start() {
        Greenfoot.setWorld(gameStrategy);
    }
    
}