package PlanetColonyGame.Colonists.Jobs;
import PlanetColonyGame.Inventory.ResourceTypes;
import PlanetColonyGame.Planets.Planet;

public interface Job {
    Yield doWork(int aptitude, Planet p);
    JobTypes getType();
    String getName();
}

class Yield{
    ResourceTypes type;
    int count;
    Yield(ResourceTypes r, int c){
        this.type = r;
        this.count = c;
    }
}