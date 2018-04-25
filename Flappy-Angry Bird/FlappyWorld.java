import greenfoot.*;
import java.util.Random;
import java.util.*;

public class FlappyWorld extends World
{
    int pipe_counter = 0;
    int flappy_counter = 0;
    int score = 0;
    int FIRST_PIPE = 415;
    Score myscore = null;
    
    public FlappyWorld()
    {    
        super(1200, 800, 1, false);
        
        setPaintOrder(Score.class, Clouds.class, Died.class, Bird.class, BottomPipe.class);
        Bird bird = new Bird();
        addObject(bird, 200, getHeight()/2);
        
        myscore = new Score();
        myscore.setScore(0);
        addObject(myscore, 600, 30);
    }
    
    public void act(){
        pipe_counter++ ;
        if (pipe_counter % 140 == 0)
        {
            BottomPipe pipe = new BottomPipe();
            GreenfootImage img_pipe = pipe.getImage();
            Random rndm_pipe = new Random();
            int  add_pipe = rndm_pipe.nextInt( getHeight()/4) + getHeight()/3;//4&3
            addObject(pipe, getWidth(), add_pipe + img_pipe.getHeight()/5);
           
            //if (pipe_counter % 140 !=0 && pipe_counter % 70 !=0)
            //{
              //  TopPipe pipe2 = new TopPipe();
                //GreenfootImage img_pipe2 = pipe2.getImage();
               // Random rndm_pipe2 = new Random();
               // int  add_pipe2 = rndm_pipe2.nextInt( getHeight()) + getHeight()/3;//4&3
                //addObject(pipe2, getWidth(), add_pipe2 + img_pipe2.getHeight()/7);
           
                //addObject(pipe2, getWidth(),1);
                //pipe2.turn(180);
            //}
            Clouds cloud = new Clouds();
            GreenfootImage img_cloud = cloud.getImage();
            Random rndm_cloud = new Random();
            int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());
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