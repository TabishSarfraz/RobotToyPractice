package com.robot.robottoy;

import com.robot.robottoy.RobotToy;
import java.util.logging.Logger;

/**
 *
 * @author Tabish Sarfraz
 */
public class ReportCommand implements Command{
    
    private RobotToy robotOne;
    
    private final static Logger LOGGER = Logger.getLogger(ReportCommand.class.getName());
    
    public ReportCommand(RobotToy robotOne){
    
        this.robotOne = robotOne;
        
    }
    
    @Override
    public void execute(){
        
        if(robotOne != null){
        
            System.out.println(robotOne.report());
        
        }else{
            
            LOGGER.warning("Robot does not exist");
            
        }
        
    }
    
}
