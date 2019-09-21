/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tabish
 */
public class RobotToyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        RobotToy robotOne = new RobotToy();
        
        Scanner userInput = new Scanner(System.in);
        
        Pattern pattern = Pattern.compile(Commands.PLACE_COMMAND_PATTERN);
        
        while(userInput.hasNextLine()){
            
            String userCommand = userInput.nextLine();
            //System.out.println("userInput is :" + userInput.nextLine());
            
            System.out.println("userCommand is :" + userCommand);
            
            Matcher matchPlaceCommand = pattern.matcher(userCommand.trim());
            
            if(matchPlaceCommand.matches()){
               
               System.out.println("MATCEHR FOUND is :" + matchPlaceCommand);
               
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
                
                System.out.println("After place commaand robot value :" + robotOne.toString() );
                
                   
               }else{
                    System.out.println("The input values are out of bound");
               }
               
           }
            
            //rotate left
            if(userCommand.equals(Commands.ROTATE_LEFT_COMMAND)){
                   
                    int sizeOfRotatedDirectionsList = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.size();
                   
                    int indexOfCurrentDirection = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.indexOf(robotOne.getFaceDirection());
                   
                    int leftRotatedNewIndex = ((indexOfCurrentDirection - 1) + sizeOfRotatedDirectionsList ) % sizeOfRotatedDirectionsList;
                   
                    System.out.println("LEFT command current user direction  " + robotOne.getFaceDirection());
                   
                    robotOne.setFaceDirection(Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(leftRotatedNewIndex));
                   
                    System.out.println( "rotatedIndex" + leftRotatedNewIndex +  " value : " + Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(leftRotatedNewIndex));
                    System.out.println("direction has been changed to " + robotOne.getFaceDirection());
                
           }
                
            //rotate right
            if(userCommand.equals(Commands.ROTATE_RIGHT_COMMAND)){

                    int sizeOfRotatedDirectionsList = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.size();
                   
                    int indexOfCurrentDirection = Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.indexOf(robotOne.getFaceDirection());

                    int rightRotatedNewIndex = (indexOfCurrentDirection + 1 ) % sizeOfRotatedDirectionsList;
                    
                    System.out.println("RIGHT command current user direction  " + robotOne.getFaceDirection());
                   
                    robotOne.setFaceDirection(Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(rightRotatedNewIndex));
                    
                    System.out.println("direction has been changed to " + robotOne.getFaceDirection());
                    System.out.println( "rotatedIndex" + rightRotatedNewIndex +  " value : " + Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST.get(rightRotatedNewIndex));

           }
            
            //move
            if(userCommand.equals(Commands.MOVE_COMMAND)){
               
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

            if(userCommand.equals(Commands.REPORT_COMMAND)){
               
               System.out.println(robotOne.report());
               
           }
            
        }
        
    }
    
}
