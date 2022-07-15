package PlanetColonyGame.Tests;
import org.junit.Test;
import java.util.ArrayList;
import PlanetColonyGame.Planets.*;
import PlanetColonyGame.Colonists.Colonist;
import com.github.javafaker.Faker;
public class test {

    @Test
    public void testColonistGen(){
        ArrayList<Colonist> test = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            test.add(new Colonist());
            System.out.println(test.get(i).getJob());
            System.out.println(test.get(i).getName());
        }
    }

    @Test
    public void testPlanetGen(){
        PlanetGen planetFactory = new PlanetGen();
        Planet mars = planetFactory.createPlanet(PlanetTypes.MARS);
        System.out.println(mars.oxygen);
        
    }
    @Test
    public void testFakeName(){
        Faker faker = new Faker();
        System.out.println(faker.name().name());
        
        //System.out.println(name);
    }
    @Test
    public void testDivide(){
        int test = 5;
        System.out.println(test/2);
    }
}
