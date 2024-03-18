public class Apple extends Fruit {

    private String name = "Яблоко";

    public String getName() {
        return name;
    }
    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return String.format(name);
    }
}
