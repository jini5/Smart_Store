package Customer_Data;

import java.util.Objects;
import java.util.Scanner;

import static Customer_Data.Add_Customer_Data.addData;
import static Customer_Data.Delete_Customer_Data.deleteData;
import static Customer_Data.Update_Customer_Data.updateData;
import static Customer_Data.View_Customer_Data.viewData;

public class Customer {


    //메뉴 선택
    public static void customerMenu(){
        System.out.println("================");
        System.out.println("고객 정보 추가");
        System.out.println("고객 정보 보기");
        System.out.println("고객 정보 수정");
        System.out.println("고객 정보 삭제");
        System.out.println("뒤로가기");
        System.out.println("================");
        selectcustomerMenu();
    }


    private static void selectcustomerMenu() {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        switch(menu){
            case 1:
                System.out.println("고객 정보 추가");
                addData();
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
                break;
        }
    }



}
