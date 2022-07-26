package PlanetColonyGame.Colony.Tools;

public class PowerfulTool extends ToolDecorator{
    Tools tool;

    public PowerfulTool(Tools tool){
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
        return "Powerful " + tool.getName();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return tool.getDescription() + " (Powerful)";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return tool.getCost() * 4;
    }

    @Override
    public int getMultiplier() {
        // TODO Auto-generated method stub
        return tool.getMultiplier() * 4;
    }
    
}
