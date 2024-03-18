public class Orange extends Fruit {

    private String name = "Апельсин";

    public String getName() {
        return name;
    }
    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        return String.format(name);
    }
}
