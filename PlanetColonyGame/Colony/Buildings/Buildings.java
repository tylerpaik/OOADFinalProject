package PlanetColonyGame.Colony.Buildings;

interface BuildingInterface{  //STRATEGY PATTERN
    public void buildBuilding();
    public String getName();
    public String getDescription();
    public int getCost();
    public int getExport();
 };
 public abstract class Buildings implements BuildingInterface{ //handles creation of buildings
    String name;
    String description;
    int cost;
    int export;
 }
 