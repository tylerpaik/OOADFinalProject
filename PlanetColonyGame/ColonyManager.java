package PlanetColonyGame;
import java.util.ArrayList;

import org.junit.Test;

import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;
import PlanetColonyGame.Planets.Planet;
import PlanetColonyGame.Planets.PlanetGen;
import PlanetColonyGame.Planets.PlanetTypes;

public class ColonyManager {
    WorldObserver worldObserver;
    WorldState worldState;
    Planet planet;
    Colonists colonists;
    Inventory inventory;
    ArrayList<JobTypes> availableJobs;
    public ColonyManager(){
        worldState = new WorldState();
        worldObserver = new WorldObserver(worldState);
        generateWorld();  
    }
    private void generateWorld(){
        PlanetGen p = new PlanetGen();
        planet = p.createPlanet(PlanetTypes.MARS);
        worldState.update(planet);
        availableJobs = new ArrayList<>();
        for(int i = 0; i < JobTypes.values().length; i++){
            availableJobs.add(JobTypes.values()[i]);
        }
        worldState.update(availableJobs);
        colonists = new Colonists(worldState);
        inventory = new Inventory(worldState);
        worldState.printWorldState();
    }
    public Planet getPlanet(){
        return this.planet;
    }
    public Colonists getColonists(){
        return this.colonists;
    }
    public Inventory getInventory(){
        return this.inventory;
    }
}
