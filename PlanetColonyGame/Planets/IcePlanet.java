package PlanetColonyGame.Planets;

public class IcePlanet extends Planet{
    protected IcePlanet(){
        generatePlanet();
    }

    @Override
    public void generatePlanet() {
        super.temperature = -200;
        super.oxygen = 0;
        super.water = 40;
        super.minerals = 10;
        super.ice = 90;
        
    }

    @Override
    public String getDescription() {
        return ("A frozen planet with an ice sheet covering the surface. There is an abundancy of water underneath the ice, but temperatures are low, and the air is not breathable.");
    }
}
