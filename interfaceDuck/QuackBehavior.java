package designPattern.interfaceDuck;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public interface QuackBehavior {
    void quack();
}

class Quack implements QuackBehavior{

    @Override
    public void quack() {
        print("Quack");
    }
}

class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        print("Squeak");
    }
}

class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        print("<< Silence >>");
    }
}
