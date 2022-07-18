package PlanetColonyGame.Colony.Tools;

public class Tractor extends Tools{

    @Override
    public void makeTool() {
        name = "Tractor";
        description = "A tool for farmers.";
        cost = 100;
        multiplier = 2;
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
    public int getMultiplier() {
        return multiplier;
    }
    
}
