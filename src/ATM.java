public class ATM {

    int[] mValue = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int mInput, mElem, mBanknote;

    public void takeMoney(){

        mBanknote = 0;

        for ( int e = 0; e < 9; ++e) {

            mElem = mValue[e]; // номінал купюри
            mBanknote += mInput / mElem; //видано кількість купюр певного номіналу
            mInput %= mElem; //залишок після видачі певним номіналом

        } //for

        if(mInput > 0) mBanknote = -1;
        System.out.format("Total amount of banknotes: " + "%d", mBanknote);

    } //takeMoney
} //ATM
