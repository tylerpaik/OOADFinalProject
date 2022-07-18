package PlanetColonyGame.Colony.Tools;

public class Bandages extends Tools{

    @Override
    public void makeTool() {
        name = "Bandages";
        description = "A tool for doctors.";
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
