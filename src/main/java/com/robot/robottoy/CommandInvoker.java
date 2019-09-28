package com.robot.robottoy;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandInvoker {
    
    public Command command;
    
    public CommandInvoker(Command command){
        
        this.command = command;
        
    }
    
    public void executeCommand(){
        
        this.command.execute();
        
    }
    
}
