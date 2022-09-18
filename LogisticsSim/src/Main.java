import java.util.Scanner;

// Main
public class Main {
    // main() class
    public static void main(String[] args) {

        // using Scanner to get in put from user
        Scanner user = new Scanner(System.in);

        //Prompts user about inputs they can use
        System.out.println("Welcome to Logistics Sims");
        System.out.println("Are you a 1. Customer or 2. Employee");
        System.out.println("Please enter corresponding number to continue");

        // Creates String variable for input
        int input = user.nextInt();

        // Switch for input Customer || Employee
        switch (input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Not option");
                break;
        }
//        System.out.println("U Chose " + input);

        /*
         * Switch Statement prompting User("Customer") or Admin("Employee") of function
         * they like to use including run simulation
         */


    } // end main()class
}
