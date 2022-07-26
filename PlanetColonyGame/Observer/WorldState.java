package PlanetColonyGame.Observer;

import java.util.ArrayList;

import PlanetColonyGame.Colonists.Colonist;
import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;

public class WorldState implements Subject{     //handles observers
    private ArrayList<Observer> observers;
    public Planet planet;
    public Colonists colonists;
    public Inventory inventory;
    public ArrayList<JobTypes> availableJobs;
    public WorldState(){
        observers = new ArrayList<>();
        availableJobs = new ArrayList<>();
    }
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
        notifyObserver();
    }

    @Override
    public void unregister(Observer deleteObserver) {
        observers.remove(deleteObserver);
        
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            if(planet!=null){
                observer.updatePlanetState(planet);
            }
            if(inventory!= null){
                observer.updateInventoryState(inventory);
            }
            if(colonists!=null){
                observer.updateColonistsState(colonists);
            }
            if(availableJobs!=null){
                observer.updateAvailableJobs(availableJobs);
            }
        }
        
    }
    public void update(Inventory inventory){
        this.inventory = inventory;
        notifyObserver();
    }
    public void update(Planet planet){
        this.planet = planet;
        notifyObserver();
    }
    public void update(Colonists colonists){
        this.colonists = colonists;
        notifyObserver();
    }
    public void update(ArrayList<JobTypes> availableJobs){
        this.availableJobs = availableJobs;
        notifyObserver();
    }
    public void printWorldState(){
        System.out.println("Current world state: " );
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
        if(inventory!= null){
            System.out.println("Colony Inventory: ");
            System.out.println("    Credits: "+ inventory.numCredits);
            System.out.println("    Food: " + inventory.numFood);
            System.out.println("    Ice: " + inventory.numIce);
            System.out.println("    Medicine: " + inventory.numMedicine);
            System.out.println("    Oxygen: " + inventory.numOxygen);
        }
    }

}
