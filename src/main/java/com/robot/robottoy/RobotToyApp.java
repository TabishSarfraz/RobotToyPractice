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
        
        int tableXLength = 5;
        int tableYLength = 5;
        
        int tableMaxLengthX = tableXLength - 1;
        int tableMaxLengthY = tableYLength - 1;
        
        Scanner userInput = new Scanner(System.in);
        
        Pattern pattern = Pattern.compile("^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)");
        
        while(userInput.hasNextLine()){
            
            String userCommand = userInput.nextLine();
            //System.out.println("userInput is :" + userInput.nextLine());
            
            System.out.println("userCommand is :" + userCommand);
            
            Matcher matcher = pattern.matcher(userCommand.trim());
            
           if(matcher.matches()){
               
               System.out.println("MATCEHR FOUND is :" + matcher);
               
               String[] placeCommandHolder = userCommand.replaceAll(",", " ").split("\\s");
               
               int postX = Integer.parseInt(placeCommandHolder[1]);
               int postY = Integer.parseInt(placeCommandHolder[2]);
               String directionValue = placeCommandHolder[3];
               
           }
            
        }
        
    }
    
}
