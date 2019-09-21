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

        assertEquals("EAST", Directions.EAST);
        
    }
    
    @Test
    public void testWestDirectionHasCorrectValue() {

        assertEquals("WEST", Directions.WEST);
        
    }
    
    @Test
    public void testNorthDirectionHasCorrectValue() {

        assertEquals("NORTH", Directions.NORTH);
        
    }
    
    @Test
    public void testSouthDirectionHasCorrectValue() {

        assertEquals("SOUTH", Directions.SOUTH);
        
    }
    
    @Test
    public void testRightRotatedDirectionsListStartingFromEast() {

         ArrayList<String> expectedRightRotatedListStartsFromEast = new ArrayList<>(Arrays.asList( EAST, SOUTH, WEST, NORTH ));
         
         assertEquals(expectedRightRotatedListStartsFromEast, Directions.RIGHT_ROTATED_DIRECTIONS_FROM_EAST);
        
    }
    
}
