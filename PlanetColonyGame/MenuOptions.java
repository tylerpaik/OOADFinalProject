package PlanetColonyGame;

import java.io.IOException;

public class MenuOptions {
    protected void newGame() throws IOException{
        Game game = new Game();
    }
    protected void saveGame(Game game) throws IOException{
        System.out.println("Current game has been saved.");
        game.day--;
        Menu menu = new Menu(game);
    }
    protected void loadGame(Game game) throws IOException{
        System.out.println("Current game has been loaded.");
        Game g = new Game(game);
    }
    protected void cheatCodes() throws IOException{
        System.out.println("Enter cheat code:");
        Methods m = new Methods();
        String s = m.receiveInputString();
        if(s == "abc"){
            System.out.println("Cheated!");
        }
        Menu menu = new Menu();
    }
    protected void credits(Game game) throws IOException{
        System.out.println("This game was made by Joseph Davis and Tyler Paik for OOAD, CSCI 4448 at CU Boulder");
        Menu menu = new Menu(game);
    }
    protected void quitGame(Game game){
        System.out.println("Thanks for playing!");
        game.day = -100;
    }
}
