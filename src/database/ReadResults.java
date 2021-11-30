package database;


import results.Result;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadResults {
    ArrayList<Result> resultArrayList = new ArrayList<Result>();

  public ArrayList<Result> getMembers() {
        return resultArrayList;
    }

    public ArrayList<Result> setFile(){
        File membersFile = new File("resources/results.csv");
        String line = "";
        String[] membersArray = new String[6];
        int counter = 0;

        try {
            Scanner scanner = new Scanner(membersFile);
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                membersArray = line.split(";");

                if (counter == 0) {
                    counter++;

                }else {

                    String discipline = membersArray[0];
                    String memberName = membersArray[1];
                    int memberId = Integer.parseInt(membersArray[2]);
                    String location = membersArray[3];
                    String timeStamp = membersArray[4];
                    String tournament = membersArray[5];

                    Result result = new Result(discipline, memberName, memberId, location, timeStamp, tournament);
                    resultArrayList.add(result);
                    counter++;
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("fejl");
        }
        return resultArrayList;
    }

}

