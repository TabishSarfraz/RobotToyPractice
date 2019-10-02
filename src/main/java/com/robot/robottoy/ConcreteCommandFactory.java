package com.robot.robottoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tabish Sarfraz
 */
public class ConcreteCommandFactory {
    
    public Command getConcreteCommand(String userCommand, RobotToy robotOne){
    
        Pattern pattern = Pattern.compile(Commands.PLACE_COMMAND_PATTERN.getCommandValue());

        Matcher matchPlaceCommand = pattern.matcher(userCommand);

        if(matchPlaceCommand.matches()){

            return new PlaceCommand(robotOne, userCommand);

        }else if(robotOne.isOnTable()){

            if(userCommand.equals(Commands.RIGHT.getCommandValue()) || userCommand.equals(Commands.LEFT.getCommandValue())){

                return new RotateCommand(robotOne, userCommand);

            }else if(userCommand.equals(Commands.MOVE.getCommandValue())){

                return new MoveCommand(robotOne);

            }else if(userCommand.equals(Commands.REPORT.getCommandValue())){

                return new ReportCommand(robotOne);

            }

        }

        return null;

    }
          
}
