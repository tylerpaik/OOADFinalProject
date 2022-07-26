package PlanetColonyGame.Colonists;
import PlanetColonyGame.Methods;
import PlanetColonyGame.Colonists.Jobs.*;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;

import com.github.javafaker.Faker; //https://github.com/DiUS/java-faker for generating names.
public class Colonist {
    int health;
    boolean healthy;
    String name;
    Job job;
    int aptitude; //determines how much of a resource they will produce. Their aptitude grows over time.
    public Colonist(Planet p, JobGenerator j){
        Methods m = new Methods();
        this.job = j.generateJob();
        Faker faker = new Faker();
        this.name = faker.name().name();
        this.aptitude = m.randInt();
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
    public void setName(String s){
        this.name = s;
    }
}
