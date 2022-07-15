package PlanetColonyGame.Colonists;
import PlanetColonyGame.Colonists.Jobs.*;
import PlanetColonyGame.Planets.Planet;

import com.github.javafaker.Faker; //https://github.com/DiUS/java-faker for generating names.
import java.util.Random;
public class Colonist {
    Planet planet;
    int health;
    boolean healthy;
    String name;
    Job job;
    int aptitude; //determines how much of a resource they will produce. Their aptitude grows over time.
    public Colonist(Planet p){
        this.planet = p;
        JobGenerator gen = new JobGenerator();
        this.job = gen.generateJob(planet);
        Faker faker = new Faker();
        this.name = faker.name().name();
        Random rand = new Random();
        this.aptitude = rand.nextInt(1, 10);
    }
    //remove later
    public Colonist(){
        JobGenerator gen = new JobGenerator();
        this.job = gen.generateJob(planet);
        Faker faker = new Faker();
        this.name = faker.name().name();
        Random rand = new Random();
        this.aptitude = rand.nextInt(1, 10);
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
    public void work(){
        job.doWork(aptitude, planet);
    }
}