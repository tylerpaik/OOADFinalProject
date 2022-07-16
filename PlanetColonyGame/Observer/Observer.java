package PlanetColonyGame.Observer;

import java.util.ArrayList;

import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;

public interface Observer {
    public void updatePlanetState(Planet planet);
    public void updateInventoryState(Inventory inventory);
    public void updateColonistsState(Colonists colonists);
    public void updateAvailableJobs(ArrayList<JobTypes> availableJobs);
    public void printObserverState();
}
