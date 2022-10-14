package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Parameter;
import java.util.Scanner;


public class Set_Parameter {
    public static void settingParameter(){ //매개변수
        Scanner sc = new Scanner(System.in);
        int setmenu = selectsetMenu();
        boolean status = false;
        switch (setmenu){
            case 1:

                break;
            case 2:

                break;
            case 3:

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



    public static void setParamMinimumSpentTime(Parameter param){
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

    public static void setParamMinimumTotalPayment(Parameter param){
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
