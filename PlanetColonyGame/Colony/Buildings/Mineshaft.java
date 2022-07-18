package PlanetColonyGame.Colony.Buildings;

public class Mineshaft extends Buildings{

    @Override
    public void buildBuilding() {
        name = "Mineshaft";
        description = "A place where miners work.";
        cost = 500;
        export = 5;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public int getExport() {
        return export;
    }
    
}
