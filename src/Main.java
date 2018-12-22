import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    ATM atmMachine = new ATM();
    User user = new User("1987", 19303.87);
    Scanner id = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your pin-code:");
        user.mPin = id.nextLine();
        System.out.println("Welcome!");
        System.out.println("Please, enter the sum of money, you want to withdraw:");
        atmMachine.mInput = scan.nextInt();
        System.out.println("You want to withdraw " + atmMachine.mInput + " dollars.");

    atmMachine.takeMoney();

    }
}
