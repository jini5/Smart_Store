package Classification_Parameter;
import Exception.InputRangeException;
import Exception.Exception;
import groups.Group;
import groups.GroupType;

import java.util.Locale;
import java.util.Scanner;
import Store.Customers;
import Store.Main;
import groups.Groups;
import groups.Group;
import groups.GroupType;

import java.util.InputMismatchException;
import java.util.Locale;
import static Classification_Parameter.Classification_Menu.isGradeExist;
import static Classification_Parameter.Classification_Menu.selectGrade;

public class View_Parameter {

    static Group[] groups = Groups.getInstance().getGroups();



    public static void viewParameter() {
        while (true) {
            String input = selectGrade().toUpperCase(Locale.ROOT);
            if (input.equals("END")) return;

            if (input.equals("GENERAL") || input.equals("VIP") || input.equals("VVIP")) {
                GroupType groupType = null;

                for (GroupType mg : GroupType.values()) {
                    if (mg.name().equals(input)) groupType = mg;
                }

                if (!isGradeExist(groupType)) {
                    System.out.println("해당 등급 분류 기준이 존재하지 않습니다.\n");
                    continue;
                }

                Group group = groups[groupType.getIndex()];
                System.out.println("[그룹] " + groupType.getLabel());
                System.out.println("이용 시간 : " + group.getParam().getSpentTime());
                System.out.println("결제 금액 : " + group.getParam().getTotalPayment() + "\n");
            } else {
                System.out.println("잘못된 입력값입니다. 다시 입력해주세요.\n");
            }
        }
    }





}
