package com.robot.robottoy;

import com.robot.robottoy.Directions;
import com.robot.robottoy.RobotToy;
import com.robot.robottoy.TableTop;
import java.util.logging.Logger;

/**
 *
 * @author Tabish Sarfraz
 */
public class MoveCommand implements Command {
    
    private RobotToy robotOne;
    
    private final static Logger LOGGER = Logger.getLogger(MoveCommand.class.getName());
    
    public MoveCommand(RobotToy robotOne){
        
        this.robotOne = robotOne;
        
    }
    
    @Override
    public void execute(){
        
        if(robotOne != null){
            
            Directions currentDirection = Directions.valueOf(robotOne.getFaceDirection());

            switch(currentDirection){
                case NORTH:

                    if(robotOne.getPositionY() < TableTop.TABLE_MAX_LENGTH_Y && robotOne.getPositionY() >= 0){

                        robotOne.incrementPositionY();

                    }

                    break;

                case SOUTH:

                    if(robotOne.getPositionY() <= TableTop.TABLE_MAX_LENGTH_Y && robotOne.getPositionY() > 0){

                        robotOne.decreasePositionY();

                    }

                    break;

                case EAST:

                    if(robotOne.getPositionX() < TableTop.TABLE_MAX_LENGTH_X && robotOne.getPositionX() >= 0 ){

                        robotOne.incrementPositionX();

                    }
                    break;


                case WEST:

                    if(robotOne.getPositionX() <= TableTop.TABLE_MAX_LENGTH_X && robotOne.getPositionX() > 0 ){

                        robotOne.decreasePositionX();

                    }

                    break;

            }

        }else{
            
            LOGGER.warning("Robot does not exist");
            
        }
        
        
    }
    
}
