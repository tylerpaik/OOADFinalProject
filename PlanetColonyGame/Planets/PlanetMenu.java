package PlanetColonyGame.Planets;

import java.io.IOException;

import PlanetColonyGame.*;
import PlanetColonyGame.Observer.WorldObserver;
import PlanetColonyGame.Observer.WorldState;

public class PlanetMenu {   //menu to handle planet changes and info viewing
    public PlanetMenu(Game game) throws IOException{
        System.out.println("Planet Menu");
        System.out.println();
        System.out.println("1. Planet Info");
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        System.out.println();
        switch(input){
            case 1: game.getWorldState().printPlanetState();
            System.out.println();
            new PlanetMenu(game);
            break;
            case 0: game.display();
            break;
            default: new PlanetMenu(game);
        }
        System.out.println();
    }
}
