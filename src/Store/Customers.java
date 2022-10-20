package Store;

import Summary.SummaryByName;

import java.util.Arrays;
import java.util.Comparator;

import static Customer_Data.CustomerAdd.customerlist;
import static Store.Customer.memberType.NONE;


public class Customers {
    public Customer[] customers;

    public Customers() {}

    public Customers(int size){
        customers = new Customer[size];
    }

    public Customers(Customer[] customers){
        this.customers = customers;
    }

    public Customer[] getCustomers(int size) {
        Customer[] result = Arrays.copyOf(customers, size);
        return result;
    }
    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers() {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers1 = (Customers) o;
        return Arrays.equals(customers, customers1.customers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customers);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + Arrays.toString(customers) +
                '}';
    }
    static int nIdx = 0;
    static int gIdx = 0;
    static int vIdx = 0;
    static int vvIdx = 0;

    public static void groupByCustomerName(){

        Customers NoneNameList = new Customers(customerlist.length);
        Customers GeneralNameList = new Customers(customerlist.length);
        Customers VipNameList = new Customers(customerlist.length);
        Customers VVipNameList = new Customers(customerlist.length);




        for(int i =0; i< customerlist.length; i++){
            String names = String.valueOf(customerlist[i].getMemberType());
            if(names.equals(Customer.memberType.VVIP)){
                VVipNameList.getCustomers()[vvIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.VIP)){
                VipNameList.getCustomers()[vIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.GENERAL)){
                GeneralNameList.getCustomers()[gIdx] = customerlist[i];
            }else{
                NoneNameList.getCustomers()[nIdx] = customerlist[i];
            }

        }

        showByName_Menu();

    }
    public static void showByName_Menu() {
        int menu = SummaryByName.selectMenu();
        switch (menu) {
            case 1:
                System.out.println("\n======이름순 정렬======\n");
                System.out.println("VVIP 등급 오름차순 정렬");


                System.out.println("\nVIP 등급 오름차순 정렬");
                for(int i=0; i< vIdx; i++){

                }

                System.out.println("\nGENERAL 등급 오름차순 정렬");
                for(int i=0; i< gIdx; i++){

                }

                System.out.println("\nNONE 등급 오름차순 정렬");
                for(int i=0; i< nIdx; i++){

                }
                break;
            case 2:
                System.out.println("\n======이름순 정렬======\n");
                System.out.println("VVIP 등급 내림차순 정렬");
                //정렬,,,?????for()

                System.out.println("\nVIP 등급 내림차순 정렬");

                System.out.println("\nGENERAL 등급 내림차순 정렬");

                System.out.println("\nNONE 등급 내림차순 정렬");
                break;
            default:
                System.out.println("다시 입력해주세요\n");

        }

    }

    public static void groupByCustomerTime(){

        Customers NoneTimeList = new Customers(customerlist.length);
        Customers GeneralTimeList = new Customers(customerlist.length);
        Customers VipTimeList = new Customers(customerlist.length);
        Customers VVipTimeList = new Customers(customerlist.length);

        int nIdx = 0;
        int gIdx = 0;
        int vIdx = 0;
        int vvIdx = 0;


        for(int i =0; i< customerlist.length; i++){
            String names = String.valueOf(customerlist[i].getUsingTime());

            if(names.equals(Customer.memberType.VVIP)){
                VVipTimeList.getCustomers()[vvIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.VIP)){
                VipTimeList.getCustomers()[vIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.GENERAL)){
                GeneralTimeList.getCustomers()[gIdx] = customerlist[i];
            }else{
                NoneTimeList.getCustomers()[nIdx] = customerlist[i];
            }

        }





    }

    public static void groupByCustomerMoney(){

        Customers NoneMoneyList = new Customers(customerlist.length);
        Customers GeneralMoneyList = new Customers(customerlist.length);
        Customers VipMoneyList = new Customers(customerlist.length);
        Customers VVipMoneyList = new Customers(customerlist.length);

        int nIdx = 0;
        int gIdx = 0;
        int vIdx = 0;
        int vvIdx = 0;


        for(int i =0; i< customerlist.length; i++){
            String names = String.valueOf(customerlist[i].getTotalpay());

            if(names.equals(Customer.memberType.VVIP)){
                VVipMoneyList.getCustomers()[vvIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.VIP)){
                VipMoneyList.getCustomers()[vIdx] = customerlist[i];
            }else if(names.equals(Customer.memberType.GENERAL)){
                GeneralMoneyList.getCustomers()[gIdx] = customerlist[i];
            }else{
                NoneMoneyList.getCustomers()[nIdx] = customerlist[i];
            }

        }

    }


}





