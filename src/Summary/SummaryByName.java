package Summary;

import Store.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.customerlist;

public class SummaryByName {



    public static int selectMenu() {
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




}
