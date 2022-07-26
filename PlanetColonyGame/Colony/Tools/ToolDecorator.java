package PlanetColonyGame.Colony.Tools;

public abstract class ToolDecorator extends Tools { //allows tools to have different efficiencies
    public abstract String getDescription();    //DECORATOR PATTERN
    public abstract int getCost();
    public abstract int getMultiplier();
}
