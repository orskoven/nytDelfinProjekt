package results;

import database.WriteResults;

import java.awt.*;
import java.util.Scanner;

public class Result {
    private Scanner scanner = new Scanner(System.in);
    private String disciplineName;
    private String nameOfMember;
    private int memberId;
    private String locationName;
    private String tournamentName;
    private String timestamp;

    public Result(String disciplineName, String nameOfMember, int memberId, String locationName
            , String timestamp, String tournamentName) {
        this.disciplineName = disciplineName;
        this.nameOfMember = nameOfMember;
        this.memberId = memberId;
        this.locationName = locationName;
        this.timestamp = timestamp;
        this.tournamentName = tournamentName;
    }

    private String getDisciplineName() {
        System.out.println("Press the follwing numbers for a discipline:\n1 ‣ Butterfly" +
                "\n2 ‣ Breast Stroke\n3 ‣ Crawl\n4 ‣ Back Crawl");
        int disciplineChoice = scanner.nextInt();
        switch (disciplineChoice) {
            case 1:
                disciplineName = "Butterfly";
                break;
            case 2:
                disciplineName = "Breast Stroke";
                break;
            case 3:
                disciplineName = "Crawl";
                break;
            case 4:
                disciplineName = "Back Crawl";
                break;
            default:
                break;
        }
        return disciplineName;
    }

    private void getTimestamp() {
        System.out.println("Please enter the time of the tournament: (dd-mm-yyyy)");
        timestamp = scanner.next();
    }

    public static String writeToCsv() {
        getDisciplineName();
        getTimestamp();
        return toStringCsv();
    }


    private String toStringCsv() {
        return disciplineName + ";" +
                nameOfMember + ";" +
                memberId + ";" +
                locationName + ";" +
                timestamp + ";" +
                tournamentName;


    }

    @Override
    public String toString() {
        return "results.Result{" +
                "scanner=" + scanner +
                ", disciplineName='" + disciplineName + '\'' +
                ", nameOfMember='" + nameOfMember + '\'' +
                ", memberId=" + memberId +
                ", locationName='" + locationName + '\'' +
                ", tournamentName='" + tournamentName + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}