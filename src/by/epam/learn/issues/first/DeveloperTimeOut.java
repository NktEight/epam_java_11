package by.epam.learn.issues.first;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeveloperTimeOut {
    String surname;
    Date startIssue;
    Date endIssue;

    public DeveloperTimeOut(String surname, Date startIssue, Date endIssue) {
        this.surname = surname;
        this.startIssue = startIssue;
        this.endIssue = endIssue;
    }

    @Override
    public String toString() {
        return "DeveloperTimeOut{" +
                "surname='" + surname + '\'' +
                ", startIssue=" + startIssue +
                ", endIssue=" + endIssue +
                '}';
    }

    public static void main(String[] args) {
        Date startIssue;
        try {
            startIssue = new SimpleDateFormat("dd.mm.yyyy").parse("21.01.2022");
            System.out.println(new DeveloperTimeOut("Medvedev", startIssue, new Date()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
//        System.out.println(Date.from(Instant));
    }
}
