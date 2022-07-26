package PlanetColonyGame.Planets;

interface planetInterface{
   public void generatePlanet();
   public String getDescription(); //planet base
};
public abstract class Planet implements planetInterface{
    public int temperature;
    public double oxygen;
    public double water;
    public double ice;
    public double minerals;
}
