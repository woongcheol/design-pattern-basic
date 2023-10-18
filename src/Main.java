import strategy.MallardDuck;
import strategy.RubberDuck;

public class Main {
    public static void main(String[] args) {

        // 물 오리의 경우, 일반적인 오리의 모습을 볼 수 있다.
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.display();
        mallardDuck.swim();

        // 러버덕의 경우, 고무 오리로 일반적인 오리의 모습을 볼 수 없다.
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack(); // 오버라이딩, 꽥꽥 -> 삑삑
        rubberDuck.display();
        rubberDuck.swim();
    }
}