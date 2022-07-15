package PlanetColonyGame.Colonists.Jobs;

public class Harvester implements Job{

    @Override
    public void doWork() {
        // TODO affect the colony in some way.
        
    }

    @Override
    public JobTypes getType() {
        return JobTypes.HARVESTER;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Harvester";
    }
    
}
