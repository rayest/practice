package designPattern.Observer;


/**
 * Created by Rayest on 2016/6/1 0001.
 */
public interface Subject {
    void registerObserver(Observer O);
    void removeObserver(Observer O);
    void notifyObservers();
}
