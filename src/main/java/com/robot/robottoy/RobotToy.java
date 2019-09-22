package com.robot.robottoy;

/**
 *
 * @author Tabish
 */
public class RobotToy {
    
    public RobotToy(){
    
    }
    
    public RobotToy(int positionX, int positionY, String faceDirection){
        
        this.positionX = positionX;
        this.positionY = positionY;
        this.faceDirection = faceDirection;
        
    }
    
    private int positionX;
    private int positionY;
    private String faceDirection;
    private boolean onTable; 

    public int getPositionX() {
        
        return positionX;
        
    }

    public void setPositionX(int positionX) {
        
        this.positionX = positionX;
        
    }

    public int getPositionY() {
        
        return positionY;
        
    }

    public void setPositionY(int positionY) {
        
        this.positionY = positionY;
        
    }

    public String getFaceDirection() {
        
        return faceDirection;
        
    }

    public void setFaceDirection(String faceDirection) {
        
        this.faceDirection = faceDirection;
        
    }

    public boolean isOnTable() {
        
        return onTable;
        
    }

    public void setOnTable(boolean onTable) {
        
        this.onTable = onTable;
        
    }

    @Override
    public String toString() {
        
        return "RobotToy{" + "positionX=" + positionX + ", positionY=" + positionY + ", faceDirection=" + faceDirection + ", onTable=" + onTable + '}';
        
    }
    
    public String report(){
        
        return "Output: " + positionX + ", " + positionY + ", " + faceDirection ;
        
    }
    
    public void incrementPositionY(){
        
        this.positionY++ ;
        
    }
    
    public void decreasePositionY(){
            
        this.positionY-- ;
        
    }
    
    public void incrementPositionX(){
        
        this.positionX++ ;
        
    }
    
    public void decreasePositionX(){
            
        this.positionX-- ;
        
    }
    
}
