package Customer_Data;

import Store.Data;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Customer_Data.CustomerAdd.Num;
import static Customer_Data.CustomerAdd.customerlist;

public class CustomerAdd {



    static boolean result = true;
    public static int Num=0;

    public static Data[] customerlist = new Data[Num];




    //////////////
///
    ///////////////////////////////////////
    //////////////고객 정보 추가////////////////////
    public static void addData(){
        int size = HowsizeAdd();
        CustomerAdd.listAdd(size);

        for (int i = 0; i<size;i++) {
            String name = null;
            String ID = null;
            int time = 0;
            int pay = 0;
            boolean result = true;

            while (result) {

                Scanner sc = new Scanner(System.in);
                System.out.println((i + 1) + "번째 손님 정보를 입력합니다.");
                System.out.println("====================");
                System.out.println("1. 고객 이름 입력");
                System.out.println("2. 고객 ID 입력");
                System.out.println("3. 고객 사용 시간 입력");
                System.out.println("4. 고객 사용 금액 입력");
                System.out.println("5. 정보 입력 종료");
                System.out.println("====================");
                System.out.print("메뉴 선택: ");
                int menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println((i + 1) + "번째 고객의 이름을 입력해주세요");
                        System.out.print("입력: ");
                        name = sc.next();
                        break;
                    case 2:
                        System.out.println((i + 1) + "번째 고객의 아이디를 입력해주세요");
                        System.out.print("입력: ");
                        ID = sc.next();
                        break;
                    case 3:
                        System.out.println((i + 1) + "번째 고객의 사용시간을 입력해주세요");
                        System.out.print("입력: ");
                        time = sc.nextInt();
                        break;
                    case 4:
                        System.out.println((i + 1) + "번째 고객의 사용금액을 입력해주세요");
                        System.out.print("입력: ");
                        pay = sc.nextInt();
                        break;
                    case 5:
                        System.out.println((i + 1) + "번째 고객의 정보 입력을 종료합니다.\n");
                        result = false;
                        break;
                    default:
                        System.out.println("다시 입력해 주세요.");
                        continue;
                }

            }customerlist[Num+i] = new Data(name, ID,time, pay);

        }
        Num += size;
        System.out.println("정보 입력 완료.");
    }
    ////////////////////////////////

    //////데이터 크기 늘리기/////////
    public static void listAdd(int size) {


        if(size == 0){
            Customer_Menu.CustomerMainMenu();
        }

        Data[] newCustomerList = new Data[Num+size];
        for(int i =0;i<customerlist.length;i++){
            newCustomerList[i]=customerlist[i];
        }
        customerlist = newCustomerList;

    }
    //////////////////////////////////



    ////////////////사이즈입력////////////////
    public static int HowsizeAdd(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("==========================");
                System.out.println("몇명의 고객을 입력하시겠습니까?");
                System.out.println("종료하시려면 0을 입력해주세요");
                System.out.print("입력: ");
                int size = Integer.parseInt(sc.next());
                if(size<0){
                    throw new InputMismatchException();
                }return size;
            }catch (InputMismatchException e){
                System.out.println("==========================");
                System.out.println("다시 입력하세요.");
                HowsizeAdd();
            }catch(NumberFormatException e){
                System.out.println("다시 입력하세요");
                HowsizeAdd();
            }catch (NegativeArraySizeException e){
                System.out.println("다시 입력하세요");
                HowsizeAdd();
            }
        }
    }





}
