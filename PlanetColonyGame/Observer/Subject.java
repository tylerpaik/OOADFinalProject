package PlanetColonyGame.Observer;

public interface Subject {      //OBSERVER PATTERN
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
    public void printWorldState();
}
