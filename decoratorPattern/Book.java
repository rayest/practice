package designPattern.decoratorPattern;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
public abstract class Book {
    public String description = "Unknown Book";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

