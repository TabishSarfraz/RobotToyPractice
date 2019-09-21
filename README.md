# RobotToyPractice
> RobotToyPractice is a java project created to give commands to a robot toy on a square table top.

## Table of contents
* [Introduction](#introduction)
* [Setup](#Setup)
* [Build](#Build)
* [Run](#Run)
* [Tests](#Tests)
* [Command inputs to robot](#Command-inputs-to-robot)

## Introduction
### Description: 
The application is a simulation of a toy robot moving on a square tabletop, of dimensions 5 units x 5 units. There are no other obstructions on the table surface. 
The robot is free to roam around the surface of the table, but must be prevented from falling to destruction.  Any movement that would result in the robot falling from the table must be prevented, however further valid movement commands must still be allowed. 

Create an application that can read in commands of the following form:     
- PLACE X,Y,F     
- MOVE     
- LEFT     
- RIGHT     
- REPORT 

Where PLACE will put the toy robot on the table in position X,Y and facing NORTH, SOUTH, EAST or WEST.  The origin (0,0) can be considered to be the SOUTH WEST most corner. 

It is required that the first command to the robot is a PLACE command, after that, any sequence of commands may be issued, in any order, including another PLACE command.
The application should discard all commands in the sequence until a valid PLACE command has been executed. 

Where MOVE will move the toy robot one unit forward in the direction it is currently facing. 

Where LEFT and RIGHT will rotate the robot 90 degrees in the specified direction without changing the position of the robot. 

Where REPORT will announce the X,Y and F of the robot.  This can be in any form, but standard output is sufficient. 

A robot that is not on the table can choose to ignore the MOVE, LEFT, RIGHT and REPORT commands. 
It is not required to provide any graphical output showing the movement of the toy robot. 
 
### Constraints: 
The toy robot must not fall off the table during movement.  This also includes the initial placement of the toy robot.  Any move that would cause the robot to fall must be ignored. 



## Setup
### Prerequisite
The application has been built using the following technologies:
- Java 8 (JDK 1.8)
- Maven 3.0.5

To download JDK 1.8 please vist
```sh
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
```

If you do not have maven please download it from
```sh 
https://maven.apache.org/download.cgi
```

## Build
To build the project, please navigate to the project root directory in command line and run the following command
```sh 
mvn clean install
```
`put-your-code-here`

## Run
The project can be run using .jar file or using maven command

### Running with .jar file
A .jar file is created under the 'target' folder inside the project root directory.

Use this command if your in the project root directory
```sh
java -jar target\RobotToy-1.0-SNAPSHOT.jar
```
Otherwise, navigate to the 'target' folder inside the project root directory and run
```sh
java -jar RobotToy-1.0-SNAPSHOT.jar
```

### Running using maven command
To run the project using maven command, go to the project root directory and run
```sh
mvn exec:java
```

## Tests
To run only the tests associated with the project using maven, please use the following command in the project root directory
```sh
mvn test
```
To run a specific test class use the following command:
```sh
mvn -Dtest=TESTCLASSNAME.java test
```
For example 
```sh
mvn -Dtest=TestData.java test
```
To run a specific method inside a test class use the following: 
```sh
mvn -Dtest=TESTCLASSNAME.java#METHOD test
```
For example 
```sh
mvn -Dtest=TestData.java#testDataFileOne test
```

#### Test Data
Test data files have been included in the project and are located under src/test/resources directory in .txt file extension.

## Command inputs to robot
The commands are given to the robot using the standard input from the screen.

All commands are `upper case` and `case sensitive`. Any other input will be ignored.

As soon as the application is started a message is provided on the terminal/screen that the user can enter one command per line.

### Commands
- PLACE X,Y,Direction
- MOVE
- LEFT
- RIGHT
- REPORT
- EXIT
- CLOSE
    
#### PLACE Command
The PLACE command requires an X coordinate, Y coordinate and the direction robot should be facing towards.

`Note`: There are no spaces between the commas in between X,Y,Direction.

##### X / Y Values
As the square dimensions are 5 X 5, the values for X and Y can be anything from `0` to `4` 

##### Example 

```sh
PLACE 2,3,NORTH
```

#### MOVE Command
The MOVE command will move the robot in the direction it is facing.

If the direction is SOUTH, the robot will move down towards south. 
If the direction is NORTH, the robot will move up towards north.
If the direction is WEST, the robot will move left towards west.
If the direction is EAST, the robot will move right towards east.

##### Example
```sh
MOVE
```

#### LEFT Command
This will rotate the robot 90 degrees towards left direction.

##### Example 
If robot is currently at NORTH position running the command
```sh
LEFT
```
will move the robot to face WEST direction.
#### RIGHT Command
This will rotate the robot 90 degrees towards right direction.

##### Example 
If robot is currently at NORTH position running the command
```sh
RIGHT
```
will move the robot to face EAST direction.

#### REPORT Command

The REPORT command will display the display the X,Y and Direction of the robot.

##### Example
```sh
REPORT
```
Result on screen will be the following:

```sh
OUTPUT: 2, 3, NORTH
```

#### EXIT / CLOSE Command
The EXIT and CLOSE command are used to stop the user from inputting any further values and close the application

##### Example
```sh
EXIT
```
OR 
```sh
CLOSE
```

