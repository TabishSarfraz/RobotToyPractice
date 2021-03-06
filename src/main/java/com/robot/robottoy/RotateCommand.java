package com.robot.robottoy;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Tabish Sarfraz
 */
public class RotateCommand implements Command {
    
    private RobotToy robotOne;
    private Commands rotateDirectionTowards;
    
    private final static Logger LOGGER = Logger.getLogger(RotateCommand.class.getName());
    
    public RotateCommand(RobotToy robotOne, Commands rotateDirectionTowards){
        
        this.robotOne = robotOne;
        this.rotateDirectionTowards = rotateDirectionTowards;
        
    }
    
    @Override
    public void execute(){
        
        int sizeOfRotatedDirectionsList = Directions.values().length;
        int indexOfCurrentDirection = robotOne.getFaceDirection().getDirectionIndex();
        int rotatedNewIndex = -1;

        if(rotateDirectionTowards.equals(Commands.RIGHT)){
            
            rotatedNewIndex = (indexOfCurrentDirection + 1 ) % sizeOfRotatedDirectionsList;

        }else if (rotateDirectionTowards.equals(Commands.LEFT)){
            
            rotatedNewIndex = ((indexOfCurrentDirection - 1) + sizeOfRotatedDirectionsList ) % sizeOfRotatedDirectionsList;
        }
        
        if(rotatedNewIndex >= 0 && rotatedNewIndex < Directions.values().length){
            
            robotOne.setFaceDirection(Directions.getValueByIndex(rotatedNewIndex));
        
        }else{
            
            LOGGER.log(Level.WARNING, "Incorrect rotated index {0}", rotatedNewIndex);
            
        }
        
    }
    
}
