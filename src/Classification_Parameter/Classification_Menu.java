package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Main;

import java.util.Scanner;

public class Classification_Menu {

    public static void classifiCationMenu(){
        int menu = classifiCationSelect();
        boolean status=false;
        switch (menu){
            case 1:
                Set_Parameter.settingParameter();//분류기준 설정
                break;
            case 2:
                Update_Parameter.updateParameter();//분류기준 수정
                break;
            case 3:
                View_Parameter.viewParameter();//분류기준 출력
                break;
            case 4:
                status = true;
                break;
        }

        if(status){
            Main.mainMenu();
        }else if(!status){
            classifiCationMenu();
        }

    }


    public static int classifiCationSelect(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("==============================");
                System.out.println(" 1. 분류기준 설정");
                System.out.println(" 2. 분류기준 수정");
                System.out.println(" 3. 분류기준 확인");
                System.out.println(" 4. 뒤로가기");
                System.out.println("==============================");
                System.out.print("메뉴 선택: ");
                int select = Exception.scannerInt();
                if (select < 1 || select > 4)
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
