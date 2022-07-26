package PlanetColonyGame;
import java.io.IOException;

public class Menu {
    Menu() throws IOException{
        Methods m = new Methods();
        display();
        int i = m.receiveInputInt();
        System.out.println();
        menuActions(i, null);
    }
    Menu(Game game) throws IOException{
        Methods m = new Methods();
        display();
        int i = m.receiveInputInt();
        System.out.println();
        menuActions(i, game);
    }

    private void display(){
        System.out.println();
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1. New Game");
        System.out.println("2. Save Game");
        System.out.println("3. Load Game");
        System.out.println("4. Cheat Codes");
        System.out.println("5. Credits");
        System.out.println("6. Quit Game");
        System.out.println();
        System.out.println("Enter corresponding number:");
        System.out.println();
    }

    private void menuActions(int i, Game game) throws IOException{
        MenuOptions options = new MenuOptions();
        switch(i){
            case 1: options.newGame();
            break;
            case 2: options.saveGame(game);
            break;
            case 3: options.loadGame(game);
            break;
            case 4: options.cheatCodes();
            break;
            case 5: options.credits();
            break;
            case 6: options.quitGame();
            break;
            default: Menu m = new Menu(null);
        }
    }
}
