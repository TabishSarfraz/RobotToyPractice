package com.robot.robottoy;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tabish Sarfraz
 */
public class CommandActions {
    
    public CommandActions(){
            
    }
    
    private final static Logger LOGGER = Logger.getLogger(CommandActions.class.getName());
        
    public void rotateLeftOrRight(String rotateTowards, RobotToy robotOne){

        int sizeOfRotatedDirectionsList = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.size();
        int indexOfCurrentDirection = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.indexOf(robotOne.getFaceDirection());
        int rotatedNewIndex = -1;

        if(rotateTowards.equals(Commands.ROTATE_RIGHT_COMMAND)){
            
            rotatedNewIndex = (indexOfCurrentDirection + 1 ) % sizeOfRotatedDirectionsList;

        }else if (rotateTowards.equals(Commands.ROTATE_LEFT_COMMAND)){
            
            rotatedNewIndex = ((indexOfCurrentDirection - 1) + sizeOfRotatedDirectionsList ) % sizeOfRotatedDirectionsList;
        }
        
        if(rotatedNewIndex >= 0 && rotatedNewIndex < Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.size()){
            
            robotOne.setFaceDirection(Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(rotatedNewIndex));
        
        }else{
            
            LOGGER.log(Level.WARNING, "Incorrect rotated index {0}", rotatedNewIndex);
            
        }

    }
    
    public void place(String userCommand, RobotToy robotOne){
        
        String[] placeCommandHolder = userCommand.replaceAll(",", " ").split("\\s");
        
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
    
    public void report(RobotToy robotOne){
        
        if(robotOne != null){
        
            System.out.println(robotOne.report());
        
        }else{
            
            LOGGER.warning("Robot does not exist");
            
        }
        
    }
    
    public void move(RobotToy robotOne){
        
        if(robotOne != null){

            switch(robotOne.getFaceDirection()){
                case Directions.NORTH:

                    if(robotOne.getPositionY() < TableTop.TABLE_MAX_LENGTH_Y && robotOne.getPositionY() >= 0){

                        robotOne.incrementPositionY();

                    }

                    break;

                case Directions.SOUTH:

                    if(robotOne.getPositionY() <= TableTop.TABLE_MAX_LENGTH_Y && robotOne.getPositionY() > 0){

                        robotOne.decreasePositionY();

                    }

                    break;

                case Directions.EAST:

                    if(robotOne.getPositionX() < TableTop.TABLE_MAX_LENGTH_X && robotOne.getPositionX() >= 0 ){

                        robotOne.incrementPositionX();

                    }
                    break;


                case Directions.WEST:

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
