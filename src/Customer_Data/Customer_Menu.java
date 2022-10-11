package Customer_Data;
import java.util.Scanner;
import Exception.InputException;
import java.util.InputMismatchException;
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


    public static void CustomerMainMenu() {

        while (true) {
            try{
                int menu = selectcustomerMenu();
                if (menu == 1) {//고객 추가
                    Customer.addData();
                }
                if (menu == 2) {//고객 정보 보기
                    Customer.viewData();
                }
                if (menu == 3) {//고객 정보 수정
                    Customer.updateData();
                }
                if (menu == 4) {//고객 정보 삭제
                    Customer.deleteData();
                }
                if (menu == 5) {//뒤로가기
                    System.out.println("뒤로가기.");
                    break;
                }
                System.out.println("다시 입력해주세요.");
            }catch (InputMismatchException e) {
                System.out.println("다시 입력해주세요");
            }
        }


    }

    //메뉴 선택




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


