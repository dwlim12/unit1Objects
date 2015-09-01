import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random die = new Random();
        for(int i=0; i<10; i++){
            int randomInt = die.nextInt(6);
            int randomDie = randomInt + 1;
            System.out.println(randomDie);
        }
    }
}