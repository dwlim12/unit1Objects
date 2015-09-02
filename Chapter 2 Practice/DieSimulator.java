import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        // Option A
        Random die = new Random();
        for(int i=0; i<10; i++){
            int randomInt = die.nextInt(6);
            int randomDie = randomInt + 1;
            System.out.println(randomDie);
        }
        // Option B
        double dieValue = Math.random();
        dieValue *= 6;
        dieValue += 1;
        
        System.out.println( (int) dieValue);
    }
}