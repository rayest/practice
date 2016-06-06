package designPattern.interfaceDuck;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        print("I am flying!");
    }
}
class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        print("I cannot fly!");
    }
}
class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        print("I am flying with a rocket!");
    }
}