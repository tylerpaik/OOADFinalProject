package PlanetColonyGame.Planets;
interface planetInterface{
    int getTemperature();
    double getOxygen();
    double getWater();
    double getIce();
    double getMinerals();
};
public abstract class Planet implements planetInterface{
    int temperature;
    double oxygen;
    double water;
    double ice;
    double minerals;
}
