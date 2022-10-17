package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Customers;
import Store.Main;
import groups.Groups;
import groups.Group;
import groups.GroupType;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Classification_Menu {
    static Group[] groups = Groups.getInstance().getGroups();

    public static void classifiCationMenu(){
        int menu = classifiCationSelect();
        boolean status=false;
        switch (menu){
            case 1:
                //Set_Parameter.settingParameter();//분류기준 설정
                Set_Parameter.setParameter();
                break;
            case 2:
                //Update_Parameter.updateParameter();//분류기준 수정
                View_Parameter.viewParameter();
                break;
            case 3:
                //View_Parameter.viewParameter();//분류기준 출력
                Update_Parameter.editParameter();
                break;
            case 4:
                status = true;
                break;
        }

        if(status){
            Main.mainMenu();
        }else if(!status){
            classifiCationMenu();
        }

    }


    public static int classifiCationSelect(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. 분류기준 설정");
                System.out.println(" 2. 분류기준 확인");
                System.out.println(" 3. 분류기준 수정");
                System.out.println(" 4. 뒤로가기");
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

    ////////////////////////////////////////////////////////////////////////////////////////////////





    public static String selectGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("** \'end\'를 입력하면 메뉴로 되돌아갑니다. **");
        System.out.print("등급을 선택하세요. (GENERAL, VIP, VVIP) : ");
        String input = sc.next();
        return input;
    }

    public static void selectParameter(GroupType groupType) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==============================");
            System.out.println("1. 최소 이용 시간");
            System.out.println("2. 최소 결제 금액");
            System.out.println("3. 돌아가기");
            System.out.println("==============================");

            int input = sc.nextInt();
            System.out.println();

            if (input == 1) { // 시간
                while (true) {
                    try {
                        editSpentTime(groups[groupType.getIndex()]);
                        Customers.setCustomers_memberGrade();
                        break;
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("잘못된 값을 입력했습니다. 0 이상의 정수를 입력해주세요.\n");
                    }
                }
            } else if (input == 2) { // 금액
                while (true) {
                    try {
                        editTotalPayment(groups[groupType.getIndex()]);
                        Customers.setCustomers_memberGrade();
                        break;
                    } catch (InputMismatchException inputMismatchException) {
                        sc = new Scanner(System.in);
                        System.out.println("잘못된 값을 입력했습니다. 0 이상의 정수를 입력해주세요.\n");
                    } catch (InputRangeException e) {
                        System.out.println("다시 입력하세요.");
                    }
                }
            } else if (input == 3) { // 나가기
                return;
            } else {
                System.out.println("다시 입력하세요.\n");
            }
        }
    }

    public static boolean isGradeExist(GroupType groupType) {
        if (groups[groupType.getIndex()].isInitialized()) return true;
        else return false;
    }

    public static void editSpentTime(Group group) throws InputRangeException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print(group.getGrade().getLabel() + "이(가) 되기 위해 필요한 최소 사용 시간을 입력하세요 : ");
        int time = sc.nextInt();
        System.out.println();
        group.getParam().setSpentTime(time);
    }

    public static void editTotalPayment(Group group) throws InputRangeException, InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.print(group.getGrade().getLabel() + "이(가) 되기 위해 필요한 최소 결제 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.println();
        group.getParam().setTotalPayment(money);
    }

}
