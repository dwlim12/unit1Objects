import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World myWorld = new World();
        Turtle squirtle = new Turtle(myWorld);
        squirtle.setPenColor(Color.RED);
        squirtle.penDown();
        squirtle.forward(2000);
        Turtle skittles = new Turtle(myWorld);
        squirtle.turnRight();
        
    }
}