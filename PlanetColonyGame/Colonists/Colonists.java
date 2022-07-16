package PlanetColonyGame.Colonists;
import java.util.ArrayList;

import PlanetColonyGame.Colonists.Jobs.JobGenerator;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;
import PlanetColonyGame.Planets.Planet;

public class Colonists {
    WorldObserver worldObserver;
    WorldState worldState;
    int numColonists;
    JobGenerator jobGenerator;
    public ArrayList<Colonist> colonists;

    public Colonists(WorldState ws){
        this.worldState = ws;
        worldObserver = new WorldObserver(this.worldState);
        jobGenerator = new JobGenerator(this.worldState);
        generateColonists();  
    };
    //one of each kind of colonist is generated at the beginning.
    private void generateColonists(){
        colonists = new ArrayList<Colonist>();
        for(int i = 0; i < 3; i++){
            addColonist();
        }
    }
    //when new colonists are added, its random.
    public void addColonist(){
        colonists.add(new Colonist(worldObserver.getPlanet(), jobGenerator));
        worldState.update(this);
    }
    //add a specific kind of colonist.
    public void addColonist(JobTypes j){
        colonists.add(new Colonist(worldObserver.getPlanet(), jobGenerator));
    }
}
