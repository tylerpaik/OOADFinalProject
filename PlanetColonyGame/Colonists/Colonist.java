package PlanetColonyGame.Colonists;
import PlanetColonyGame.Colonists.Jobs.*;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;

import com.github.javafaker.Faker; //https://github.com/DiUS/java-faker for generating names.
import java.util.Random;
public class Colonist {
    int health;
    boolean healthy;
    String name;
    Job job;
    int aptitude; //determines how much of a resource they will produce. Their aptitude grows over time.
    public Colonist(Planet p, JobGenerator j){
        this.job = j.generateJob();
        Faker faker = new Faker();
        this.name = faker.name().name();
        Random rand = new Random();
        this.aptitude = rand.nextInt(1, 10);
    }
    public String getName(){
        return job.getName();
    }
    public String getJob(){
        return job.getName();
    }
    public String getName(){
        return this.name;
    }
    public boolean isHealthy(){
        if(healthy) return true;
        else return false;
    }
    public void makeHealthy(){
        this.healthy = true;
    }
    public void makeSick(){
        this.healthy = false;
    }
    public void work(Planet p, Inventory i){
        job.doWork(aptitude, p);
    }
}
