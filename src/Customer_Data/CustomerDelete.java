package Customer_Data;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.customerlist;
import static Customer_Data.Customer_Menu.selectcustomerMenu;

public class CustomerDelete {

    public static void deleteData(){
        Scanner sc = new Scanner(System.in);
        int deleteNo = DeleteNo();




    }


    ///////////////////////////////////////
    public static int DeleteNo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("몇 번째 고객을 삭제하시겠습니까?");
                System.out.println("종료하시려면 0을 입력해주세요");
                System.out.print("입력: ");
                System.out.println(customerlist.length);
                int deleteNo = Integer.parseInt(sc.next());
                deleteNo= deleteNo-1;
                if (deleteNo < 0|| deleteNo > customerlist.length) {
                    throw new InputMismatchException();
                }
                if(deleteNo ==0){
                    selectcustomerMenu();
                }
                return deleteNo;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력하세요");
            } catch (NumberFormatException e) {
                System.out.println("다시 입력하세요");
            } catch (NegativeArraySizeException e) {
                System.out.println("다시 입력하세요");
            }
        }

    }
}
