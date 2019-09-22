/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandParser {
    
    public CommandParser(){
        
    }
    
    private final static Logger LOGGER = Logger.getLogger(CommandParser.class.getName());
    
    public void parseCommand(String userCommand, RobotToy robotOne){
        
            if(robotOne != null){

            userCommand = userCommand.trim();

            CommandActions commandActions = new CommandActions();

            Pattern pattern = Pattern.compile(Commands.PLACE_COMMAND_PATTERN);
            Matcher matchPlaceCommand = pattern.matcher(userCommand);

            if(matchPlaceCommand.matches()){

                commandActions.place(userCommand, robotOne);

            }else if(robotOne.isOnTable()){

                 if(userCommand.equals(Commands.ROTATE_RIGHT_COMMAND) || userCommand.equals(Commands.ROTATE_LEFT_COMMAND)){

                     commandActions.rotateLeftOrRight(userCommand, robotOne);

                 }

                 if(userCommand.equals(Commands.MOVE_COMMAND)){

                     commandActions.move(robotOne);

                 }

                 if(userCommand.equals(Commands.REPORT_COMMAND)){

                     commandActions.report(robotOne);

                 }

            }else{

                LOGGER.warning("Command incorrect or not recognised. Please enter a correct command:");

            }

        }else{

            LOGGER.warning("Robot does not exist");

        }
            
    }
    
}
