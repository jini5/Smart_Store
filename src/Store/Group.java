package Store;
import Customer_Data.CustomerAdd;
import Store.Main;

public class Group{
    private GroupType type;

    private Parameter param;
    public Group() {
        this(null, null);
    }



    public Group(GroupType type, Parameter param) {
        this.type = type;
        this.param = param;
    }


    public GroupType getType() {
        return this.type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public Parameter getParam() {
        return this.param;
    }

    public void setParam(Parameter param) {
        this.param = param;
    }

    public void edit(GroupType type, Parameter param) {
        this.type = type;
        this.param = param;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof Group &&
                this.type.equals(((Group)o).type))
            return true;
        return false;
    }

    public String toString() {
        if (this.type == null)
            return "No group.";
        return (this.param == null) ? ("GroupType: " +
                this.type + "\nParameter: null") : ("GroupType: " +

                this.type + "\nParameter: " + this.param.toString());
    }



}

