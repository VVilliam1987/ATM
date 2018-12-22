import java.util.Scanner;

public class ATM {

    int[] mValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int[] mAmount = {20, 35, 45, 60, 25, 75, 30, 15, 10};
    int mInput, mElem, mBanknote, mMoney;

    User user = new User("1987", 19303.87);


    public void logIn() {

        Scanner id = new Scanner(System.in);
        System.out.println("Please, enter your pin-code:");
        user.mUserPin = id.nextLine();

        if (user.mUserPin.equals(user.mUserPassword)) {

            startWork();
        } //if

        else {

            System.out.println("Incorrect login. Please, try once more");
                        logIn(); //процедура починається заново

        } //else

    } //logIn

    public void startWork(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please, enter the sum of money, you want to withdraw:");
        mInput = scan.nextInt();
        System.out.println("You want to withdraw " + mInput + " dollars.");
        takeMoney();

    } //startWork

    public void takeMoney(){

        mBanknote = 0;

        if (mInput < user.BALANCE) {

            for (int e = 0; e < mValue.length; ++e) {

                mElem = mValue[e]; //номінал купюри з масиву
                mBanknote = mInput / mElem; //кількість виданих купюр певного номіналу
                if (mInput > 0 && mBanknote > 0) System.out.println(mElem + ": " + mBanknote + "."); //if
                mMoney += mBanknote;
                mInput %= mElem; //залишок після видачі

            } //for

            System.out.println("Total amount of banknotes: " + mMoney + ".");

        } //if

        else {

            System.out.println("Unfortunately, you do not have this sum of money to withdraw it. Please, try once more.");
            startWork();

        } //else

    } //takeMoney

}