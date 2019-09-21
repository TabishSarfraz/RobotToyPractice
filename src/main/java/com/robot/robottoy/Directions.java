/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tabish Sarfraz
 */
public class Directions {
    
    private Directions(){
                
    }
    
    public static final String EAST = "EAST";
    public static final String NORTH = "NORTH";
    public static final String WEST = "WEST";
    public static final String SOUTH = "SOUTH";
    
    public static final ArrayList<String> RIGHT_ROTATED_DIRECTIONS_FROM_EAST = new ArrayList<>(Arrays.asList(EAST, NORTH , WEST, SOUTH));
    
}
