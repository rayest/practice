package designPattern.interfaceDuck;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        print("All ducks float, even decoys!");
    }

}
class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        print("I am a real Mallard designPattern.interfaceDuck!");
    }
}
class RedHeadDuck extends Duck{
    @Override
    public void display(){}
}
class RubberDuck extends Duck{
    @Override
    public void display(){}
}
class DecoyDuck extends Duck{
    public void display(){}
}

class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        print("I am a model designPattern.interfaceDuck!");
    }
}