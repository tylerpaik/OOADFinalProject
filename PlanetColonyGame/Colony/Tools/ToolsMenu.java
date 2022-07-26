package PlanetColonyGame.Colony.Tools;

import java.io.IOException;

import PlanetColonyGame.*;

public class ToolsMenu {
    public ToolsMenu(Game game) throws IOException{ //menu to handle tool changes and info viewing
        System.out.println("Tools Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        switch(input){
            case 0: game.display();
            break;
            default: new ToolsMenu(game);
        }
        System.out.println();
    }
}
