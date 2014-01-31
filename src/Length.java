import sun.launcher.resources.launcher_es;

public class Length {
    private Unit unit;
    private double length;

    public Length(double length,Unit unit) {
        if(length<0)throw new IllegalArgumentException();
        this.unit = unit;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length1 = (Length) o;
        if (this.convertTo(new Millimeter()).getValue()== length1.convertTo(new Millimeter()).getValue()) return true;
        return false;
    }


    public double getValue() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }

    public Length convertTo(Unit unit){
        double value = ((this.getUnit()).getUnitValue() / unit.getUnitValue())
                        *this.getValue();
        return new Length(value,unit);
    }
}
