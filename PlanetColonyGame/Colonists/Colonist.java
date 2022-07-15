package PlanetColonyGame.Colonists;
import PlanetColonyGame.Colonists.Jobs.*;
import com.github.javafaker.Faker; //https://github.com/DiUS/java-faker for generating names.
public class Colonist {
    int health;
    boolean healthy;
    String name;
    Job job;
    public Colonist(){
        JobGenerator gen = new JobGenerator();
        this.job = gen.generateJob();
        Faker faker = new Faker();
        this.name = faker.name().name();
    }
    public String getJob(){
        return job.getName();
    }
    public String getName(){
        return this.name;
    }
}
