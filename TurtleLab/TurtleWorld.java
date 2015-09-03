import java.awt.Color;

public class TurtleWorld
{
    public static void main(String[] args)
    {
        World myWorld = new World();
        Turtle squirtle = new Turtle(0,0,myWorld);
        Turtle skittles = new Turtle(750,750,myWorld);
        for (int i=0; i<96; i++){
        Color pencolor = Color.RED;
        int colornumber = i*6;
        if (colornumber == 6){ pencolor = Color.RED;}
        if (colornumber == 12){ pencolor = Color.BLUE;}
        if (colornumber == 18){ pencolor = Color.GREEN;}
        if (colornumber == 24){ pencolor = Color.YELLOW;}
        if (colornumber == 30){ pencolor = Color.ORANGE;}
        if (colornumber == 36){ pencolor = Color.PINK;}
        if (colornumber == 42){ pencolor = Color.MAGENTA;}
        if (colornumber == 48){ pencolor = Color.CYAN;}
        squirtle.turnRight();
        squirtle.setPenWidth(3);
        squirtle.setPenColor(pencolor);
        squirtle.penDown();
        squirtle.forward(750);
        squirtle.turnRight();
        squirtle.forward(750);
        squirtle.turnRight();
        squirtle.forward(315);
        squirtle.turnRight();
        squirtle.penUp();
        squirtle.forward((i*5)+5);
        squirtle.turnLeft();
        squirtle.turnLeft();
        skittles.turnLeft();
        skittles.setPenWidth(3);
        skittles.setPenColor(pencolor);
        skittles.penDown();
        skittles.forward(750);
        skittles.turnRight();
        skittles.forward(750);
        skittles.turnRight();
        skittles.forward(325);
        skittles.turnRight();
        skittles.penUp();
        skittles.forward((i*5)+5);
    }
    }
}