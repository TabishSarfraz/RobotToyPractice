/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robot.robottoy;

import java.io.InputStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        
    }
    
    @Test
    public void testDataFileOne(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestOne.txt"));
        
        while(scanner.hasNextLine()){
            
            String userCommand = scanner.nextLine();
            
            commandParser.parseCommand(userCommand, robotOne);
            
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
            
            commandParser.parseCommand(userCommand, robotOne);
            
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
            
            commandParser.parseCommand(userCommand, robotOne);
            
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
            
            commandParser.parseCommand(userCommand, robotOne);
            
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
            
            commandParser.parseCommand(userCommand, robotOne);
            
        }
        
        scanner.close();

        assertEquals(1, robotOne.getPositionX());
        assertEquals(2, robotOne.getPositionY());
        assertEquals("NORTH", robotOne.getFaceDirection());
    }
    
    @Test
    public void testDataFileOneExist(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestOne.txt"));
        
    }
    
    @Test
    public void testDataFileTwoExist(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestTwo.txt"));
        
    }
    
    @Test
    public void testDataFileThreeExist(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestThree.txt"));
        
    }
    
    @Test
    public void testDataFileFourExist(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestFour.txt"));
        
    }
    
    @Test
    public void testDataFileFiveExist(){
        
        Scanner scanner = new Scanner(getClass().getClassLoader().getResourceAsStream("TestFive.txt"));
        
    }
    
}
