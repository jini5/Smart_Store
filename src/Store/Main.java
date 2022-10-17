package Store;
import java.util.*;

import Classification_Parameter.Classification_Menu;
import Summary.Summary;
import Customer_Data.Customer_Menu;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] srgs){
        System.out.println("===========================================");
        System.out.println("제목: 스마트 스토어 고객 세분화 토이프로젝트");
        System.out.println("시작날짜 : 2022-10-07");
        System.out.println("Copyright 2022 Hyeonjin All rights reserved.");
        System.out.println("===========================================");
        System.out.println("\n");
        mainMenu();
    }








    //////////////////////////////////////////////////////////
    public static int selectMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("========================");
                System.out.println("1. 고객 분류");
                System.out.println("2. 고객 정보 관리");
                System.out.println("3. 요약");
                System.out.println("4. 프로그램 종료");
                System.out.println("========================");
                System.out.print("메뉴 선택: ");
                int menu = Integer.parseInt(sc.next());
                if(menu<0){
                    throw new InputMismatchException();
                }
                return menu;
            }catch(NumberFormatException e){
                System.out.println("다시 입력하세요");
            }catch(InputMismatchException e){
                System.out.println("다시 입력하세요");
            }
        }
    }
    //////////////////////////////////////////////////////////
    public static void mainMenu() {

        while (true) {
            int menu = selectMenu();
            try {

                if (menu == 1) {// 고객 분류
                    Classification_Menu.classifiCationMenu();
                    break;
                }
                if (menu == 2) {// 고객 정보
                    Customer_Menu.CustomerMainMenu();
                    break;
                }
                if (menu == 3) {// 요약
                    Summary.summaryMenu();
                    break;
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

