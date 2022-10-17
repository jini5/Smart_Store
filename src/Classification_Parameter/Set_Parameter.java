package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import Store.Customer;
import Store.Customers;
import Store.Main;
import groups.Groups;
import groups.Group;
import groups.GroupType;

import java.util.InputMismatchException;
import java.util.Locale;

import static Classification_Parameter.Classification_Menu.*;


public class Set_Parameter {
    public static void setParameter() { // GradeMenu 1번 - 분류 기준 초기 설정
        while (true) {
            String input = selectGrade().toUpperCase(Locale.ROOT);
            if (input.equals("END")) return;

            if (input.equals("GENERAL") || input.equals("VIP") || input.equals("VVIP")) {
                GroupType groupType = null;

                for (GroupType mg : GroupType.values()) {
                    if (mg.name().equals(input)) groupType = mg;
                }

                if (isGradeExist(groupType)) {
                    System.out.println("해당 등급 분류 기준이 이미 존재합니다.\n");
                    continue;
                }
                groups[groupType.getIndex()].setInitialized(true);
                Customers.setCustomers_memberGrade();
                selectParameter(groupType);
            } else {
                System.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
            }
        }
    }

   }



