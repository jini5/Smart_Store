package Store;

public class Groups {
    private int count;

    private Group[] groups;

    public Groups() {
        this.groups = new Group[(GroupType.values()).length];
    }

    public Groups(int maxSize) {
        this.groups = new Group[maxSize];
    }

    public int getCount() {
        return this.count;
    }

    public int length() {
        return this.groups.length;
    }

    public boolean isNullOrEmpty() {
        return (this.groups == null || this.count == 0);
    }

    public void initialize() {
        int i = 0;
        for (GroupType groupType : GroupType.values()) {
            this.groups[i] = new Group(groupType, null);
            i++;
        }
    }

    public void add(Group group) {
        Group grp = find(group.getType());
        if (grp != null) {
            edit(group);
        } else {
            this.groups[this.count] = group;
            this.count++;
        }
    }

    public Group get(int i) {
        return this.groups[i];
    }

    public void edit(Group group) {
        Group grp = find(group.getType());
        if (grp != null)
            grp.setParam(group.getParam());
    }

    public Group find(GroupType groupType) {
        for (Group grp : this.groups) {
            if (grp.getType() == groupType)
                return grp;
        }
        return null;
    }

    public Group findGroupFor(Data cust) {
        if (this.groups == null || cust == null)
            return null;
        for (int i = this.groups.length - 1; i >= 0; i--) {
            Parameter param = this.groups[i].getParam();
            if (param != null)
                if (cust.getUsingTime() >= param.getMinTime() && cust
                        .getPay() >= param.getMinPayment())
                    return this.groups[i];
        }
        return null;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.count; i++)
            str = str + " " + str + "\n";
        return str;
    }
}
