public class User {

    private String mUserPassword;
    String mUserPin;
    final double BALANCE;

    public User(String pinCode, double balance) {

        mUserPassword = pinCode;
        BALANCE = balance;
    }

    public String getmUserPassword() {
        return mUserPassword;
    }

    public void setmUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

}
