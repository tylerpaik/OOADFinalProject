package PlanetColonyGame.Colony.Buildings;

public class ElectrolysisPlant extends Buildings{

    @Override
    public void buildBuilding() {
        name = "Electrolysis Plant";
        description = "A place where harvesters work.";
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
