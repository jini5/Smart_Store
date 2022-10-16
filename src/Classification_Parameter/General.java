package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Classification_Parameter.Parameter;
import Classification_Parameter.Group;
import Classification_Parameter.Groups;
import Classification_Parameter.GroupType;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Classification_Parameter.GroupType.GENERAL;

public class General {

    private static Groups groups;
    private static GroupType type;

    public static void generalmenu(){

        Scanner sc = new Scanner(System.in);

        Group group = groups.find(GENERAL);
        if( group != null && group.getParam() != null){
            System.out.println("그룹이 이미 존재합니다.");
            System.out.println("\n" + group);
        } else {
            Parameter param = new Parameter();
            while (true) {
                try {
                    int paramChoice = selectGMenu();

                    if (paramChoice == 1) {
                        int minTime = setMinGeneralSpentTime();
                        param.setMinTime(minTime);

                    } else if (paramChoice == 2) {
                        int minpay =setMinGeneralTotalPayment();
                        param.setMinPayment(minpay);
                    } else {
                        if (paramChoice == 3) {
                            break;
                        }

                        System.out.println("입력값이 유효하지 않습니다. 다시 입력해주세요");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요");
                }
            }
            groups.add(new Group(type, param));
        }
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
