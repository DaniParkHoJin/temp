package exam03;

public class Box<T extends Fruit> { // Fruit, Apple, Melon...
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printInfo() {
        System.out.println(item.getInfo());
    }
    
}
