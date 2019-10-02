package com.robot.robottoy;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandParserTest {
    
    public CommandParserTest() {
    }
    
    private RobotToy robotOne;
    
    private String userCommand;
    
    private CommandParser instance;

    @Before
    public void setUp() {
        
        userCommand = "";
        
        robotOne = new RobotToy();
        
        instance = new CommandParser();
        
    }

    @Test
    public void testParseCommandWithEmptyCommandValue() {

        instance.parseCommand(userCommand);

        assertEquals(robotOne.getPositionX(), 0);
        assertEquals(robotOne.getPositionX(), 0);
        assertNull(robotOne.getFaceDirection());
        assertFalse(robotOne.isOnTable());
    }
    
    @Test
    public void testParseCommandWithEmptyRobotValue() {

        userCommand = "MOVE";
        
        robotOne = null;
        
        instance.parseCommand(userCommand);

        assertNull(robotOne);

    }
    
    @Test
    public void testParseCommandWithEmptyCommandAndRobotValue() {
        
        robotOne = null;
        
        instance.parseCommand(userCommand);

        assertNull(robotOne);
    }
    
    @Test
    public void testParseCommandWithMoveCommandRobotNotOnTable() {

        userCommand = "MOVE";
        
        robotOne = new RobotToy(1,1,"EAST");
        
        instance.parseCommand(userCommand);

        assertEquals(1, robotOne.getPositionX());
    }
    
    
    @Test
    public void testParseCommandWithMoveCommandRobotOnTable() {

        userCommand = "MOVE";
        
        robotOne = new RobotToy(1,1,"EAST");
        
        robotOne.setOnTable(true);
        
        instance.robotOne = robotOne;
        
        instance.parseCommand(userCommand);

        assertEquals(2, robotOne.getPositionX());
    }
    
    
    
}
