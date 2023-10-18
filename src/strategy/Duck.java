package strategy;

public abstract class Duck {

    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("물에 뜹니다.");
    }

    public void quack() {
        System.out.println("꽥꽥");
    }
}
