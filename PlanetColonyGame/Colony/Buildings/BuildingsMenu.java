package PlanetColonyGame.Colony.Buildings;

import java.io.IOException;

import PlanetColonyGame.*;

public class BuildingsMenu {
    public BuildingsMenu(Game game) throws IOException{ //menu to handle building changes and info viewing
        System.out.println("Buildings Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        System.out.println();
        switch(input){
            case 0: game.display();
            break;
            default: new BuildingsMenu(game);
        }
        System.out.println();
    }
}
