/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandParser {
    
    public CommandParser(){
        
    }
    
    public void parseCommand(String userCommand, RobotToy robotOne){
        
        userCommand = userCommand.trim();
        
        CommandActions commandActions = new CommandActions();
        
        Pattern pattern = Pattern.compile(Commands.PLACE_COMMAND_PATTERN);
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
