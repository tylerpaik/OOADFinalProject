package PlanetColonyGame.MenuScreen;
import java.io.IOException;
import PlanetColonyGame.Methods;

public class Menu {
    Menu() throws IOException{
        Methods m = new Methods();
        display();
        int i = m.receiveInputInt();
        menuActions(i);
    }

    private void display(){
        System.out.println("Menu:");
        System.out.println("1. New Game");
        System.out.println("2. Save Game");
        System.out.println("3. Load Game");
        System.out.println("4. Cheat Codes");
        System.out.println("5. Credits");
        System.out.println("6. Quit Game");
    }

    private void menuActions(int i){
        MenuOptions options = new MenuOptions();
        switch(i){
            case 1: options.newGame();
            break;
            case 2: options.saveGame();
            break;
            case 3: options.loadGame();
            break;
            case 4: options.cheatCodes();
            break;
            case 5: options.credits();
            break;
            case 6: options.quitGame();
            break;
        }
    }
}
