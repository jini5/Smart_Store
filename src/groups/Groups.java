package groups;

public class Groups {
    Group[] groups = new Group[4]; // NONE, GENERAL, VIP, VVIP

    private Groups() {
        groups[0] = new Group(GroupType.NONE);
        groups[1] = new Group(GroupType.GENERAL);
        groups[2] = new Group(GroupType.VIP);
        groups[3] = new Group(GroupType.VVIP);

        groups[0].setInitialized(true);
    }

    private static final Groups GROUPS = new Groups(); // 싱글톤 패턴

    public static Groups getInstance() {
        return GROUPS;
    }

    public Group[] getGroups() {
        return groups;
    }
}
