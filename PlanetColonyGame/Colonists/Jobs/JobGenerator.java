package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
public class JobGenerator {
    public JobGenerator(){};

    public Job generateJob(){
        Random rand = new Random();
        int choice = rand.nextInt(0, JobTypes.values().length);
        JobTypes theJob = JobTypes.values()[choice];
        if(theJob.equals(JobTypes.MINER)) return new Miner();
        else if (theJob.equals(JobTypes.HARVESTER)) return new Harvester();
        else if (theJob.equals(JobTypes.CLERK)) return new Clerk();
        return null; 
    }
}
