package com.example.bank;

import android.util.Log;

public class Customer {
    private int mCid;
    private String mCustomerName;
    private String mAccountNumber;
    private String mLocation;
    private double mBalance;
    private static int IMAGE_NOT_THERE=-1;
    private int mResourceImg;
    private String mGender;

    public Customer(int mCid, String mCustomerName, String mAccountNumber, double mBalance,String gender) {
        this.mCid = mCid;
        this.mCustomerName = mCustomerName;
        this.mAccountNumber = mAccountNumber;
//        this.mLocation = mLocation;
        this.mBalance = mBalance;
        this.mGender=gender;
    }
    public Customer(String mCustomerName, String mAccountNumber, double mBalance,String gender) {
        //this.mCid = mCid;
        this.mCustomerName = mCustomerName;
        this.mAccountNumber = mAccountNumber;
//        this.mLocation = mLocation;
        this.mBalance = mBalance;
        this.mGender=gender;
       // mResourceImg=R.drawable.male;
//        Log.i("Constructor ="," demo = "+R.drawable.male);
//        if(mGender.equals("Male")){
//            Log.i("Constructor m="," demo = "+R.drawable.male);
//            mResourceImg=R.drawable.male;
//        }
//        else{
//            Log.i("Constructor f="," demo = "+R.drawable.female);
//            mResourceImg=R.drawable.female;
//        }
    }

    public int getmCid() {
        return mCid;
    }

    public void setmCid(int mCid) {
        this.mCid = mCid;
    }

    public String getmCustomerName() {
        return mCustomerName;
    }

    public void setmCustomerName(String mCustomerName) {
        this.mCustomerName = mCustomerName;
    }

    public String getmAccountNumber() {
        return mAccountNumber;
    }

    public void setmAccountNumber(String mAccountNumber) {
        this.mAccountNumber = mAccountNumber;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public double getmBalance() {
        return mBalance;
    }

    public void setmBalance(double mBalance) {
        this.mBalance = mBalance;
    }

    public int getmResourceImg() {
        return mResourceImg;
    }

    public void setmResourceImg(int mResourceImg) {
        this.mResourceImg = mResourceImg;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }
    public boolean hasImage(){
        return mResourceImg!=IMAGE_NOT_THERE;
    }
}

