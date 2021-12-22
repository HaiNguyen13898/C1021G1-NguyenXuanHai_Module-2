package ss7_abstractClass_interface.thuc_hanh.classComparable;

public class ShapeTest  {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
