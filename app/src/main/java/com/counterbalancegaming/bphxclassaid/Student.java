package com.counterbalancegaming.bphxclassaid;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Nicholas on 3/13/2018.
 */

public class Student {
    private String name;
    private ArrayList<String> date = new ArrayList<String>();
    private ArrayList<Boolean> absent = new ArrayList<Boolean>();
    private ArrayList<Boolean> homework = new ArrayList<>();
    private ArrayList<Boolean> participation = new ArrayList<>();
    private ArrayList<Boolean> exitTicket = new ArrayList<>();
    private int seat;
    private int studentClassID;


    //Constructors

    public Student(String newName, int newSeat){
        setName(newName);
        setSeat(newSeat);
    }

    public void startDay(){

        newDay();
        newAbsent();
        newHomework();
        newParticipation();
        newExitTicket();
    }

    private void newDay(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = df.format(c);
        date.add(formattedDate);
    }

    private void newAbsent(){
        absent.add(false);
    }

    private void newHomework(){
        homework.add(false);
    }

    private void newParticipation(){
        participation.add(false);
    }

    private void newExitTicket(){
        exitTicket.add(false);
    }

    //Mutators

    //Setters

    private void setName(String setName){
        this.name = setName;
    }

    private void setSeat(int setSeat) {
        this.seat = setSeat;
    }

    //Getters

    private int getSeat(){
        return this.seat;
    }
}
