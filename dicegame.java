// Basic cpu function for a dice game using random numbers to roll until it hits lucky #7
// Jackpot if 7 is rolled on the 1st try!

import java.util.*;

public class dicegame 
{
    public static void main(String[] args)
    {
        Random Craps = new Random();

        int d1 = 0;
        int d2 = 0;

        int sum = 0;
        int roll = 0;
    
            System.out.println("Die1  Die2  Sum");
        do
        {
            d1 = Craps.nextInt(6) + 1;
            d2 = Craps.nextInt(6) + 1;
                sum = d1 + d2;
            roll++;

            System.out.printf("%1d%7d%7d\n", d1, d2, sum);

        }
        while(sum != 7);
            System.out.println("WINNER NUMBER 7!");
            System.out.println("It took " + roll + " roll/s!");

                if(roll == 1)
                {
                    System.out.println("JACKPOT WINNER! You've rolled 7 on the first roll!");
                }
    }

    
}