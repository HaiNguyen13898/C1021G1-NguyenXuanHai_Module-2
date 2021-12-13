package abstractClass_Interface.bai_tap.trien_khai_interface_Colorable;

public class Square extends  Shape implements Colorable {
    private double side = 0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }



    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("hình vuông: tô 4 cạnh");
    }
}
