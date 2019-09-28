package com.robot.robottoy;

import java.io.InputStream;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Sarfraz
 */
public class TestData {
    
    public TestData() {
    
    }
    
    private CommandParser commandParser;
    private RobotToy robotOne;
    
    @Before
    public void setUp() {
        
        commandParser = new CommandParser();
        robotOne = new RobotToy();
        
        commandParser.robotOne = robotOne;
        
    }
    
    @Test
    public void testDataFileOne(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestOne.txt"));
        
        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand);
            
        }
        
        scanner.close();

        assertEquals(4, robotOne.getPositionX());
        assertEquals(3, robotOne.getPositionY());
        assertEquals("EAST", robotOne.getFaceDirection());
    }
    
    
    @Test
    public void testDataFileTwo(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestTwo.txt"));

        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand);
            
        }
        
        scanner.close();

        assertEquals(0, robotOne.getPositionX());
        assertEquals(1, robotOne.getPositionY());
        assertEquals("NORTH", robotOne.getFaceDirection());
    }

    @Test
    public void testDataFileThree(){

        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestThree.txt"));

        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand);
            
        }
        
        scanner.close();

        assertEquals(0, robotOne.getPositionX());
        assertEquals(0, robotOne.getPositionY());
        assertEquals("WEST", robotOne.getFaceDirection());
    }
    
    @Test
    public void testDataFileFour(){

        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestFour.txt"));

        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand);
            
        }
        
        scanner.close();

        assertEquals(3, robotOne.getPositionX());
        assertEquals(3, robotOne.getPositionY());
        assertEquals("NORTH", robotOne.getFaceDirection());
    }
    
    @Test
    public void testDataFileFive(){
        

        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestFive.txt"));

        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand);
            
        }
        
        scanner.close();

        assertEquals(1, robotOne.getPositionX());
        assertEquals(2, robotOne.getPositionY());
        assertEquals("NORTH", robotOne.getFaceDirection());
    }
    
    @Test
    public void testDataFileOneExist(){
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("TestOne.txt");
        
        assertNotNull(inputStream);
        
    }
    
    @Test
    public void testDataFileTwoExist(){
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("TestTwo.txt");
        
        assertNotNull(inputStream);
        
    }
    
    @Test
    public void testDataFileThreeExist(){
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("TestThree.txt");
        
        assertNotNull(inputStream);
        
    }
    
    @Test
    public void testDataFileFourExist(){
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("TestFour.txt");
        
        assertNotNull(inputStream);

    }
    
    @Test
    public void testDataFileFiveExist(){
        
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("TestFive.txt");
        
        assertNotNull(inputStream);
       
        
    }
    
}
