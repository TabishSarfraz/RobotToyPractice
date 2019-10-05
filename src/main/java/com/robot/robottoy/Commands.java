package com.robot.robottoy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tabish Sarfraz
 */
public enum Commands{
    
    MOVE("MOVE"),
    LEFT("LEFT"),
    RIGHT("RIGHT"),
    REPORT("REPORT"),
    PLACE("PLACE"),
    EXIT("EXIT"),
    CLOSE("CLOSE");

    private String commandValue;
    
    private static final Map<String, Commands> COMMANDS_MAP = new HashMap<>();
    
    private Commands(String commandValue){
        
        this.commandValue = commandValue;
        
    }
    
    public String getCommandValue(){
        
        return commandValue;
        
    }
    
    static{ 
        
        for(Commands commandItem : Commands.values()){
            
            COMMANDS_MAP.put(commandItem.getCommandValue(), commandItem);
            
        }
        
    }
    
    public static Commands getCommandByName(String commandName){
        
        return COMMANDS_MAP.get(commandName);
        
    }
    
    
}
