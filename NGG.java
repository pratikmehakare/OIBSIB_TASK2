//number guessing game java
//Pratik Mehakare
import java.util.Scanner;

public class NGG {

    public static void guessing() {

        Scanner s = new Scanner(System.in);
        int n = 1 + (int) (100
                * Math.random());
        int nth = 5;

        int i, g;

        System.out.println("A n is chosen"+ " between 1 to 100."+ "Guess the n"+ " within 5 trials.");

        for (i = 0; i < nth; i++) 
        {

            System.out.println(
                    "Guess the n:");

            g = s.nextInt();
            s.close();

            if (n == g)
            {
                System.out.println("Congrats!"+ " You guessed the number.");
                break;
            } 
            else if(n > g && i != nth- 1) 
            {
                System.out.println("The n is "+ "greater than " + g);
            } 
            else if(n < g && i != nth - 1)
            {
                System.out.println("The number is"+ " less than " + g);
            }
        }

        if (i == nth) 
        {
            System.out.println("You have exhausted"+ " K trials.");

            System.out.println("The number was " + n);
        }
      
    }

    public static void main(String arg[]) {
        guessing();
    }
}
