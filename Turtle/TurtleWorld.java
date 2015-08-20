import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        turtle.penUp();
        turtle.turnLeft();
        turtle.forward(100);
        turtle.setPenColor(Color.BLUE);
        turtle.turnLeft();
        turtle.penDown();
        turtle.forward(50);
        turtle.penUp();
        turtle.turnRight();
        turtle.forward(100);
        turtle.turnRight();
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(50);
    }
}
