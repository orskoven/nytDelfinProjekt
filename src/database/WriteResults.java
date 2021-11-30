package database;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteResults {

  public WriteResults() {
    }

    public static void writerToFile(String resultData){
        try {
            Writer w = new FileWriter("resources/results.csv", true);
            w.write(resultData);
            w.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

