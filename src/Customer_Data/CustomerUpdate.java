package Customer_Data;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.customerlist;
import static Customer_Data.Customer_Menu.selectcustomerMenu;

public class CustomerUpdate {


    public static void updateData(){
        Scanner sc = new Scanner(System.in);

        int updateNo = UpdateNo();

    }





    public static int UpdateNo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("몇 번째 고객을 수정하시겠습니까?");
                System.out.println("종료하시려면 0을 입력해주세요");
                System.out.print("입력: ");
                System.out.println(customerlist.length);
                int updateNo = Integer.parseInt(sc.next());
                updateNo= updateNo-1;
                if (updateNo < 0|| updateNo > customerlist.length) {
                    throw new InputMismatchException();
                }
                if(updateNo ==0){
                    selectcustomerMenu();
                }
                return updateNo;
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
