package PlanetColonyGame.Planets;

public class MarsLikePlanet extends Planet{
    protected MarsLikePlanet(){
        generatePlanet();
    } 
    public void generatePlanet(){
        super.temperature = -81;
        super.oxygen = 0.0;
        super.water = 0.0;
        super.ice = 5;
        super.minerals = 80.0;
    }
    @Override
    public String getDescription() {
        return ("A planet with freezing temperatures, no breathable air. Frozen surface lakes offer oxygen, and the world is abundant with minerals.");
    }
}
