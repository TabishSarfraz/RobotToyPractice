package com.robot.robottoy;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class ConcreteCommandsTest {
    
    public ConcreteCommandsTest() {
    }
    
    private RobotToy robotOne;
    
    @Before
    public void setUp() {
        
        robotOne = new RobotToy(1,2,Directions.NORTH);
        
        robotOne.setOnTable(true);
        
    }

    @Test
    public void testRotateLeftOrRightWithRotateTowardsLeft() {

        Commands rotateTowards = Commands.LEFT;

        Command instance = new RotateCommand(robotOne, rotateTowards);
        
        instance.execute();
        
        assertEquals(Directions.WEST, robotOne.getFaceDirection());

    }

    @Test
    public void testPlace() {

        String[] userCommand = "PLACE 3,1,SOUTH".replaceAll(",", " ").split("\\s");
        
        RobotToy robotExpectedResult = new RobotToy(3,1,Directions.SOUTH);

        Command instance = new PlaceCommand(robotOne, userCommand);
        
        instance.execute();

        assertEquals(robotExpectedResult.getPositionX(), robotOne.getPositionX());
        assertEquals(robotExpectedResult.getPositionY(), robotOne.getPositionY());
        assertEquals(robotExpectedResult.getFaceDirection(), robotOne.getFaceDirection());
    }

    @Test
    public void testReport() {
        
        Command instance = new ReportCommand(robotOne);
        
        instance.execute();

        assertEquals("Output: 1, 2, NORTH", robotOne.report());

    }

    @Test
    public void testMoveNorthFromPositionTwo() {
        
        Command instance = new MoveCommand(robotOne);
        
        instance.execute();

        assertEquals(3, robotOne.getPositionY());
    }
    
    @Test
    public void testMoveCommandWithNullRobot(){
        
        robotOne = null;
        
        Command instance = new MoveCommand(robotOne);
        
        instance.execute();

        assertNull(robotOne);
        
    }
    
}
