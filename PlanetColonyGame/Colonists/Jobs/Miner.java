package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Inventory.ResourceTypes;
import PlanetColonyGame.Planets.Planet;

public class Miner implements Job{
    @Override
    public Yield doWork(int aptitude,Planet p) {
        // TODO Auto-generated method stub
        Random rand = new Random();
        //has a chance of producing between 0 and 100 based on aptitude, planet water/oxygen.
        int upperBound = (int)p.minerals/2;
        int seed = rand.nextInt(0, upperBound);
        return new Yield(ResourceTypes.FOOD, seed); //supposed to be food?
    }
    @Override
    public JobTypes getType() {
        return JobTypes.MINER;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Miner";
    }

   
    
}
