/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandActions {
    
    public CommandActions(){
            
    }
        
    public void rotateLeftOrRight(String rotateTowards, RobotToy robotOne){

        int sizeOfRotatedDirectionsList = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.size();
        int indexOfCurrentDirection = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.indexOf(robotOne.getFaceDirection());
        int rotatedNewIndex = -1;

        if(rotateTowards.equals(Commands.ROTATE_RIGHT_COMMAND)){
            rotatedNewIndex = (indexOfCurrentDirection + 1 ) % sizeOfRotatedDirectionsList;

        }else if (rotateTowards.equals(Commands.ROTATE_LEFT_COMMAND)){
            rotatedNewIndex = ((indexOfCurrentDirection - 1) + sizeOfRotatedDirectionsList ) % sizeOfRotatedDirectionsList;
        }

        robotOne.setFaceDirection(Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(rotatedNewIndex));

    }
    
    public void place(String userCommand, RobotToy robotOne){
        
        String[] placeCommandHolder = userCommand.replaceAll(",", " ").split("\\s");

        int postX = Integer.parseInt(placeCommandHolder[1]);
        int postY = Integer.parseInt(placeCommandHolder[2]);
        String directionValue = placeCommandHolder[3];

        if(postX <= TableTop.TABLE_SIZE_X && postY <= TableTop.TABLE_SIZE_Y && postX >= 0 && postY >= 0){

            if(!robotOne.isOnTable()){
               robotOne.setOnTable(true);
            }
            robotOne.setPositionX(postX);
            robotOne.setPositionY(postY);
            robotOne.setFaceDirection(directionValue);

       }else{
            
            System.out.println("The input values are out of bound");
            
        }
    }
    
    public void report(RobotToy robotOne){
        
        System.out.println(robotOne.report());
        
    }
    
    public void move(RobotToy robotOne){
        
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
    }
    
}
