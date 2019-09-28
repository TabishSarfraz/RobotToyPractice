package com.robot.robottoy;

import java.util.logging.Logger;

/**
 *
 * @author Tabish Sarfraz
 */
public class PlaceCommand implements Command{
    
    private RobotToy robotOne;
    private String placeCommand;
    
    private final static Logger LOGGER = Logger.getLogger(PlaceCommand.class.getName());
    
    public PlaceCommand(RobotToy robotOne, String placeCommand){
        
        this.robotOne = robotOne;
        this.placeCommand = placeCommand;
        
    }
    
    @Override
    public void execute(){
        
        String[] placeCommandHolder = placeCommand.replaceAll(",", " ").split("\\s");
        
        int postX = Integer.parseInt(placeCommandHolder[1]);
        int postY = Integer.parseInt(placeCommandHolder[2]);
        
        String commandPlace = placeCommandHolder[0];
        String directionValue = placeCommandHolder[3];
        
        if(commandPlace.equals(Commands.PLACE_COMMAND)){
            
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
