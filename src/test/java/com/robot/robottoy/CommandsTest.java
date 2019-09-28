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

        assertEquals("MOVE", Commands.MOVE.getCommandValue());
        
    }
    
    @Test
    public void testRotateLeftHasCorrectValue() {

        assertEquals("LEFT", Commands.LEFT.getCommandValue());
        
    }
    
    @Test
    public void testRotateRightHasCorrectValue() {

        assertEquals("RIGHT", Commands.RIGHT.getCommandValue());
        
    }
    
    @Test
    public void testPlaceCommandHasCorrectValue() {

        assertEquals("PLACE", Commands.PLACE.getCommandValue());
        
    }
    
    @Test
    public void testExitCommandHasCorrectValue() {

        assertEquals("EXIT", Commands.EXIT.getCommandValue());
        
    }
    
    @Test
    public void testCloseCommandHasCorrectValue() {

        assertEquals("CLOSE", Commands.CLOSE.getCommandValue());
        
    }
    
    @Test
    public void testPlaceCommandPatternHasCorrectValue() {

        assertEquals("^PLACE\\s\\d,\\d,(NORTH|SOUTH|EAST|WEST)", Commands.PLACE_COMMAND_PATTERN.getCommandValue());
        
    }
    
}
