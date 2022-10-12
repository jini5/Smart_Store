package Customer_Data;
import java.util.Scanner;
import Exception.InputException;
import java.util.InputMismatchException;

import static Customer_Data.CustomerAdd.HowsizeAdd;


public class Customer_Menu {

    public static int selectcustomerMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================");
        System.out.println("1. 고객 정보 추가");
        System.out.println("2. 고객 정보 보기");
        System.out.println("3. 고객 정보 수정");
        System.out.println("4. 고객 정보 삭제");
        System.out.println("5. 뒤로가기");
        System.out.println("================");
        System.out.print("메뉴 선택: ");
        int menu = sc.nextInt();
        return menu;

    }



    /////////////////메뉴////////////////////////
    public static void CustomerMainMenu() {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            int choice = selectcustomerMenu();
            if (choice == 1) {
                CustomerAdd.addData();
                continue;
            }
            if (choice == 2) {
                CustomerView.viewData();
                continue;
            }
            if (choice == 3) {
                //.updateData();
                continue;
            }
            if (choice == 4) {
                CustomerDelete.deleteData();
                continue;
            }
            if (choice == 5)
                break;
            System.out.println("다시 입력해주세요");
        }




    }




}


    //public static void selectcustomerMenu(){


        /*
        switch(menu){
            case 1:
                System.out.println("고객 정보 추가");
                //addData();
                break;
            case 2:
                System.out.println("고객 정보 보기");
                viewData();
                break;
            case 3:
                System.out.println("고객 정보 수정");
                updateData();
                break;
            case 4:
                System.out.println("고객 정보 삭제");
                deleteData();
                break;
            case 5:
                System.out.println("뒤로가기");
                break;
            default:
                System.out.println("다시 입력해 주세요");
                selectcustomerMenu();

        }
         */


   // }


