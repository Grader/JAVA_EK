package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scanner {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //String min1 = reader.readLine();
    //String max1 = reader.readLine();

    public String ask() throws IOException {
        return reader.readLine();
    }

    public String ask(String question) throws IOException {
        System.out.println(question);
        return reader.readLine();
    }


    public Scanner() throws IOException {
    }
}
