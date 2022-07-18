package PlanetColonyGame.Colony.Tools;

interface ToolInterface{
    public void makeTool();
    public String getName();
    public String getDescription();
    public int getCost();
    public int getMultiplier();
 };
 public abstract class Tools implements ToolInterface{
    String name;
    String description;
    int cost;
    int multiplier;
 }
 