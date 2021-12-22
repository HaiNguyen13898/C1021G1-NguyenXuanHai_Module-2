package ss6_ke_thua.bai_tap.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Area circle :" + circle.getArea());

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 10);
        System.out.println("Total is: " + cylinder.getTotalArea());

    }
}
