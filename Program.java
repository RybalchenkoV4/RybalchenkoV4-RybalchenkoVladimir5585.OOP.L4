public class Program {
    public static void main(String[] args) {

        Box<Apple> box0 = new Box<>();
        Box<Orange> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();

        Apple apple0 = new Apple();

        Orange orange0 = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        box0.setFruits(apple0);

        box1.setFruits(orange0);
        box1.setFruits(orange1);
        box1.setFruits(orange2);
        box1.setFruits(orange3);

        box2.setFruits(orange0);
        box2.setFruits(orange1);
        box2.setFruits(orange2);
        box2.setFruits(orange3);

        System.out.println(box1.compare(box2));


        System.out.println(box1.getWeight());
        System.out.println(box1.getFruits());

        System.out.println(box1);
        System.out.println(box2);

        box1.sprinkleFruit(box2);

        System.out.println(box1);
        System.out.println(box2);
    }
}
