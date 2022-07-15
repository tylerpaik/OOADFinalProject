package PlanetColonyGame.Colonists.Jobs;

import java.util.Random;

import PlanetColonyGame.Inventory.ResourceTypes;
import PlanetColonyGame.Planets.Planet;
public class Farmer implements Job{
    @Override
    public Yield doWork(int aptitude,Planet p) {
        Random rand = new Random();
        //has a chance of producing between 0 and 100 based on aptitude, planet water/oxygen.
        int upperBound = ((int)p.oxygen + (int)p.water + aptitude)/2;
        if(p.temperature > 110 || p.temperature < 35){
            if(upperBound > 0){
                upperBound = upperBound/2;
            }
        }
        int seed = rand.nextInt(0, upperBound);
        return new Yield(ResourceTypes.FOOD, seed);
        
    }

    @Override
    public JobTypes getType() {
        // TODO Auto-generated method stub
        return JobTypes.FARMER;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Farmer";
    }
    
}
