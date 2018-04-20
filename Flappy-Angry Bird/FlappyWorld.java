import greenfoot.*;
import java.util.Random;
import java.util.*;

public class FlappyWorld extends World
{   Pipe pipe;
    int pipe_counter = 0;
    int flappy_counter = 0;
    int score = 0;
    int FIRST_PIPE = 410;
    Score myscore = null;
    
    GreenfootSound backgroundMusic = new GreenfootSound("1.mp3");
    
    public FlappyWorld()
    {    
        super(1200, 800, 1, false); 
        backgroundMusic.playLoop();
        
        setPaintOrder(Score.class, Clouds.class, Died.class, Bird.class, Pipe.class);
        Bird bird = new Bird();
        addObject(bird, 200, getHeight()/2);
        
        myscore = new Score();
        myscore.setScore(0);
        addObject(myscore, 600,50);
    }
    
    public void act()
    {
        pipe_counter++ ;
        int speed = 140;
        if(pipe_counter % speed == 0)
        {  
          if(score>3)
          {
              pipe = new Pipe(-3);
              speed = 50;
          }
          else
            pipe = new Pipe();
           
          GreenfootImage img = pipe.getImage();
          Random rand = new Random();
          int  n = rand.nextInt( getHeight()/4) + getHeight()/3;
          addObject(pipe, getWidth(), n + img.getHeight()/2);
           
          Clouds cloud = new Clouds();
          GreenfootImage imgc = cloud.getImage();
          Random rand1 = new Random();
          int  x = rand1.nextInt( getHeight()/5) + 5;
          addObject(cloud, getWidth(), x + imgc.getHeight());
          
        }
        
        if ( pipe_counter >= FIRST_PIPE)
        {
            if ( flappy_counter % 140 == 0 )
            {
               score++ ; 
               myscore.setScore(score);
            }
            flappy_counter++ ;
        }
    }

    }

