public class User {

    String mUserPassword, mUserPin;
    final double BALANCE;

    public User(String pinCode, double balance) {

        mUserPassword = pinCode;
        BALANCE = balance;
    }
}
