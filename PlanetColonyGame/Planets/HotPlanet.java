package PlanetColonyGame.Planets;

public class HotPlanet extends Planet {
    public HotPlanet(){
        generatePlanet();
    }
    @Override
    public void generatePlanet() {
        super.temperature = 135;
        super.minerals = 100;
        super.oxygen = 80;
        super.ice = 0;
        super.water = 10;
    }
    @Override
    public String getDescription() {
        return ("A lava planet with high temperatures, mostly breathable air, plenty of minerals but almost no water.");
    }
    
}
