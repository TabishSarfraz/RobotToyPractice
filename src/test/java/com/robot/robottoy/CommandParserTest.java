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

    @Before
    public void setUp() {
    }

    @Test
    public void testParseCommandWithEmptyCommandValue() {

        String userCommand = "";
        
        RobotToy robotOne = new RobotToy();
        
        CommandParser instance = new CommandParser();
        
        instance.parseCommand(userCommand);

        assertEquals(robotOne.getPositionX(), 0);
        assertEquals(robotOne.getPositionX(), 0);
        assertNull(robotOne.getFaceDirection());
        assertFalse(robotOne.isOnTable());
    }
    
    @Test
    public void testParseCommandWithEmptyRobotValue() {

        String userCommand = "MOVE";
        
        RobotToy robotOne = null;
        
        CommandParser instance = new CommandParser();
        
        instance.parseCommand(userCommand);

        assertNull(robotOne);

    }
    
    @Test
    public void testParseCommandWithEmptyCommandAndRobotValue() {

        String userCommand = "";
        
        RobotToy robotOne = null;
        
        CommandParser instance = new CommandParser();
        
        instance.parseCommand(userCommand);

        assertNull(robotOne);
    }
    
    @Test
    public void testParseCommandWithMoveCommandRobotNotOnTable() {

        String userCommand = "MOVE";
        
        RobotToy robotOne = new RobotToy(1,1,"EAST");
        
        CommandParser instance = new CommandParser();
        
        instance.parseCommand(userCommand);

        assertEquals(1, robotOne.getPositionX());
    }
    
    
    @Test
    public void testParseCommandWithMoveCommandRobotOnTable() {

        String userCommand = "MOVE";
        
        RobotToy robotOne = new RobotToy(1,1,"EAST");
        
        robotOne.setOnTable(true);
        
        CommandParser instance = new CommandParser();
        
        instance.robotOne = robotOne;
        
        instance.parseCommand(userCommand);

        assertEquals(2, robotOne.getPositionX());
    }
    
    
    
}
