package PlanetColonyGame.Colonists;

import java.io.IOException;

import PlanetColonyGame.*;

public class ColonistsMenu {
    public ColonistsMenu(Game game) throws IOException{
        System.out.println("Colonists Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        switch(input){
            case 0: game.display();
            break;
            default: new ColonistsMenu(game);
        }
        System.out.println();
    }
}
