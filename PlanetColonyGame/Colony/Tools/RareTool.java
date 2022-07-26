package PlanetColonyGame.Colony.Tools;

public class RareTool extends ToolDecorator{
    Tools tool;

    public RareTool(Tools tool){
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
        return "Rare " + tool.getName();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return tool.getDescription() + " (Rare)";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return tool.getCost() * 3;
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        return tool.getMultiplier() * 3;
    }
    
}
