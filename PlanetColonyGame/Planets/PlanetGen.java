package PlanetColonyGame.Planets;

public class PlanetGen{
    public PlanetGen(){};
    public Planet createPlanet(PlanetTypes typeOfPlanet){
        if(typeOfPlanet == PlanetTypes.ICE){
            return new IcePlanet();
        }
        else if(typeOfPlanet == PlanetTypes.HOT){
            return new HotPlanet();
        }
        else if(typeOfPlanet == PlanetTypes.EARTH){
            return new EarthLikePlanet();
        }
        else if(typeOfPlanet == PlanetTypes.MARS){
            return new MarsLikePlanet();
        }
        return null;
    };
}