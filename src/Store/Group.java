package Store;

import Classification_Parameter.General;

import java.util.Objects;

import static Customer_Data.CustomerAdd.customerlist;

public class Group  {

    static Group[] TypeArr = new Group[4];

    public static int cnt = 0;

    private enum grouptype{
        NONE, GENERAL, VIP, VVIP;
    }
    private String type;
    private static int minTime;
    private static int minPayment;

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMinPayment() {
        return minPayment;
    }

    public void setMinPayment(int minPayment) {
        this.minPayment = minPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return getMinTime() == group.getMinTime() && getMinPayment() == group.getMinPayment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMinTime(), getMinPayment());
    }


    @Override
    public String toString() {
        return "Group{" +
                "minTime=" + minTime +
                ", minPayment=" + minPayment +
                '}';
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////


    public static void GroupByGeneral(int minTime, int minpay) {
        Group generalgroup = new Group();


        for(int i =0 ; i< customerlist.length; i++){
            TypeArr[cnt] = customerlist[i];
            cnt++;
        }
        System.out.println("최소 시간: "+minTime+", 최소 금액: "+minPayment);
    }

    public static void GroupByVip(int minTime, int minpay){
        Group vipgroup = new Group();


        System.out.println("최소 시간: "+minTime+", 최소 금액: "+minPayment);


    }

    public static void GroupByVVip(int minTime, int minpay){
        Group vvipgroup = new Group();


        System.out.println("최소 시간: "+minTime+", 최소 금액: "+minPayment);


    }






}
