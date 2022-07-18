package PlanetColonyGame.Colony.Tools;

public class Pickaxe extends Tools{

    @Override
    public void makeTool() {
        name = "Pickaxe";
        description = "A tool for miners.";
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
