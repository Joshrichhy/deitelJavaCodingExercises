package Turtle;

import static Turtle.Direction.*;
import static Turtle.Direction.SOUTH;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    private Position position = new Position(0,0);
    private final int LASTINDEX = 19;
    private final int FIRSTINDEX = 0;
    public boolean penIsUp() {
        return penIsUp;
    }

    public void penIsDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if(direction == EAST) face(SOUTH);
       else if(direction == SOUTH) face(WEST);
        else if(direction == WEST) face(NORTH);
        else if(direction == NORTH) face(EAST);
    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if(direction == EAST) face(NORTH);
        else if(direction == NORTH) face(WEST);
        else if(direction == WEST) face(SOUTH);
        else if(direction == SOUTH) face(EAST);
    }

    public void moveForward(int numberOfMoves) {
        if(direction == EAST) increaseColumnBy(numberOfMoves);
        else if (direction == SOUTH) increaseRowBy(numberOfMoves);
        else if (direction == WEST) decreaseColumnBy(numberOfMoves);
        else if (direction == NORTH) decreaseRowBy(numberOfMoves);

    }

    private void decreaseRowBy(int numberOfMoves) {
        if(position.getRow()-numberOfMoves < FIRSTINDEX) position.setRow(FIRSTINDEX);
        else position.setRow(position.getRow() - numberOfMoves);
    }

    private void decreaseColumnBy(int numberOfMoves) {
        if(position.getColumn() - numberOfMoves < FIRSTINDEX) position.setColumn(FIRSTINDEX);
       else position.setColumn(position.getColumn() - numberOfMoves);}

    private void increaseRowBy(int numberOfMoves) {
        if(position.getRow()+numberOfMoves > LASTINDEX) position.setRow(LASTINDEX);
        else position.setRow(position.getRow()+numberOfMoves);
    }

    private void increaseColumnBy(int numberOfMoves) {
        if(position.getColumn()+numberOfMoves > LASTINDEX) position.setColumn(LASTINDEX);
        else position.setColumn(position.getColumn()+numberOfMoves);
    }

    public Position getPosition() {return position;}
}
