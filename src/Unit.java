

public abstract class Unit {

    @Override
    public boolean equals(Object o) {
        return o != null && this.getClass() == o.getClass();
    }


    public abstract double getUnitValue();
}
