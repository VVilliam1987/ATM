import java.util.Scanner;

public class ATM {

    int[] mValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int[] mAmount = {40, 55, 65, 80, 95, 115, 70, 45, 10};
    int mInput, mElem, mBanknote, mMoney;
    String mUserPassword, mUserPin;
    final double BALANCE;

    public ATM(String pinCode, double balance) {

        mUserPassword = pinCode;
        BALANCE = balance;
    }

    public void start() {

        Scanner id = new Scanner(System.in);
        System.out.println("Please, enter your pin-code:");
        mUserPin = id.nextLine();

        if (mUserPin.equals(mUserPassword)) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome!");
            System.out.println("Please, enter the sum of money, you want to withdraw:");
            mInput = scan.nextInt();
            System.out.println("You want to withdraw " + mInput + " dollars.");

            takeMoney();
        } //if

        else {
            System.out.println("Incorrect login. Please, try once more");
            start(); //процедура починається заново
        } //else
    }

    public void takeMoney(){

        mBanknote = 0;

        if (mInput < BALANCE) {

            for (int e = 0; e < mValue.length; ++e) {

                mElem = mValue[e]; //номінал купюри з масиву
                mBanknote = mInput / mElem; //кількість виданих купюр певного номіналу
                if (mInput > 0 && mBanknote > 0) System.out.println(mElem + ": " + mBanknote); //if
                mMoney += mBanknote;
                mInput %= mElem; //залишок після видачі

            } //for

            System.out.println("Total amount of banknotes: " + mMoney);

        } //if

        else {
            System.out.println("Unfortunately, you do not have this sum of money to withdraw it. Please, try once more.");
            takeMoney(); //процедура починається заново
        } //else

    } //takeMoney

}

