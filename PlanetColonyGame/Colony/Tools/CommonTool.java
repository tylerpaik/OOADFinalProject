package PlanetColonyGame.Colony.Tools;

public class CommonTool extends ToolDecorator{
    Tools tool;

    public CommonTool(Tools tool){
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
        return "Common " + tool.getName();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return tool.getDescription() + " (Common)";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return tool.getCost() * 1;
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        return tool.getMultiplier() * 1;
    }
    
}
