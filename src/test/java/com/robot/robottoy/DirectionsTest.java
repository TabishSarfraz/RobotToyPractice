package com.robot.robottoy;

import static com.robot.robottoy.Directions.EAST;
import static com.robot.robottoy.Directions.NORTH;
import static com.robot.robottoy.Directions.SOUTH;
import static com.robot.robottoy.Directions.WEST;
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
    public void testRightRotatedDirectionsListStartingFromEast() {

        assertEquals(EAST, Directions.getValueByIndex(0));
        assertEquals(SOUTH, Directions.getValueByIndex(1));
        assertEquals(WEST, Directions.getValueByIndex(2));
        assertEquals(NORTH, Directions.getValueByIndex(3));
        
    }
    
}
