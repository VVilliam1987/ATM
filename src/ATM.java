import java.util.Scanner;

public class ATM {

    private int[] mValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    final int[] AMOUNT = {20, 25, 20, 25, 30, 35, 35, 25, 10};
    private int mInput, mElement, mBanknote, mMoney, mAmountElement, mNumber;

    User user = new User("1987", 19303.87);

    public void logIn() {

        boolean repeat = true;
        do {

            Scanner id = new Scanner(System.in);
            System.out.println("Please, enter your pin-code:");
            user.mUserPin = id.nextLine();

            if (user.mUserPin.equals(user.getmUserPassword())) {

                repeat = false;
                System.out.println("Welcome!");
                startWork();

            } //if

            else {

                System.out.println("Incorrect login. Please, try once more.");

            } //else

        } while (repeat); //do

    } //logIn

    public void startWork() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the sum of money, you want to withdraw:");
        mInput = scan.nextInt();
        System.out.println("You want to withdraw " + mInput + " dollars.");
        takeMoney();

    } //startWork

    public void takeMoney() {

        mBanknote = 0;

        if (mInput < user.BALANCE) {

            for (int e = 0; e < mValue.length; ++e) {

                mElement = mValue[e];
                mAmountElement = AMOUNT[e];

                mBanknote = mInput / mElement;
                mNumber = mAmountElement - mBanknote;

                if (mInput > 0 && mBanknote > 0) {

                    System.out.println(mElement + " given: " + mBanknote + ".");
                    System.out.println(mElement + " left: " + mNumber + ".");

                } //if

                mMoney += mBanknote;
                mInput %= mElement;

            } //for

            System.out.println("Total amount of banknotes: " + mMoney + ".");

        } //if

        else {

            System.out.println("Unfortunately, you do not have this sum of money to withdraw it. Please, try once more.");
            startWork();

        } //else

    } //takeMoney

}