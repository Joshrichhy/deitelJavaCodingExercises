package MyDiaryApp;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime date ;
    private int IDnumber;

    public Entry(String title, int IDnumber) {
        this.title = title;
        this.IDnumber = IDnumber;
        this.body = body;
        date = LocalDateTime.now();
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void writeIntoMyEntry(String body) {
       this.body = body;

    }

    public void setIDnumber(int number){
        this.IDnumber = number;

    }

    public int getId() {
        return IDnumber;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, hh:mma");

          return dateTimeFormatter .format(date);

    }
    public String toString(){
        return String.format("""
                        Entry Date: %s
                        Entry ID: %s
                        Entry Title: %s
                        Entry Body: %s
                        
                        """,
               date,  IDnumber, title, body);
    }

    public String getbody() {
        return body;
    }

}
