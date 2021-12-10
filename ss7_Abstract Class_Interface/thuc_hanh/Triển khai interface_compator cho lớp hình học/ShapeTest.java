package abstractClass_Interface.thuc_hanh.classComparable;

public class ShapeTest  {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
