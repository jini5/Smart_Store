package Summary;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Summary.Summary.*;
import static Summary.Summary.getNoneList;

public class SummaryByPayment {

    public static void showByPayment_Menu() {
        int menu = selectMenu();
        switch (menu) {
            case 1:
                //오름차순
                break;
            case 2:
                //내림차순
                break;
            case 3:
                System.out.println("프로그램을 종료합니다.");
                break;
        }


    }



    private static int selectMenu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {

                System.out.println("====================");
                System.out.println("1. 오름차순으로 보기");
                System.out.println("2. 내림차순으로 보기");
                System.out.println("3. 뒤로가기");
                System.out.println("====================");
                System.out.print("메뉴 선택: ");
                int menu = Integer.parseInt(sc.next());
                if(menu<0 || menu > 4){
                    throw new InputMismatchException();
                }return menu;
            }catch(InputMismatchException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }catch(NumberFormatException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }catch (NegativeArraySizeException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요");
            }
        }
    }


    public static void viewPayTypeA(){
        groupTypeSet();
        System.out.println("\n ====사용 금액순 출력====\n");
        System.out.println("** VVIP등급 **");
        for(int i = 0; i< getVVipList().length; i++){
            //System.out.println(getVVipList()[i]);
        }
        System.out.println("\n** VIP등급 **");
        for(int i = 0; i< getVipList().length; i++){
            //System.out.println(getVipList()[i]);
        }
        System.out.println("\n** GENERAL등급 **");
        for(int i = 0; i< getGeneralList().length; i++){
            //System.out.println(getGeneralList()[i]);
        }
        System.out.println("\n** NONE등급 **");
        for(int i = 0; i< getNoneList().length; i++){
            //System.out.println(getNoneList()[i]);
        }

    }

    public static void viewPayTypeD(){
        groupTypeSet();
        System.out.println("\n ====사용 금액순 출력====\n");
        System.out.println("** VVIP등급 **");
        for(int i = 0; i< getVVipList().length; i++){
            //System.out.println(getVVipList()[i]);
        }
        System.out.println("\n** VIP등급 **");
        for(int i = 0; i< getVipList().length; i++){
            //System.out.println(getVipList()[i]);
        }
        System.out.println("\n** GENERAL등급 **");
        for(int i = 0; i< getGeneralList().length; i++){
            //System.out.println(getGeneralList()[i]);
        }
        System.out.println("\n** NONE등급 **");
        for(int i = 0; i< getNoneList().length; i++){
            //System.out.println(getNoneList()[i]);
        }

    }

}
