import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    ATM atmMachine = new ATM();

    System.out.println("Please, enter the sum of money, you want to withdraw:");

    Scanner scan = new Scanner(System.in);
    atmMachine.mInput = scan.nextInt();
    System.out.println("You want to withdraw " + atmMachine.mInput + " dollars.");

    atmMachine.takeMoney();
    }
}
