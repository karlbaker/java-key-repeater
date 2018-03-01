package key.repeater;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class robot implements Runnable{
    
    int pressedKey;
    boolean status = true;
    
    // Generate a robot to repeatly press the assigned key every 3 seconds. The start button will call this.
    public robot (int cPressedKey1){
        pressedKey = cPressedKey1;
    }
    public void setStartStop(boolean value){status = value;}
    
    @Override
    public void run(){
        try {
            Robot robot = new Robot();
            do{
                robot.delay(2000);
                robot.keyPress(pressedKey);
            }while (status);
        }catch (AWTException e){
            e.printStackTrace();
        }
    }
    
    
}
