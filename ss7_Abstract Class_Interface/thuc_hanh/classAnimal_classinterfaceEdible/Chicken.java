package abstractClass_Interface.thuc_hanh.classAnimal_classinterfaceEdible;

public class Chicken extends Animal implements  Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
