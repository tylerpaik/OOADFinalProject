package PlanetColonyGame.Colonists.Jobs;
import java.util.Random;
import PlanetColonyGame.Planets.Planet;
import java.util.ArrayList;
public class JobGenerator {
    ArrayList<JobTypes> possibleJobs;
    public JobGenerator(){
        for(int i = 0; i < JobTypes.values().length; i++){
            possibleJobs.add(JobTypes.values()[i]);
        }
    };

    public Job generateJob(Planet p){
        if(p.oxygen>=75) {
            possibleJobs.remove(JobTypes.HARVESTER);
        }

        Random rand = new Random();
        int choice = rand.nextInt(0, possibleJobs.size());
        JobTypes theJob = possibleJobs.get(choice);

        if(theJob.equals(JobTypes.MINER)) return new Miner();
        else if (theJob.equals(JobTypes.HARVESTER)) return new Harvester();
        else if (theJob.equals(JobTypes.CLERK)) return new Clerk();
        else if (theJob.equals(JobTypes.FARMER)) return new Farmer();
        else if (theJob.equals(JobTypes.DOCTOR)) return new Doctor();
        return null; 
    }
}
