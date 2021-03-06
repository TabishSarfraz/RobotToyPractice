package com.robot.robottoy;

import java.util.logging.Logger;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandParser {
    
    public CommandParser(){
        
    }
    
    private final static Logger LOGGER = Logger.getLogger(CommandParser.class.getName());
    
    protected RobotToy robotOne = new RobotToy();
    
    private ConcreteCommandFactory concreateCommandFactory = new ConcreteCommandFactory();
    
    public void parseCommand(String userCommandInput){
        
            if(robotOne != null){

                userCommandInput = userCommandInput.trim();

                Command command = concreateCommandFactory.getConcreteCommand(userCommandInput, robotOne);

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

}
