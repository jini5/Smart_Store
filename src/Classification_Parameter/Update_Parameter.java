package Classification_Parameter;
import Exception.InputRangeException;
import Exception.InputEmptyException;
import Exception.InputFormatException;
import Exception.Exception;
import groups.Group;
import groups.GroupType;

import java.util.Locale;
import java.util.Scanner;

import static Classification_Parameter.Classification_Menu.*;

public class Update_Parameter {



    public static void editParameter() {
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
                System.out.println("[그룹] : " + groupType.getLabel());
                System.out.print("[현재 조건] 이용 시간 : " + group.getParam().getSpentTime());
                System.out.println(", 결제 금액 : " + group.getParam().getTotalPayment() + "\n");

                selectParameter(groupType);
            } else {
                System.out.println("잘못된 입력값입니다. 다시 입력해주세요.\n");
            }
        }
    }


}
