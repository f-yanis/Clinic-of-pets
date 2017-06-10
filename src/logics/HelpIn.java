package logics;

import java.io.*;

public class HelpIn {

    public static String step(String text) {
        String step = null;

        System.out.print(text);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            step = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return step;
    }
}
