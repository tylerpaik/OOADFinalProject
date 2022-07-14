package PlanetColonyGame.Planets;

public class MarsLikePlanet extends Planet{
    protected MarsLikePlanet(){
        super.temperature = -81;
        super.oxygen = 0.0;
        super.water = 0.0;
        super.ice = 50.0;
        super.minerals = 80.0;

    }
    @Override
    public int getTemperature() {
        return this.temperature;
        
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
        
    }

    @Override
    public double getWater() {
        return this.water;
        
    }

    @Override
    public double getIce() {
        return this.ice;
        
    }

    @Override
    public double getMinerals() {
        return this.minerals;
        
    }
    
}
