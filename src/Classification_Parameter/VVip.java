package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;

import java.util.Scanner;

public class VVip {

    public static void vvipmenu(){

        Scanner sc = new Scanner(System.in);
        int setmenu = selectVVMenu();
        boolean status = false;
        switch (setmenu){
            case 1: //general

                break;
            case 2:

                break;
            case 3:
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                Classification_Menu.classifiCationMenu();
                break;
        }

    }

    public static int selectVVMenu(){
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


    ////////////////////////////////////////////////
    public static void setMinVVipSpentTime(Parameter param){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println();
                System.out.print("최소 총 이용 시간을 입력하세요 : ");
                int minTime = sc.nextInt();
                if( minTime < 0 ){
                    throw new InputRangeException();
                }
                param.setMinTime(minTime);
                return;
            }catch(NumberFormatException | InputRangeException e1){
                System.out.println(e1.getMessage());
            }
        }
    }

    public static void setMinVVipTotalPayment(Parameter param){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println();
                System.out.print("최소 총 결제 금액을 입력하세요 : ");
                int minPayment = sc.nextInt();
                if( minPayment < 0 ){
                    throw new InputRangeException();
                }
                param.setMinPayment(minPayment);
                return;
            }catch(NumberFormatException | InputRangeException e1){
                System.out.println(e1.getMessage());
            }
        }
    }
}
