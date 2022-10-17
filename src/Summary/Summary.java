package Summary;
import Classification_Parameter.*;
import Classification_Parameter.Update_Parameter;
import Classification_Parameter.View_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Customers;
import Store.Main;

import java.util.Scanner;


public class Summary {


    public static void summaryMenu() {
        int menu = summarySelect();
        boolean status = false;
        switch (menu) {
            case 1:
                Customers.printCustomerSummary(Customers.getCustomers());
                break;
            case 2:
                Summary_Name.summaryName();
                break;
            case 3:
                Summary_SpentTime.summaryTime();
                break;
            case 4:
                Summary_TotalPayment.summaryPay();
                break;
            case 5:
                status = true;
                break;
        }

        if (status) {
            Main.mainMenu();
        } else if (!status) {
            summaryMenu();
        }

    }
    public static int summarySelect(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. 등록 순 보기");
                System.out.println(" 2. 이름 순 보기");
                System.out.println(" 3. 사용 시간 순 보기");
                System.out.println(" 4. 사용 금액 순 보기");
                System.out.println(" 5. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
                int select = Exception.scannerInt();
                if (select < 1 || select > 5)
                    throw new InputRangeException();
                return select;
            } catch (NumberFormatException e) {
                System.out.println("다시 입력하세요.");
            } catch (InputRangeException e) {
                System.out.println("다시 입력하세요.");
            }
        }
    }



}
