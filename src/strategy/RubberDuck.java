package strategy;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("저는 고무 오리입니다.");
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
