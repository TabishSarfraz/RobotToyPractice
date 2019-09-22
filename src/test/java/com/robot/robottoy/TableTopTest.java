package com.robot.robottoy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class TableTopTest {
    
    public TableTopTest() {
    }
    
    @Test
    public void testTableSizeX() {
        
        assertEquals(5, TableTop.TABLE_SIZE_X);
        
    }
    
    @Test
    public void testTableSizeY() {
        
        assertEquals(5, TableTop.TABLE_SIZE_Y);
        
    }
    
    @Test
    public void testTableMaxLengthX() {
        
        assertEquals(4, TableTop.TABLE_MAX_LENGTH_X);
        
    }
    
    @Test
    public void testTableMaxLengthY() {
        
        assertEquals(4, TableTop.TABLE_MAX_LENGTH_Y);
        
    }
    
}
