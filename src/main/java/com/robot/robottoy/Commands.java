package com.robot.robottoy;

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
    CLOSE("CLOSE"),
    PLACE_COMMAND_PATTERN("^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)");
    
    private String commandValue;
    
    private Commands(String commandValue){
        
        this.commandValue = commandValue;
        
    }
    
    public String getCommandValue(){
        
        return commandValue;
        
    }
    
    
}
