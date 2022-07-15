package PlanetColonyGame;
import java.io.*;

public class Methods {
    public String receiveInputString() throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        return input;
    }
    public int receiveInputInt() throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        int i = Integer.parseInt(input);
        return i;
    }
}
