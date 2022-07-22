package PlanetColonyGame;

import java.io.IOException;

public class MenuOptions {
    protected void newGame(){
        Game game = new Game();
    }
    protected void saveGame() throws IOException{
        System.out.println("Save system has not been implemented.");
        Menu menu = new Menu();
    }
    protected void loadGame() throws IOException{
        System.out.println("Load system has not been implemented.");
        Menu menu = new Menu();
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
    protected void credits() throws IOException{
        System.out.println("This game was made by Joseph Davis and Tyler Paik for OOAD, CSCI 4448 at CU Boulder");
        Menu menu = new Menu();
    }
    protected void quitGame(){
        System.out.println("Thanks for playing!");
    }
}
