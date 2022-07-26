package PlanetColonyGame.Colony.Tools;

public class LegendaryTool extends ToolDecorator{
    Tools tool;

    public LegendaryTool(Tools tool){
        this.tool = tool;
    }

    @Override
    public void makeTool() {
        // TODO Auto-generated method stub
        tool.makeTool();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Legendary " + tool.getName();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return tool.getDescription() + " (Legendary)";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return tool.getCost() * 5;
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        return tool.getMultiplier() * 5;
    }
    
}
