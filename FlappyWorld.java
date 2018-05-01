import greenfoot.*;

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
        
        setPaintOrder(Score.class, Died.class, Bird.class, Pipe.class);
        Bird bird = new Bird();
        addObject(bird, 200, getHeight()/2);
        
        myscore = new Score();
        myscore.setScore(0);
        addObject(myscore, 600, 50);
    }
    
    public void act()
    {
        pipe_counter++ ;
        //System.out.println(pipe_counter);
        if (pipe_counter % 140 == 0)
        {
           Pipe pipe = new Pipe();
           
           GreenfootImage img = pipe.getImage();
           addObject(pipe, getWidth(), getHeight()/2 + img.getHeight()/2);
        }
        
        addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());

            Random rand = new Random();
            
            int  n = rand.nextInt(2) + 1;
            
            
            if(n == 1){
                Clouds cloud = new Clouds();
                GreenfootImage img_cloud = cloud.getImage();
                Random rndm_cloud = new Random();
                myscore.addObserver(cloud);
                int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            }else{
                 Clouds cloud = new Clouds();
                GreenfootImage img_cloud = cloud.getImage();
                Random rndm_cloud = new Random();
                myscore.addObserver(cloud);
                int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            }


            cloud = new Clouds();
            myscore.addObserver(cloud);
            GreenfootImage img_cloud = cloud.getImage();
            Random rndm_cloud = new Random();
            int  add_cloud = rndm_cloud.nextInt( getHeight()/5) + 3;//5&5
            addObject(cloud, getWidth(), add_cloud + img_cloud.getHeight());


        
        if ( pipe_counter >= FIRST_PIPE)
        {
            if ( flappy_counter % 100 == 0 )
            {
               score++ ; 
               myscore.setScore(score);
            }
            flappy_counter++ ;
        }
    }

}

