package Store;

import java.util.Objects;

public class Data {

    private String serialNo;
    private String cutomerName;
    private String customerID;
    private int usingTime;
    private int pay;

    private static int serialCnt = 0 ;

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

    public int getUsingTime() {
        return usingTime;
    }

    public void setUsingTime(int usingTime) {
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




    public Data(String cutomerName, String customerID, int usingTime, int pay) {
        serialCnt++;
        this.cutomerName = cutomerName;
        this.customerID = customerID;
        this.usingTime = usingTime;
        this.pay = pay;
        serialNo = String.format("%04d",serialCnt);

    }

    public String showCustomer(){
        String info = "serialNO:"+serialNo+", 고객 이름: "+cutomerName+", 고객 아이디: "+customerID+", 고객 사용 시간: "+usingTime+"시간, 고객 사용 총액: "
                +pay+"원 입니다.";
        return info;
    }

    //////////////////////////////////////////




}
