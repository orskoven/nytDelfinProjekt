import database.ReadResults;
import database.WriteResults;
import results.Result;

import java.util.Arrays;

public class DelfinenApp {

    public static void main(String[] args) {
        WriteResults.writerToFile(Result.writeToCsv());
        for (int i = 0; i < new ReadResults().setFile().size(); i++) {
            System.out.println(new ReadResults().setFile().get(i));
        }
    }
}
