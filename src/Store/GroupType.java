package Store;

public enum GroupType {

    NONE("), GENERAL("), VIP("), VVIP(");

    String groupType = "";

    GroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupType() {
        return this.groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}