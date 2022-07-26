package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Inventory.ResourceTypes;
import PlanetColonyGame.Planets.Planet;

public class Doctor implements Job {
    @Override
    public Yield doWork(int aptitude,Planet p) {
        Random rand = new Random();
        //has a chance of producing between 0 and 5 based on aptitude.
        int seed = rand.nextInt(aptitude/2);
        return new Yield(ResourceTypes.MEDICINE, seed);
    }


    @Override
    public JobTypes getType() {
        // TODO Auto-generated method stub
        return JobTypes.DOCTOR;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Doctor";
    }
    
}
