package PlanetColonyGame.Colonists.Jobs;

import java.io.IOException;

import PlanetColonyGame.*;

public class JobsMenu {
    public JobsMenu(Game game) throws IOException{ //menu to handle job changes and info viewing
        System.out.println("Jobs Menu");
        System.out.println();
        System.out.println("0. Back");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
        int input = new Methods().receiveInputInt();
        switch(input){
            case 0: game.display();
            break;
            default: new JobsMenu(game);
        }
        System.out.println();
    }
}
