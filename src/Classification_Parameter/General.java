package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Classification_Parameter.*;
import Store.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.customerlist;
import static Store.Group.GroupByGeneral;


public class General{

    static int minTime;
    static int minpay;

    private static int minGTime =5;
    private static int minGMoney=10000;
    final private static String grade = "General";




    public static int getGMinTime(){
        return minGTime;
    }
    public static int getGMinMoney(){
        return minGMoney;
    }
    public static void setGMinMoney(int money){
        minGMoney = money;
    }
    public static int getMinMoney(){
        return minGMoney;
    }

    public static void showGInfo(){
        System.out.println(grade+"등급의 최소 사용시간은 "+minGTime+"시간 이며 최소 사용금액은 "+minGMoney+"원 입니다.");
    }


    public static void generalmenu(){
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        while (result) {
            try {
                int select = selectGMenu();

                switch (select) {
                    case 1:
                        minTime = setMinGeneralSpentTime();
                        break;
                    case 2:
                        minpay =setMinGeneralTotalPayment();
                        break;
                    case 3:
                        result = false;
                        break;
                    default:
                        System.out.println("다시 입력해 주세요.");
                        System.out.println("입력값이 유효하지 않습니다. 다시 입력해주세요");
                }
            } catch (InputMismatchException e ) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요");
            }

        }
        Group.GroupByGeneral(minTime, minpay);


    }




    public static int selectGMenu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println("설정할 분류 기준을 선택해 주세요");
                System.out.println("1. 최소 사용 시간");
                System.out.println("2. 최소 사용 금액");
                System.out.println("3. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
                int select = Exception.scannerInt();
                if (select < 1 || select > 3)
                    throw new InputRangeException();
                return select;
            } catch (NumberFormatException e) {
                System.out.println("다시 입력하세요.");
            } catch (InputRangeException e) {
                System.out.println("다시 입력하세요.");
            }
        }
    }


    public static int setMinGeneralSpentTime(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println();
                System.out.print("최소 총 이용 시간을 입력하세요 : ");
                int minTime = sc.nextInt();
                if( minTime < 0 ){
                    throw new InputRangeException();
                }

                return minTime;
            }catch(NumberFormatException | InputRangeException e1){
                System.out.println("다시 입력 하세요.");
            }
        }
    }

    public static int setMinGeneralTotalPayment(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println();
                System.out.print("최소 총 결제 금액을 입력하세요 : ");
                int minPayment = sc.nextInt();
                if( minPayment < 0 ){
                    throw new InputRangeException();
                }
                return minPayment;
            }catch(NumberFormatException | InputRangeException e1){
                System.out.println("다시 입력 하세요.");
            }
        }
    }

}
