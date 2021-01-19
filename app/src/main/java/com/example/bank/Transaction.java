package com.example.bank;

public class Transaction {
    private int mtId;
    private String mFrom;
    private String mTo;
    private  double mAmount;
    private String mStatus;
    private String mdate;

    public Transaction(int mtId, String mFrom, String mTo, double mAmount, String mStatus) {
        this.mtId = mtId;
        this.mFrom = mFrom;
        this.mTo = mTo;
        this.mAmount = mAmount;
        this.mStatus = mStatus;
    }
    public Transaction(int mtId, String mFrom, String mTo, double mAmount, String mStatus,String mdate) {
        this.mtId = mtId;
        this.mFrom = mFrom;
        this.mTo = mTo;
        this.mAmount = mAmount;
        this.mStatus = mStatus;
        this.mdate=mdate;
    }

    public int getMtId() {
        return mtId;
    }

    public void setMtId(int mtId) {
        this.mtId = mtId;
    }

    public String getmFrom() {
        return mFrom;
    }

    public void setmFrom(String mFrom) {
        this.mFrom = mFrom;
    }

    public String getmTo() {
        return mTo;
    }

    public void setmTo(String mTo) {
        this.mTo = mTo;
    }

    public double getmAmount() {
        return mAmount;
    }

    public void setmAmount(double mAmount) {
        this.mAmount = mAmount;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
}
