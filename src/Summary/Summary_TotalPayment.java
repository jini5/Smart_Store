package Summary;

import Store.Customer;
import static Store.Customers.*;

import Store.Customers;
import Summary.*;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Summary_TotalPayment {



    public static void summaryPay(){
        isAscending();

    }

    public static void isAscending() {
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        int n = 0;
        while (result) {

            int input = selectNMenu();
            System.out.println();
            switch (input){
                case 1:
                    n = 1;
                    Customers.sortByCustomerTotalPayment(n);
                    break;
                case 2:
                    n = -1;
                    Customers.sortByCustomerTotalPayment(n);
                    break;
                case 3:
                    result=false;
                    break;
                default:
                    System.out.println("다시 입력해 주세요.");
            }

        }

    }




    public static int selectNMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("========================================");
                System.out.println("** \'end\'를 입력하면 메뉴로 되돌아갑니다. **");
                System.out.println("어떤 순서로 정렬하시겠습니까?");
                System.out.println("1. 오름차순");
                System.out.println("2. 내림차순");
                System.out.println("3. 뒤로가기");
                System.out.println("=========================================");
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
}
