package Store;

import Classification_Parameter.Group;

import java.util.Objects;

public class Customer {

    private String serialNo;
    private String cutomerName;
    private String customerID;
    private int usingTime;
    private int totalpay;

    private Group group;

    private static int serialCnt = 0 ;

    public Customer(String serialNo, String cutomerName, String customerID, int usingTime, int totalpay) {
    }


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

    public int getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(int pay) {
        this.totalpay = pay;
    }
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    //////////////////////////////////////////

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getTotalpay() == customer.getTotalpay() && Objects.equals(getCutomerName(), customer.getCutomerName()) && Objects.equals(getCustomerID(), customer.getCustomerID()) && Objects.equals(getUsingTime(), customer.getUsingTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCutomerName(), getCustomerID(), getUsingTime(), getTotalpay());
    }

    @Override
    public String toString() {
        return "Data{" +
                "cutomerName='" + cutomerName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", usingTime='" + usingTime + '\'' +
                ", pay=" + totalpay +
                '}';
    }
//////////////////////////////////////////




    public Customer(String cutomerName, String customerID, int usingTime, int pay) {
        serialCnt++;
        this.cutomerName = cutomerName;
        this.customerID = customerID;
        this.usingTime = usingTime;
        this.totalpay = pay;
        serialNo = String.format("%04d",serialCnt);

    }

    public String showCustomer(){
        String info = "serialNO:"+serialNo+", 고객 이름: "+cutomerName+", 고객 아이디: "+customerID+", 고객 사용 시간: "+usingTime+"시간, 고객 사용 총액: "
                +totalpay+"원 입니다.";
        return info;
    }


}
