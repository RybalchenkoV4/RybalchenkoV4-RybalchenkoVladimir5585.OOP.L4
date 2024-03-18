import java.util.ArrayList;

public class Box<T extends Fruit> {


    protected ArrayList<T> fruits = new ArrayList<>();

    public ArrayList<T> getFruits() {
        return fruits;
    }

    protected void setFruits(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight(){
        if(!fruits.isEmpty()){
            float countFruit = this.fruits.size();
            float weightFruit = this.fruits.getFirst().getWeight();
            return countFruit * weightFruit;
        }else{
            return 0;
        }
    }

    public String compare(Box<?> box){
        if(this.getWeight() == box.getWeight()){
            return "Коробки равны";
        }else if(this.getWeight() > box.getWeight()){
            return "Первая коробка тяжелее";
        }else{
            return "Вторая коробка тяжелее";
        }
    }

    public void sprinkleFruit(Box<T> box){
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "В коробке: " + fruits +
                '}';
    }
}
