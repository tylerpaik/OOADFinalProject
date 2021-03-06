package PlanetColonyGame;
import java.util.*;

import PlanetColonyGame.Colonists.Colonists;
import PlanetColonyGame.Colonists.Jobs.JobTypes;
import PlanetColonyGame.Inventory.Inventory;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Planets.Planet;

import java.io.*;

public class SaveFile { //unfinished way to print current state to a text file to act as a save
    SaveFile(WorldObserver o, String name){
        SaveFileConversions convert = new SaveFileConversions(o);
        try{
            FileWriter myWriter = new FileWriter("Save_" + name + ".txt", true);
            myWriter.append('\n');
            myWriter.append("planet");
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
