package com.robot.robottoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tabish Sarfraz
 */
public class ConcreteCommandFactory {
    
    private static final String PLACE_COMMAND_PATTERN_REGEX = "^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)";
    private static final Pattern PLACE_COMMAND_PATTERN = Pattern.compile(PLACE_COMMAND_PATTERN_REGEX);

    
    public Command getConcreteCommand(String userCommandInput, RobotToy robotOne){
        
        String[] userCommandParams =  userCommandInput.replaceAll(",", " ").split("\\s");

        Commands userCommandEnum = Commands.getCommandByName(userCommandParams[0]);
          
        if(userCommandEnum != null){
            
            Matcher matchPlaceCommand = PLACE_COMMAND_PATTERN.matcher(userCommandInput);

            if(matchPlaceCommand.matches()){

                return new PlaceCommand(robotOne, userCommandParams);

            }else if(robotOne.isOnTable()){

                if(userCommandEnum.equals(Commands.RIGHT) || userCommandEnum.equals(Commands.LEFT)){

                    return new RotateCommand(robotOne, userCommandEnum);

                }else if(userCommandEnum.equals(Commands.MOVE)){

                    return new MoveCommand(robotOne);

                }else if(userCommandEnum.equals(Commands.REPORT)){

                    return new ReportCommand(robotOne);

                }

            }

        }
        
        return null;
    }
          
}
