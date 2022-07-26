package PlanetColonyGame;

import java.io.IOException;
import java.util.ArrayList;

import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.ColonistsMenu;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Colonists.Jobs.JobsMenu;
import PlanetColonyGame.Colony.Buildings.BuildingsMenu;
import PlanetColonyGame.Colony.Tools.ToolsMenu;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Inventory.InventoryMenu;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;
import PlanetColonyGame.Planets.Planet;
import PlanetColonyGame.Planets.PlanetMenu;
import PlanetColonyGame.Store.StoreMenu;

public class Game {
    int day = 0;
    Methods m = new Methods();
    WorldObserver worldObserver;
    WorldState worldState;
    Planet planet;
    Colonists colonists;
    Inventory inventory;
    ArrayList<JobTypes> availableJobs;
    public Game() throws IOException{
        ColonyManager manager = new ColonyManager();
        this.planet = manager.getPlanet();
        this.colonists = manager.getColonists();
        this.inventory = manager.getInventory();
        this.availableJobs = manager.getAvailableJobs();
        this.worldState = manager.getWorldState();
        this.worldObserver = manager.getWorldObserver();
        runsim(manager);
    }
    public Game(Game game) {
        this.planet = game.planet;
        this.colonists = game.colonists;
        this.inventory = game.inventory;
        this.availableJobs = game.availableJobs;
        this.worldState = game.worldState;
        this.worldObserver = game.worldObserver;
        this.day = game.day - 1;
    }
    private void runsim(ColonyManager manager) throws IOException {
        boolean end = false;
        if(day == 0){
            System.out.println();
            System.out.println("Welcome to the Planet Colony Game!");
            System.out.println();
            System.out.println("In this game, you control the Colony.");
            System.out.println("Will you develop a self-sufficient civilization, or fall victim of the galaxy's mercy?");
            System.out.println();
            System.out.println("Good Luck.");
            System.out.println();
        }
        while(end == false){
            day++;
            nextDay(day);
            end = true;
        }
    }
    private void nextDay(int day) throws IOException {
        System.out.println();
        System.out.println("Colony Day " + day + ":");
        System.out.println();
        display();
    }
    public void display() throws IOException{
        System.out.println("Actions:");
        System.out.println();
        System.out.println("1. Planet");
        System.out.println("2. Buildings");
        System.out.println("3. Tools");
        System.out.println("4. Colonists");
        System.out.println("5. Jobs");
        System.out.println("6. Inventory");
        System.out.println("7. Store");
        System.out.println("8. Next Day");
        System.out.println("9. Main Menu");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = m.receiveInputInt();
        System.out.println();
        options(input);
    }
    private void options(int input) throws IOException{
        switch(input){
            case 1: new PlanetMenu(this);
            break;
            case 2: new BuildingsMenu(this);
            break;
            case 3: new ToolsMenu(this);
            break;
            case 4: new ColonistsMenu(this);
            break;
            case 5: new JobsMenu(this);
            break;
            case 6: new InventoryMenu(this);
            break;
            case 7: new StoreMenu(this);
            break;
            case 8: System.out.println("Day " + day + " has ended.");
            break;
            case 9: new Menu(this);
            break;
            default: display();
        }
    }
}
