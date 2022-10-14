package Store;

import java.util.Objects;

public class Parameter {

    private int minTime;
    private int minPayment;


    public Parameter(int minTime, int minPayment) {
        this.minTime = minTime;
        this.minPayment = minPayment;
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMinPayment() {
        return minPayment;
    }

    public void setMinPayment(int minPayment) {
        this.minPayment = minPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter that = (Parameter) o;
        return getMinTime() == that.getMinTime() && getMinPayment() == that.getMinPayment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMinTime(), getMinPayment());
    }

    @Override
    public String toString() {
        return "CustomerClass{" +
                "minTime=" + minTime +
                ", minPayment=" + minPayment +
                '}';
    }














}


