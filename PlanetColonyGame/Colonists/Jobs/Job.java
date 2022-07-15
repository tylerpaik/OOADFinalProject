package PlanetColonyGame.Colonists.Jobs;

public interface Job {
    void doWork();
    JobTypes getType();
    String getName();
}
