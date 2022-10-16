package Classification_Parameter;

import java.util.Objects;
import Store.*;
import Classification_Parameter.*;

public class Group{
    private GroupType type;
    private Parameter param;

    public Group(GroupType type, Parameter param) {
        this.type = type;
        this.param = param;
    }

    public GroupType getType() {
        return type;
    }

    public void setType(GroupType type) {
        this.type = type;
    }

    public Parameter getParam() {
        return param;
    }

    public void setParam(Parameter param) {
        this.param = param;
    }

    public Customers getCustomers(Customers customers){
        return customers.findAllCustomers(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return getType() == group.getType() && Objects.equals(getParam(), group.getParam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getParam());
    }

    @Override
    public String toString() {
        return "Group{" +
                "type=" + type +
                ", param=" + param +
                '}';
    }
}

