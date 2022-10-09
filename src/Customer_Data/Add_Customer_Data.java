package Customer_Data;

import Store.Data;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import static Customer_Data.Customer.selectcustomerMenu;
import static Customer_Data.Delete_Customer_Data.deleteData;
import static Customer_Data.Update_Customer_Data.updateData;
import static Customer_Data.View_Customer_Data.viewData;


public class Add_Customer_Data{


    static int Num=0;
    static int addNum;
    static int cnt=1;
    public static Data[]  customerlist;

    public Add_Customer_Data(String cutomerName, String customerID, double usingTime, int pay) {
        super();
    }


    public static void addData_main() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇명의 고객을 추가 하시겠습니까??");
        System.out.print("고객 수: ");
        addNum= sc.nextInt();
        customerlist = new Data[Num + addNum];


        if(addNum==0){
            System.out.println("추가할 고객이 없습니다.");
            System.out.println("다시 선택메뉴로 돌아갑니다.");
            selectcustomerMenu();
        }else if(addNum>0){
            System.out.println("고객을 추가합니다.");

            addData();
        }else {
            System.out.println("다시 입력해주세요");
            addData_main();
        }


    }

    public static void addData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        String name = null;
        String  ID = null;
        double time = 0;
        int money = 0;

        boolean result = true;



        while(result) {

            System.out.println("====================");
            System.out.println("1. 고객 이름 입력");
            System.out.println("2. 고객 ID 입력");
            System.out.println("3. 고객 사용 시간 입력");
            System.out.println("4. 고객 사용 금액 입력");
            System.out.println("5. 정보 입력 종료");
            System.out.println("====================");
            System.out.print("메뉴 선택: ");
            int menu = Integer.parseInt(br.readLine());


            //serialNo, cutomerName, customerID, usingTime, pay
            switch (menu) {
                case 1:
                    System.out.println(addNum+"명 중 "+(cnt)+"번째 고객 이름을 입력하세요");
                    System.out.print("입력: ");
                    name = st.nextToken(br.readLine());
                    //
                    break;
                case 2:
                    System.out.println(addNum+"명 중 "+(cnt)+"번째 고객 ID를 입력하세요");
                    System.out.print("입력: ");
                    ID = sc.next();
                    //
                    break;
                case 3:
                    System.out.println(addNum+"명 중 "+(cnt)+"번째 고객 사용 시간을 입력하세요");
                    System.out.print("입력: ");
                    time = sc.nextDouble();
                    //
                    break;
                case 4:
                    System.out.println(addNum+"명 중 "+(cnt)+"번째 고객 사용 시간 금액을 입력하세요");
                    System.out.print("입력: ");
                    money = sc.nextInt();
                    //
                    break;
                case 5:
                    System.out.println(addNum+"명 중 "+(cnt)+"번째 고객 입력 종료");
                    customerlist[Num+cnt] = new Data(name, ID, time, money);
                    cnt++;

                    if (cnt > addNum) {
                        result = false;
                        int cnt= 0;

                    } else {
                        result = true;
                    }
                    //
                    break;
                default:
                    System.out.println("다시 입력해 주세요");
                    //
                    break;



            }
        }






    }








}
