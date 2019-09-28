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
    
    protected RobotToy robotOne = new RobotToy();
    
    public void parseCommand(String userCommand){
        
            if(robotOne != null){

            userCommand = userCommand.trim();

            Command command = commandConcreteCreator(userCommand);
            
            if(command != null){
            
                CommandInvoker commandInvoker = new CommandInvoker(command);
            
                commandInvoker.executeCommand();
                
            }else{
                
                LOGGER.warning("Command incorrect or not recognised. Please enter a correct command:");
                
            }
            
        }else{

            LOGGER.warning("Robot does not exist");

        }
            
    }
    
    private Command commandConcreteCreator(String userCommand){
        
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
