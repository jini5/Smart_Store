package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.*;
import java.util.Scanner;


public class Set_Parameter {
    public static void settingParameter(){ //매개변수
        Scanner sc = new Scanner(System.in);
        int setmenu = selectsetMenu();
        boolean status = false;
        switch (setmenu){
            case 1: //general
                General.generalmenu();
                break;
            case 2:
                Vip.vipmenu();
                break;
            case 3:
                VVip.vvipmenu();
                break;
            case 4:
                status = true;
                break;
            default:
                System.out.println("올바른 형식이 아닙니다. 다시 입력해 주세요.");
                Classification_Menu.classifiCationMenu();
                break;
        }

    }


    /////////////////////////분류 기준 초기 설정/////////////////////////////////
    public static int selectsetMenu(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println("분류 기준을 설정할 등급을 선택해 주세요");
                System.out.println("1. GENERAL");
                System.out.println("2. VIP");
                System.out.println("3. VVIP");
                System.out.println("4. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
                int select = Exception.scannerInt();
                if (select < 1 || select > 4)
                    throw new InputRangeException();
                return select;
            } catch (NumberFormatException e) {
                System.out.println("다시 입력하세요.");
            } catch (InputRangeException e) {
                System.out.println("다시 입력하세요.");
            }
        }
    }


////////////////////////////////////////////////////////////////////////////////////////


}
