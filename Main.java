//NUMBER GUESSING GAME
import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList<Integer> hs = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to Number Guessing Game");
        play();
    }

    private static void play()
    {
        while(true)
        {

            System.out.println("Choose Game Mode");
            System.out.print("1. Easy\n2. Medium\n3. Hard\n4. Exit\n");
            System.out.print("Enter Game Mode : ");
            int mode = scan.nextInt();
            if(mode==4)
            {
                System.exit(0);
            }
            int attempts = game_mode(mode);
            chooselevel(attempts, mode);
        }
    }
    private static void chooselevel(int attempts, int mode)
    {
        if(attempts == 10)
        {
            System.out.println("You Choose Easy Level, You have 10 Attempts");
            game(attempts);
        }
        else if(attempts == 5)
        {
            System.out.println("You Choose Medium Level, You have 5 Attempts");
            game(attempts);
        }
        else if(attempts == 3)
        {
            System.out.println("You Choose Hard Level, You have 3 Attempts");
            game(attempts);
        }
        else{
            System.out.println("You chose an invalid mode. Please select a valid game mode.");
            return;
        }
    }


    private static int game_mode(int mode)
    {
        if(mode == 1) {
            return 10;
        }
        else if(mode == 2 ) {
            return 5;
        }
        else if(mode == 3) {
            return 3;
        }
        return 0;
    }

    private static void game(int attempts)
    {

        int rounds;
        int computer_choice = r.nextInt(100) + 1;
        for(rounds = 1; rounds <= attempts ;rounds++)
        {
            System.out.print("Enter your guessed number between 1 to 100 : ");
            int user_choice = scan.nextInt();
            while(user_choice>100 || user_choice<=0)
            {
                System.out.print("Please, enter number between 1 to 100 :");
                user_choice = scan.nextInt();
            }
            if(computer_choice == user_choice)
            {
                System.out.println("Hey\uD83E\uDD73 ,you guessed the number in attempt "+ rounds);
                System.out.println("your score is : "+ points(attempts, rounds));
                hs.add(points(attempts, rounds));
                break;
            }
            else if((computer_choice < user_choice))
            {
                System.out.println("it's too High");
            }
            else{
                System.out.println("it's too Low");
            }
            if(rounds == attempts)
            {
                System.out.println("You finished your all attempts");
            }
        }
        wanttoplay();
    }

    private static void wanttoplay()
    {
        System.out.println("You want to continue");
        System.out.println("1. Yes\n2. No");
        System.out.print("Enter your Choice : ");
        byte option = scan.nextByte();
        while(true){
            if (option == 1)
                play();
            else if (option == 2) {
                System.out.println("Thank you for participating, Your high score is " + highscore(hs));
                System.exit(0);
            } else {
                System.out.print("Please Enter valid choice : ");
                option = scan.nextByte();
            }
        }

    }



    private static int highscore(ArrayList<Integer> hs)
    {
        int max = 0;
        for(int h : hs)
        {
            if(h>max)
                max = h;
        }
        return max;
    }



    private static int points(int attempts, int rounds)
    {
        if(attempts == 10)
        {
            switch (rounds)
            {
                case 1:
                    return 100;
                case 2:
                    return 90;
                case 3:
                    return 80;
                case 4:
                    return 70;
                case 5:
                    return 60;
                case 6:
                    return 50;
                case 7:
                    return 40;
                case 8:
                    return 30;
                case 9:
                    return 20;
                case 10:
                    return 10;
            }
        }

        if(attempts == 5)
        {
            switch (rounds)
            {
                case 1:
                    return 100;
                case 2:
                    return 80;
                case 3:
                    return 60;
                case 4:
                    return 40;
                case 5:
                    return 20;
            }
        }
        if(attempts == 3)
        {
            switch (rounds)
            {
                case 1:
                    return 100;
                case 2:
                    return 50;
                case 3:
                    return 10;
            }
        }
        return 0;
        }
    }

