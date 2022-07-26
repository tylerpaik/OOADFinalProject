package PlanetColonyGame.Inventory;

import java.io.IOException;

import PlanetColonyGame.*;

public class InventoryMenu {
    public InventoryMenu(Game game) throws IOException{
        System.out.println("Inventory Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        switch(input){
            case 0: game.display();
            break;
            default: new InventoryMenu(game);
        }
        System.out.println();
    }
}
