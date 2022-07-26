package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Inventory.ResourceTypes;
import PlanetColonyGame.Planets.Planet;

public class Harvester implements Job{

    @Override
    public Yield doWork(int aptitude,Planet p) {
        //take ice and turn it into oxygen.

        Random rand = new Random();
        //has a chance of producing between 0 and 100 based on aptitude, planet water/oxygen.
        int upperBound = ((int)p.water + (int)p.ice + aptitude)/2;
        int seed = rand.nextInt(upperBound * aptitude);
        return new Yield(ResourceTypes.OXYGEN, seed);
        
    }

    @Override
    public JobTypes getType() {
        return JobTypes.HARVESTER;
    }

    @Override
    public String getName() {
        return "Harvester";
    }
    
}
