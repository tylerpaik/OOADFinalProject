package PlanetColonyGame.Store;

import java.io.IOException;

import PlanetColonyGame.*;

public class StoreMenu {
    public StoreMenu(Game game) throws IOException{
        System.out.println("Store Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        switch(input){
            case 0: game.display();
            break;
            default: new StoreMenu(game);
        }
        System.out.println();
    }
}
