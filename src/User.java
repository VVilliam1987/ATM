public class User {

    String mPassword, mPin;
    final double BALANCE;

    public User(String pinCode, double money) {

        mPassword = pinCode;
        BALANCE = money;
    }

}
