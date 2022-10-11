package Customer_Data;

import java.util.Scanner;
import java.util.InputMismatchException;
public class CustomData {

    public static int HowsizeAdd(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("몇명의 고객을 입력하시겠습니까?");
                System.out.print("입력: ");
                int size = Integer.parseInt(sc.next());

                if(size<0){
                    throw new InputMismatchException();
                }return size;
            }catch (InputMismatchException e){
                System.out.println("다시 입력하세요");
            }
        }
    }


    public static int HowsizeDelete(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("몇명의 고객을 삭제하시겠습니까?");
                System.out.print("입력: ");
                int size = Integer.parseInt(sc.next());

                if(size<0){
                    throw new InputMismatchException();
                }return size;
            }catch (InputMismatchException e){
                System.out.println("다시 입력하세요");
            }
        }
    }
}
