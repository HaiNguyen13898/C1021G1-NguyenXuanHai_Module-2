package ss23_BehavioralDesignPattern.thuc_hanh.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}