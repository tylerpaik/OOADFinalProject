package PlanetColonyGame.Inventory;

import java.io.IOException;

import PlanetColonyGame.*;

public class InventoryMenu {
    public InventoryMenu(Game game) throws IOException{ //menu to handle inventory changes and info viewing
        System.out.println("Inventory Menu");
        System.out.println();
        System.out.println("1. Inventory Info");
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        System.out.println();
        switch(input){
            case 1: game.getWorldState().printInventoryState();
            System.out.println();
            new InventoryMenu(game);
            break;
            case 0: game.display();
            break;
            default: new InventoryMenu(game);
        }
        System.out.println();
    }
}
