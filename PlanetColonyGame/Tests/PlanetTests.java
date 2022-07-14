package PlanetColonyGame.Tests;

import org.junit.Test;
import PlanetColonyGame.*;
import PlanetColonyGame.Planets.*;
public class PlanetTests {
   
    @Test
    public void testPlanetGen(){
        PlanetGen planetFactory = new PlanetGen();
        Planet mars = planetFactory.createPlanet(PlanetTypes.MARS);
        System.out.println(mars.getOxygen());
        
    }


}
