package tdd.Turtle;

import Turtle.Turtle;
import  Turtle.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Turtle.Direction.*;

public class TurtleTest {
    Turtle turtle;

    @BeforeEach
    void setUp(){
        turtle = new Turtle();
    }

    @Test
    public void turtleCanMovePenDownTest(){
        assertTrue(turtle.penIsUp());
        turtle.penIsDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void turtleCanMovePenUpTest(){
        turtle.penIsDown();
         assertFalse(turtle.penIsUp());
         turtle.penUp();
         assertTrue(turtle.penIsUp());
    }

    @Test
    public void turtleCanTurnRightWhileFacingEastTest(){

        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRightWhileFacingSouthTest(){
    turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightWhileFacingWestTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightWhileFacingNorthTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingNorthTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingWestTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLefttWhileFacingSouthTest() {
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getPosition());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingSouthTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(5);
        assertEquals(new Position(5,0), turtle.getPosition());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingWestTest(){
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(10);
        assertEquals(new Position(0,10), turtle.getPosition());
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), WEST);
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getPosition());

    }

    @Test
    public void turtleCanMoveForwardWhileFacingNorthTest(){
        turtle.turnRight();
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(6);
        assertEquals(new Position(6,0), turtle.getPosition());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), NORTH);
        turtle.moveForward(5);
        assertEquals(new Position(1,0), turtle.getPosition());

    }

    @Test
    public void putTurtleAtTheLastPositionWhenturtleMoveForwardOutsideTheBoardWhileFacingEastTest(){
        assertSame(turtle.getCurrentDirection(), EAST);
        turtle.moveForward(20);
        assertEquals(new Position(0,19), turtle.getPosition());
    }

    @Test
    public void putTurtleAtTheFirstPositionWhenturtleMoveForwardOutsideTheBoardWhileFacingSouthTest(){
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.moveForward(22);
        assertEquals(new Position(19,0), turtle.getPosition());

    }

    @Test
    public void putTurtleAtTheFirstPositionWhenturtleMoveForwardOutsideTheBoardWhileFacingWestTest(){
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(10);
        assertEquals(new Position(0,10), turtle.getPosition());
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), SOUTH);
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), WEST);
        turtle.moveForward(11);
        assertEquals(new Position(0,0), turtle.getPosition());
    }

    @Test
    public void putTurtleAtTheFirstPositionWhenturtleMoveForwardOutsideTheBoardWhileFacingNorthTest(){
        turtle.turnRight();
        assertEquals( new Position(0, 0),  turtle.getPosition());
        turtle.moveForward(6);
        assertEquals(new Position(6,0), turtle.getPosition());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(turtle.getCurrentDirection(), NORTH);
        turtle.moveForward(7);
        assertEquals(new Position(0,0), turtle.getPosition());

    }



    }
