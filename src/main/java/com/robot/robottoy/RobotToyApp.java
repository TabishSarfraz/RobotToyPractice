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

                String userCommandInput = userInput.nextLine();

                if(userCommandInput.equals(Commands.EXIT.getCommandValue()) || userCommandInput.equals(Commands.CLOSE.getCommandValue())){
                    
                    break;
                    
                }

                commandParser.parseCommand(userCommandInput);

            }
            
            userInput.close();
        
        }catch(Exception e){
            
            LOGGER.log(Level.WARNING, "Exception {0}", e.getMessage());
            
        }
        
    }
    
}
