package PlanetColonyGame.Colony.Tools;

public abstract class ToolDecorator extends Tools {
    public abstract String getDescription();
    public abstract int getCost();
    public abstract int getMultiplier();
}
