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
        
        CommandActions commandActions = new CommandActions();

        Scanner userInput = new Scanner(System.in);
        
        Pattern pattern = Pattern.compile(Commands.PLACE_COMMAND_PATTERN);
        
        while(userInput.hasNextLine()){
            
            String userCommand = userInput.nextLine().trim();

            System.out.println("userCommand is :" + userCommand);
            
            Matcher matchPlaceCommand = pattern.matcher(userCommand);
            
           if(matchPlaceCommand.matches()){
               
               commandActions.place(userCommand, robotOne);
               
           }
           
           if(robotOne.isOnTable()){
            if(userCommand.equals(Commands.ROTATE_RIGHT_COMMAND) || userCommand.equals(Commands.ROTATE_LEFT_COMMAND)){

                commandActions.rotateLeftOrRight(userCommand, robotOne);

            }

            if(userCommand.equals(Commands.MOVE_COMMAND)){

                commandActions.move(robotOne);

            }

            if(userCommand.equals(Commands.REPORT_COMMAND)){

                commandActions.report(robotOne);

            }

         }
        }
        
    }
    
}
