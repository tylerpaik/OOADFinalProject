package PlanetColonyGame.Colonists;

import java.io.IOException;

import PlanetColonyGame.*;

public class ColonistsMenu {
    public ColonistsMenu(Game game) throws IOException{ //menu to handle colonist changes and info viewing
        System.out.println("Colonists Menu");
        System.out.println();
        System.out.println("1. Colonist Info");
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        System.out.println();
        switch(input){
            case 1: game.getWorldState().printColonistState();
            System.out.println();
            new ColonistsMenu(game);
            break;
            case 0: game.display();
            break;
            default: new ColonistsMenu(game);
        }
        System.out.println();
    }
}
