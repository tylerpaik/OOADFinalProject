import java.util.*;

import PlanetColonyGame.Colonists.Colonist;
import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Planets.Planet;

public class SaveFileConversions {
    SaveFileConversions(WorldObserver o){
        ArrayList<String> dataList = new ArrayList<String>();

        Planet planet = o.getPlanet();
        
        int temperature = planet.temperature;
        double oxygen = planet.oxygen;
        double water = planet.water;
        double ice = planet.ice;
        double minerals = planet.minerals;



        Colonists colonists = o.getColonists();

        ArrayList<Colonist> colonistList = colonists.getColonists();
        
        ArrayList<String> colonistNames
        for(int i = 0; i < colonistList.size(); i++){

        }

        Inventory inventory = o.getInventory();
        ArrayList<JobTypes> jobs= o.getAvailableJobs();

    }
}