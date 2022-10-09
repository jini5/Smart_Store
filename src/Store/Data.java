package Store;

import Customer_Data.Customer;

import java.util.Objects;

public class Data {

    private static int serialNo;
    private String cutomerName;
    private String customerID;
    private double usingTime;
    private int pay;

    //////////////////////////////////////////


    public static int getSerialNo() {
        return serialNo;
    }

    public static void setSerialNo(int serialNo) {
        Data.serialNo = serialNo;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Double getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(double usingTime) {
        this.usingTime = usingTime;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
    //////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return getPay() == data.getPay() && Objects.equals(getCutomerName(), data.getCutomerName()) && Objects.equals(getCustomerID(), data.getCustomerID()) && Objects.equals(getUsingTime(), data.getUsingTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCutomerName(), getCustomerID(), getUsingTime(), getPay());
    }

    @Override
    public String toString() {
        return "Data{" +
                "cutomerName='" + cutomerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", usingTime='" + usingTime + '\'' +
                ", pay=" + pay +
                '}';
    }
//////////////////////////////////////////


    public Data(String cutomerName, String customerID, double usingTime, int pay) {
        this.cutomerName = cutomerName;
        this.customerID = customerID;
        this.usingTime = usingTime;
        this.pay = pay;
        serialNo++;
    }

    //////////////////////////////////////////





    private static void data(){




    }



}
