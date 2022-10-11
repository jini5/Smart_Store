package Customer_Data;

import Exception.InputException;
import java.util.InputMismatchException;
import Store.Data;

import java.util.Scanner;

public class Customer {

    static String name = null;
    static String ID = null;
    static double time = 0;
    static int money = 0;

    static int Num=0;
    static int addNum;
    static int cnt=1;
    public static Data[]  customerlist;



    // 고객 정보 추가/////////////////////////////////////////////////////
    public static void addData_list() {
        int size = CustomData.HowsizeAdd();
        customerlist = new Data[Num + size];

    }

    public static void addData() {
        Scanner sc = new Scanner(System.in);
        addData_list();

        while(true){
            int addmenu = CustomerList.addList();
            try {

                if(addmenu ==1){// 이름
                    Add_Customer_Data.CustomerName();
                    continue;
                }
                if(addmenu ==2){// ID
                    Add_Customer_Data.CustomerID();
                    continue;
                }
                if(addmenu ==3){// 시간
                    Add_Customer_Data.CustomerTime();
                    continue;
                }
                if(addmenu ==4){// 금액
                    Add_Customer_Data.CustomerPay();
                    continue;
                }
                if(addmenu ==5){// 입력 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                System.out.println("다시 입력해주세요");
            } catch (InputMismatchException e) {
                System.out.println("다시 입력해주세요");

            }

        }

    }




    // 고객 정보 삭제/////////////////////////////////////////////////////

    public static void deleteData_list() {
        int size = CustomData.HowsizeDelete();
        customerlist = new Data[Num - size];
    }
    public static void deleteData(){
        Scanner sc = new Scanner(System.in);


    }

    // 고객 정보 업데이트/////////////////////////////////////////////////////
    public static void updateData(){
        Scanner sc = new Scanner(System.in);

    }

    // 고객 정보 보기/////////////////////////////////////////////////////
    public static void viewData(){
        Scanner sc = new Scanner(System.in);

    }

}
