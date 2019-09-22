package com.robot.robottoy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class CommandsTest {
    
    public CommandsTest() {
    }
    
    @Test
    public void testMoveCommandHasCorrectValue() {

        assertEquals("MOVE", Commands.MOVE_COMMAND);
        
    }
    
    @Test
    public void testRotateLeftHasCorrectValue() {

        assertEquals("LEFT", Commands.ROTATE_LEFT_COMMAND);
        
    }
    
    @Test
    public void testRotateRightHasCorrectValue() {

        assertEquals("RIGHT", Commands.ROTATE_RIGHT_COMMAND);
        
    }
    
    @Test
    public void testPlaceCommandHasCorrectValue() {

        assertEquals("PLACE", Commands.PLACE_COMMAND);
        
    }
    
    @Test
    public void testExitCommandHasCorrectValue() {

        assertEquals("EXIT", Commands.EXIT_COMMAND);
        
    }
    
    @Test
    public void testCloseCommandHasCorrectValue() {

        assertEquals("CLOSE", Commands.CLOSE_COMMAND);
        
    }
    
    @Test
    public void testPlaceCommandPatternHasCorrectValue() {

        assertEquals("^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)", Commands.PLACE_COMMAND_PATTERN);
        
    }
    
}
