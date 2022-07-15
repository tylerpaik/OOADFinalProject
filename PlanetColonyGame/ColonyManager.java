package PlanetColonyGame;
import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Planets.Planet;
import PlanetColonyGame.Planets.PlanetGen;
import PlanetColonyGame.Planets.PlanetTypes;
public class ColonyManager {
    Planet planet;
    Colonists colonists;
    Inventory inventory;
    
    ColonyManager(){
        PlanetGen p = new PlanetGen();
        planet = p.createPlanet(PlanetTypes.MARS);
    }
}
