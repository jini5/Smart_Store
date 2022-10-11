package Store;
import java.util.*;

import Classification_Parameter.Classification;
import Summary.Summary;
import Customer_Data.Customer_Menu;
import java.util.InputMismatchException;

public class Main {
    public static int selectMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("1. 고객 분류");
        System.out.println("2. 고객 정보 관리");
        System.out.println("3. 요약");
        System.out.println("4. 프로그램 종료");
        System.out.println("========================");
        System.out.print("메뉴 선택: ");

        int menu = sc.nextInt();
        return menu;
    }

    public static void main(String[] args) {

        while (true) {
            int menu = selectMenu();
            try {

                if (menu == 1) {// 고객 분류
                    Classification.classifiCationMenu();
                    continue;
                }
                if (menu == 2) {// 고객 정보
                    Customer_Menu.CustomerMainMenu();
                    continue;
                }
                if (menu == 3) {// 요약
                    Summary.summary();
                    continue;
                }
                if (menu == 4) {// 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                System.out.println("다시 입력해주세요");
            } catch (InputMismatchException e) {
                System.out.println("다시 입력해주세요");

            }

        }

    }
}
/*
        switch(menu){
            case 1:
                System.out.println("분류 메뉴 선택");
                classifiCation();
                break;
            case 2:
                System.out.println("고객 정보 선택");
                addData_main();
                break;
            case 3:
                System.out.println("요약 선택");
                summary();
                break;
            case 4:
                System.out.println("프로그램 종료");
                break;
        }
    }

*/

