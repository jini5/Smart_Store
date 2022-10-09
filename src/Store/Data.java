package Store;

import Customer_Data.Customer;

import java.util.Objects;

public class Data {

    private String serialNo;
    private String cutomerName;
    private String customerID;
    private String usingTime;
    private int pay;

    //////////////////////////////////////////
    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
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

    public String getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(String usingTime) {
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
        return getPay() == data.getPay() && Objects.equals(getSerialNo(), data.getSerialNo()) && Objects.equals(getCutomerName(), data.getCutomerName()) && Objects.equals(getCustomerID(), data.getCustomerID()) && Objects.equals(getUsingTime(), data.getUsingTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerialNo(), getCutomerName(), getCustomerID(), getUsingTime(), getPay());
    }
    //////////////////////////////////////////


    @Override
    public String toString() {
        return "Data{" +
                "serialNo='" + serialNo + '\'' +
                ", cutomerName='" + cutomerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", usingTime='" + usingTime + '\'' +
                ", pay=" + pay +
                '}';
    }
    //////////////////////////////////////////


    public Data(String serialNo, String cutomerName, String customerID, String usingTime, int pay) {
        this.serialNo = serialNo;
        this.cutomerName = cutomerName;
        this.customerID = customerID;
        this.usingTime = usingTime;
        this.pay = pay;
    }
    //////////////////////////////////////////



    private static void data(){




    }



}
