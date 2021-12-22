package ss7_abstractClass_interface.thuc_hanh.classComparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle( double radius){
        super(radius);
    }

    public ComparableCircle( double radius, String color,boolean filled){
        super(radius, color, filled);
    }

        @Override
        public int compareTo (ComparableCircle DropShadow){
        if (getRadius() > getRadius()) {
            return 1;
        } else if (getRadius() < getRadius()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
