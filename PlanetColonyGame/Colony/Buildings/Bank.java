package PlanetColonyGame.Colony.Buildings;

public class Bank extends Buildings{

    @Override
    public void buildBuilding() {
        name = "Bank";
        description = "A place where clerks work.";
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
