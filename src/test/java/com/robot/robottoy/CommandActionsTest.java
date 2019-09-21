package com.robot.robottoy;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandActionsTest {
    
    public CommandActionsTest() {
    }
    
    private RobotToy robotOne;
    
    @Before
    public void setUp() {
        
        robotOne = new RobotToy(1,2,"NORTH");
        robotOne.setOnTable(true);
        
    }

    @Test
    public void testRotateLeftOrRightWithRotateTowardsLeft() {

        String rotateTowards = "LEFT";

        CommandActions instance = new CommandActions();
        
        instance.rotateLeftOrRight(rotateTowards, robotOne);

        assertEquals("WEST", robotOne.getFaceDirection());

    }

    @Test
    public void testPlace() {

        String userCommand = "PLACE 3,1,SOUTH";
        
        RobotToy robotExpectedResult = new RobotToy(3,1,"SOUTH");

        CommandActions instance = new CommandActions();
        
        instance.place(userCommand, robotOne);

        assertEquals(robotExpectedResult.getPositionX(), robotOne.getPositionX());
        assertEquals(robotExpectedResult.getPositionY(), robotOne.getPositionY());
        assertEquals(robotExpectedResult.getFaceDirection(), robotOne.getFaceDirection());
    }

    @Test
    public void testReport() {
        
        CommandActions instance = new CommandActions();

        assertEquals("Output: 1, 2, NORTH", robotOne.report());

    }

    @Test
    public void testMoveNorthFromPositionTwo() {
        
        CommandActions instance = new CommandActions();
        
        instance.move(robotOne);

        assertEquals(3, robotOne.getPositionY());
    }
    
}
