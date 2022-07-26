package PlanetColonyGame;
import java.io.IOException;
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
    Colonists colonists;        //manages creation of planet
    Inventory inventory;
    ArrayList<JobTypes> availableJobs;
    public ColonyManager() throws IOException{
        worldState = new WorldState();
        worldObserver = new WorldObserver(worldState);
        Methods m = new Methods();
        System.out.println("Which planet would you like to play?");
        System.out.println();
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Icy");
        System.out.println("4. Hot");
        System.out.println();
        int i = m.receiveInputInt();
        System.out.println();
        generateWorld(i);  
    }
    private void generateWorld(int i){
        PlanetGen p = new PlanetGen();
        switch(i){
            case 1: planet = p.createPlanet(PlanetTypes.EARTH);
            break;
            case 2: planet = p.createPlanet(PlanetTypes.MARS);
            break;
            case 3: planet = p.createPlanet(PlanetTypes.ICE);
            break;
            case 4: planet = p.createPlanet(PlanetTypes.HOT);
            break;
            default: planet = p.createPlanet(PlanetTypes.EARTH);
        }
        worldState.update(planet);
        availableJobs = new ArrayList<>();
        for(int x = 0; x < JobTypes.values().length; x++){
            availableJobs.add(JobTypes.values()[x]);
        }
        worldState.update(availableJobs);
        colonists = new Colonists(worldState);
        inventory = new Inventory(worldState);
        //worldState.printWorldState();
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
    public ArrayList<JobTypes> getAvailableJobs(){
        return this.availableJobs;
    }
    public WorldState getWorldState(){
        return this.worldState;
    }
    public WorldObserver getWorldObserver(){
        return this.worldObserver;
    }
}
