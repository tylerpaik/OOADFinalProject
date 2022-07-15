package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Planets.Planet;
import PlanetColonyGame.Inventory.ResourceTypes;

public class Clerk implements Job{

    @Override
    public Yield doWork(int aptitude, Planet p) {
        Random rand = new Random();
        //has a chance of producing between 0 and 100 based on aptitude.
        int seed = rand.nextInt(aptitude, aptitude*10);
        return new Yield(ResourceTypes.CREDITS, seed);
    }

    @Override
    public JobTypes getType() {
        return JobTypes.CLERK;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Clerk";
    }
    
}
