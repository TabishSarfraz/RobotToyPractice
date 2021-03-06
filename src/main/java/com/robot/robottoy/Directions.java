package com.robot.robottoy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tabish Sarfraz
 */
public enum Directions{
    
    EAST(0),
    SOUTH(1),
    WEST(2),
    NORTH(3);
    
    private Integer directionIndex;
    
    private static final Map<Integer, Directions> RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP = new HashMap<>();
    private static final Map<String, Directions> RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP_BY_NAME = new HashMap<>();
    
    private Directions(Integer directionIndex){
    
        this.directionIndex = directionIndex;
        
    }
    
    public Integer getDirectionIndex(){
        
        return directionIndex;
        
    }
    
    static{
        
        for(Directions directionItem: Directions.values()){
            
            RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP.put(directionItem.getDirectionIndex(), directionItem);
            RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP_BY_NAME.put(directionItem.toString(), directionItem);
            
        }
        
    }
    
    public static Directions getValueByIndex(Integer directionIndex){
        
        return RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP.get(directionIndex);
        
    }
    
    public static Directions getValueByName(String directionName){
        
        return RIGHT_ROTATED_DIRECTIONS_FROM_EAST_MAP_BY_NAME.get(directionName);
        
    }
    
}

