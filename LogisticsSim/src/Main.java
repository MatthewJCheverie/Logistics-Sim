import java.util.Scanner;

// Main
public class Main {
    // main() class
    public static void main(String[] args) {
        userTerminal();

    } // end main()class


    // Method to start program continuos loop til exit
    public static void userTerminal() {
        // using Scanner to get in put from user
        Scanner user = new Scanner(System.in);

        //Prompts user about inputs they can use
        System.out.println("Welcome to Logistics Sims");
        System.out.println("Are you a 1. Customer or 2. Employee");
        System.out.println("Please enter corresponding number to continue");
        int input = user.nextInt();

        switch (input) {
            case 1:
                customer();
                break;
            case 2:
                employee();
                break;
            default:
                userTerminal();
                break;
        }
    }

    public static void customer() {
        System.out.println("You are customer");
    }

    public static void employee() {
        System.out.println("You are employee");
    }
}
