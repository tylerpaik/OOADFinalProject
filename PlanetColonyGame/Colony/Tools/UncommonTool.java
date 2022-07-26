package PlanetColonyGame.Colony.Tools;

public class UncommonTool extends ToolDecorator{
    Tools tool;

    public UncommonTool(Tools tool){
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
        return "Uncommon " + tool.getName();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return tool.getDescription() + " (Uncommon)";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return tool.getCost() * 2;
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        return tool.getMultiplier() * 2;
    }
    
}
