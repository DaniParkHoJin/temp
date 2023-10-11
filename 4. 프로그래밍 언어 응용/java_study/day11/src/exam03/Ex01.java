package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
     // Box<Apple> appleBox = new Box<>();  <-생략 가능
        appleBox.setItem(new Apple());
        Apple apple = appleBox.getItem();

     // Box<Toy> toyBox = new Box<>(); <- Fruit의 하위만 가능하기 때문에

    }
}
