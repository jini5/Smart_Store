package Summary;
import Classification_Parameter.general;
import Classification_Parameter.vip;
import Classification_Parameter.vvip;
import Customer_Data.*;
import Store.Customer;
import Store.Customers;

import java.lang.management.MemoryType;

import static Customer_Data.CustomerAdd.customerlist;
import static Store.Customer.memberType.*;
import static Store.Customer.memberType.NONE;

public class Summary {


    static int VVIPCNT=0;
    static int VIPCNT=0;
    static int GENERALCNT=0;
    static int NONECNT=0;

    static Customer[] NoneList = new Customer[NONECNT];
    static Customer[] GeneralList = new Customer[GENERALCNT];
    static Customer[] VipList = new Customer[VIPCNT];
    static Customer[] VVipList = new Customer[VVIPCNT];

    public static void groupTypeSet() {
        general.getMinMoney();
        general.getMinTime();
        vip.getMinMoney();
        vip.getMinTime();
        vvip.getMinMoney();
        vvip.getMinTime();



        // 등급별 나누기
        for(int i=0; i<customerlist.length; i++){
            if(customerlist[i].getTotalpay()>vvip.getMinMoney() && customerlist[i].getUsingTime()>vvip.getMinTime()){
                customerlist[i].setMemberType(VVIP);
                VVIPCNT++;
            }
            else if(customerlist[i].getTotalpay()>vip.getMinMoney() && customerlist[i].getUsingTime()>vip.getMinTime()) {
                customerlist[i].setMemberType(VIP);
                VIPCNT++;
            }
            else if(customerlist[i].getTotalpay()>general.getMinMoney() && customerlist[i].getUsingTime()>general.getMinTime()){
                customerlist[i].setMemberType(GENERAL);
                GENERALCNT++;
            }
            else{
                customerlist[i].setMemberType(NONE);
                NONECNT++;
            }
        }


        makearr();

    }


    public static void makearr(){

        int vvcnt=0;
        int vcnt=0;
        int gcnt=0;
        int ncnt=0;

        for(int i=0; i<customerlist.length; i++) {
            if(customerlist[i].getMemberType().equals(VVIP)){
                VVipList[vvcnt] = customerlist[i];
                vvcnt++;
            }
            else if(customerlist[i].getMemberType().equals(VIP)){
                VipList[vcnt] = customerlist[i];
                vcnt++;
            }else if(customerlist[i].getMemberType().equals(GENERAL)){
                GeneralList[gcnt] = customerlist[i];
                gcnt++;
            }else if(customerlist[i].getMemberType().equals(NONE)){
                NoneList[ncnt] = customerlist[i];
                ncnt++;
            }
        }

        for(int i = 0; i< VVipList.length; i++){
            System.out.println(VVipList[i]);
        }

    }




}
