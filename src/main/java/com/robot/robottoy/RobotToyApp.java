package com.robot.robottoy;

import java.util.Scanner;
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
        
        CommandParser commandParser = new CommandParser();
        
        System.out.println("Please enter one command per line: ");

        try{
            Scanner userInput = new Scanner(System.in);

            while(userInput.hasNextLine()){

                String userCommand = userInput.nextLine();

                if(userCommand.equals("CLOSE") || userCommand.equals("EXIT")){
                    break;
                }

                commandParser.parseCommand(userCommand, robotOne);

            }
            
            userInput.close();
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
