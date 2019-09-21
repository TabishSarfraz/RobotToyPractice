package com.robot.robottoy;

/**
 *
 * @author Tabish Sarfraz
 */
public class Commands {
    
    private Commands(){
        
    }
      
    public static final String MOVE_COMMAND = "MOVE";
    public static final String ROTATE_LEFT_COMMAND = "LEFT";
    public static final String ROTATE_RIGHT_COMMAND = "RIGHT";
    public static final String REPORT_COMMAND = "REPORT";
    public static final String PLACE_COMMAND_PATTERN = "^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)";
    
}
