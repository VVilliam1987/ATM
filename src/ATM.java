public class ATM {

    int[] mValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int mInput, mElem, mBanknote, mMoney;

    public void takeMoney(){

        mBanknote = 0;

        for (int e = 0; e < mValue.length; ++e) {

            mElem = mValue[e]; //номінал купюри з масиву
            mBanknote = mInput / mElem; //кількість виданих купюр певного номіналу
            if (mInput > 0 && mBanknote > 0) System.out.println(mElem + ": " + mBanknote);
            mMoney += mBanknote;
            mInput %= mElem; //залишок після видачі

        } //for

        System.out.format("Total amount of banknotes: " + "%d", mMoney);

    } //takeMoney
} //ATM
