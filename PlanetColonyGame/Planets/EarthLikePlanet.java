package PlanetColonyGame.Planets;

public class EarthLikePlanet extends Planet{
    EarthLikePlanet(){
        generatePlanet();
    }
    @Override
    public void generatePlanet() {
        super.ice = 12.5;
        super.temperature = 75;
        super.minerals = 50;
        super.oxygen = 100;
        super.water = 75;
    }
    @Override
    public String getDescription() {
        return ("Breathable air, abundant water and ice, a modest amount of minerals. An easy planet.");
    }
    
}
