package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;
import java.util.ArrayList;
public class JobGenerator {
    WorldState worldState;
    WorldObserver worldObserver;
    public JobGenerator(WorldState ws){
        //First time a jobGenerator is created, it should check whether or not certain jobs are valid on a planet.
        worldObserver = new WorldObserver(ws);
    };

    public Job generateJob(){
        ArrayList<JobTypes> availableJobs = worldObserver.getAvailableJobs();
        Random rand = new Random();
        int choice = rand.nextInt(availableJobs.size());
        JobTypes theJob = availableJobs.get(choice);
        if(theJob.equals(JobTypes.MINER)) return new Miner();
        else if (theJob.equals(JobTypes.HARVESTER)) return new Harvester();
        else if (theJob.equals(JobTypes.CLERK)) return new Clerk();
        else if (theJob.equals(JobTypes.FARMER)) return new Farmer();
        else if (theJob.equals(JobTypes.DOCTOR)) return new Doctor();
        return null; 
    }

    public Job generateJob(JobTypes j){
        //todo
        JobTypes theJob = j;
        if(theJob.equals(JobTypes.MINER)) return new Miner();
        else if (theJob.equals(JobTypes.HARVESTER)) return new Harvester();
        else if (theJob.equals(JobTypes.CLERK)) return new Clerk();
        else if (theJob.equals(JobTypes.FARMER)) return new Farmer();
        else if (theJob.equals(JobTypes.DOCTOR)) return new Doctor();
        return null;
    }
}
