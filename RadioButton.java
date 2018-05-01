import greenfoot.*; 

public class RadioButton extends Actor {
 
    RadioState StateOn ;
    RadioState StateOff ;

    RadioState currentState ;
    
    String label;
    
    public RadioButton(String label)
    {
       
        
        
    }
    
    
  
     
    public void stateOn() {
        
     
    }
     
    public void stateOff() {
       
        currentState.doSwitchOff();
    }
    
     
    void setState(RadioStates nextState) {
        switch( nextState ) {
            case OFF :          currentState = StateOff ; break ;
            case ON :           currentState = StateOn ; break ;
        }

    }
    
    public void showState()
    {
        System.out.println( "Current State: " + currentState.getClass().getName());
    }
    
    public void act() 
    {
        
    }
     
}