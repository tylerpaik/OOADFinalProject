package PlanetColonyGame.Observer;

import java.util.ArrayList;

import PlanetColonyGame.Colonists.Colonist;
import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;

public class WorldObserver implements Observer {

    private Planet planet;
    private Inventory inventory;
    private Colonists colonists;   
    private ArrayList<JobTypes> availableJobs;
    private static int observerIDTracker = 0;
    private int observerID;

    public WorldObserver(Subject worldState){
        this.observerID = ++observerIDTracker;
        worldState.register(this);
    }
    
    @Override
    public void updatePlanetState(Planet planet) {
        this.planet = planet;
       // System.out.println("Observer update: ");
        //printObserverState();
    }

    @Override
    public void updateInventoryState(Inventory inventory) {
        this.inventory = inventory;
        //System.out.println("Observer update: ");
        //printObserverState();
    }

    @Override
    public void updateColonistsState(Colonists colonists) {
        this.colonists = colonists;
        //System.out.println("Observer update: ");
        //printObserverState();
    }
    @Override
    public void updateAvailableJobs(ArrayList<JobTypes> availableJobs){
        this.availableJobs = availableJobs;
    }
    @Override
    public void printObserverState() {
        System.out.println("WorldObserver: " + this.observerID);
        if(planet!=null){
            System.out.println("Planet:");
            System.out.println("    Ice: " + planet.ice);
            System.out.println("    Oxygen: " + planet.oxygen);
            System.out.println("    Temperature: " + planet.temperature);
            System.out.println("    Water: " + planet.water);
        }
        if(colonists!=null){
            System.out.println("Colonists: ");
            for(Colonist c : colonists.colonists){
                System.out.println("    "+ c.getName() + " ("+c.getJob()+")");
            }
        }

        
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
}
