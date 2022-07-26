package PlanetColonyGame.Inventory;

import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;

public class Inventory {
    WorldObserver worldObserver;    //handles creation and tracking of inventory.
    WorldState worldState;
    public int numMedicine, numCredits, numIce, numOxygen, numFood;
    public Inventory(WorldState ws){
        this.worldState = ws;
        worldObserver = new WorldObserver(worldState);
        generateInventory();
        worldState.update(this);
    }
    private void generateInventory(){
        numMedicine = 10;
        numCredits = 1000;
        numIce = 100;
        numOxygen = 100;
        numFood = 100;
    }
}
