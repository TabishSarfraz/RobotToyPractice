package com.robot.robottoy;

import java.util.logging.Logger;

/**
 *
 * @author Tabish Sarfraz
 */
public class PlaceCommand implements Command{
    
    private RobotToy robotOne;
    private String[] placeCommandParams;
    
    private final static Logger LOGGER = Logger.getLogger(PlaceCommand.class.getName());
    
    public PlaceCommand(RobotToy robotOne, String[] placeCommandParams){
        
        this.robotOne = robotOne;
        this.placeCommandParams = placeCommandParams;
        
    }
    
    @Override
    public void execute(){

        Commands commandPlace = Commands.valueOf(placeCommandParams[0]);
        
        int postX = Integer.parseInt(placeCommandParams[1]);
        int postY = Integer.parseInt(placeCommandParams[2]);
                
        Directions directionValue = Directions.getValueByName(placeCommandParams[3]);
        
        if(commandPlace.equals(Commands.PLACE)){
            
            if(postX <= TableTop.TABLE_MAX_LENGTH_X && postY <= TableTop.TABLE_MAX_LENGTH_Y && postX >= 0 && postY >= 0){

                if(!robotOne.isOnTable()){

                   robotOne.setOnTable(true);

                }

                robotOne.setPositionX(postX);
                robotOne.setPositionY(postY);
                robotOne.setFaceDirection(directionValue);

            }else{

                LOGGER.warning("The input values are outside of table");

            }
            
        }else{
                
            LOGGER.warning("Incorrect place command");
            
        }
        
    }
    
}
