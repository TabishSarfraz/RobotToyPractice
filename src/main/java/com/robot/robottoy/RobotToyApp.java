package com.robot.robottoy;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tabish
 */
public class RobotToyApp {

    private final static Logger LOGGER = Logger.getLogger(RobotToyApp.class.getName());
    
    public static void main(String[] args) {
        
        CommandParser commandParser = new CommandParser();
        
        System.out.println("Please enter one command per line: ");

        try{
            
            Scanner userInput = new Scanner(System.in);

            while(userInput.hasNextLine()){

                String userCommand = userInput.nextLine();

                if(userCommand.equals(Commands.EXIT.getCommandValue()) || userCommand.equals(Commands.CLOSE.getCommandValue())){
                    
                    break;
                    
                }

                commandParser.parseCommand(userCommand);

            }
            
            userInput.close();
        
        }catch(Exception e){
            
            LOGGER.log(Level.WARNING, "Exception {0}", e.getMessage());
            
        }
        
    }
    
}
