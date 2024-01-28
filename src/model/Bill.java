package model;

import java.util.Date;

public class Bill extends IdentifiedObject{
    private Date billDate;
    private double amount;
    private String client;
    private String billNum;
    public Bill(int id, String billNum,String client, Date billDate, double amount){
        this.amount = amount;
        this.billDate = billDate;
        this.id =id;
        this.billNum = billNum;
        this.client = client;

    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }
    
    public Date getBillDate() {
        return billDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }
}
