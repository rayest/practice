package designPattern.decoratorPattern;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
class Poem extends Book{
    public Poem(){
        description = "Poem";
    }

    @Override
    public double cost() {
        return 20;
    }
}
