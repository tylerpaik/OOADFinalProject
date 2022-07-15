package PlanetColonyGame.Inventory;
import PlanetColonyGame.Colonists.Colonist;

abstract class Medicine extends Resource{
    public void giveMedicine(Colonist c){
        if(c.isHealthy()){
            return;
            //this is where something would be passed to log
        }
        else{
            c.makeHealthy();
        }
    }
}
