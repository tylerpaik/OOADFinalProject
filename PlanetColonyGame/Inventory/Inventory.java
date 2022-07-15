package PlanetColonyGame.Inventory;

import PlanetColonyGame.Planets.Planet;

public class Inventory {
    Planet planet;
    int numMedicine, numCredits, numIce, numOxygen, numFood;
    Inventory(Planet planet){
        this.planet = planet;
        generateInventory();
    }
    private void generateInventory(){
        numMedicine = 10;
        numCredits = 1000;
        numIce = 100;
        numOxygen = 100;
        numFood = 100;
    }
}
