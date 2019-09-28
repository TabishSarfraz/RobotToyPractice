package com.robot.robottoy;

import static com.robot.robottoy.Directions.EAST;
import static com.robot.robottoy.Directions.NORTH;
import static com.robot.robottoy.Directions.SOUTH;
import static com.robot.robottoy.Directions.WEST;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class DirectionsTest {
    
    public DirectionsTest() {
    }

    @Test
    public void testEastDirectionHasCorrectValue() {

        assertEquals("EAST", Directions.EAST.toString());
        
    }
    
    @Test
    public void testWestDirectionHasCorrectValue() {

        assertEquals("WEST", Directions.WEST.toString());
        
    }
    
    @Test
    public void testNorthDirectionHasCorrectValue() {

        assertEquals("NORTH", Directions.NORTH.toString());
        
    }
    
    @Test
    public void testSouthDirectionHasCorrectValue() {

        assertEquals("SOUTH", Directions.SOUTH.toString());
        
    }
    
    @Test
    public void testRightRotatedDirectionsListStartingFromEast() {

         ArrayList<String> expectedRightRotatedListStartsFromEast = new ArrayList<>(Arrays.asList( EAST.toString(), SOUTH.toString(), WEST.toString(), NORTH.toString() ));
         
        assertEquals(expectedRightRotatedListStartsFromEast.get(0), Directions.getValueByIndex(0));
        assertEquals(expectedRightRotatedListStartsFromEast.get(1), Directions.getValueByIndex(1));
        assertEquals(expectedRightRotatedListStartsFromEast.get(2), Directions.getValueByIndex(2));
        assertEquals(expectedRightRotatedListStartsFromEast.get(3), Directions.getValueByIndex(3));
        
    }
    
}
