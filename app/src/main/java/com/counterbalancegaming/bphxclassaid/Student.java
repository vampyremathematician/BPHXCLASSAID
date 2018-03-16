package com.counterbalancegaming.bphxclassaid;

/**
 * Created by Nicholas on 3/13/2018.
 */

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private HashMap<Integer, Data> studentData = new HashMap<Integer, Data>();

    public Student(String first, String last, String id) {
        setFirstName(first);
        setLastName(last);
        setID(id);
    }

    public void newDay(int day, int month, int year) {
        int dateKey = Integer.parseInt(""+ year + month + day);
        Data dateData = new Data();
        studentData.put(dateKey, dateData);
    }

    public void absent(int year, int month, int day) {
        int dateKey = Integer.parseInt(""+ year + month + day);
        if(studentData.containsKey(dateKey)) {
            Data editData = studentData.get(dateKey);
            editData.absentToTrue();
            studentData.put(dateKey, editData);
        }
    }

    public void homework(int day, int month, int year) {
        int dateKey = Integer.parseInt(""+ year + month + day);
        if(studentData.containsKey(dateKey)) {
            Data editData = studentData.get(dateKey);
            editData.homeworkToTrue();
            studentData.put(dateKey, editData);
        }
    }

    public void participation(int day, int month, int year) {
        int dateKey = Integer.parseInt(""+ year + month + day);
        if(studentData.containsKey(dateKey)) {
            Data editData = studentData.get(dateKey);
            editData.participationToTrue();
            studentData.put(dateKey, editData);
        }
    }

    public void ticket(int day, int month, int year) {
        int dateKey = Integer.parseInt(""+ year + month + day);
        if(studentData.containsKey(dateKey)) {
            Data editData = studentData.get(dateKey);
            editData.ticketToTrue();
            studentData.put(dateKey, editData);
        }
    }

    public String printData() {

        String s = "";
        for(Map.Entry<Integer, Data> entry : studentData.entrySet()) {
            Integer key = entry.getKey();
            Data value = entry.getValue();


            s = s + ""+key+" "+ value.getAbsentAsString()+" "+value.getHomeworkAsString()+ " "+value.getParticipationAsString()+" "+value.getTicketAsString()+"\n";


        }

        return s;
    }




    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setFirstName (String first) {
        this.firstName = first;
    }

    private void setLastName (String last) {
        this.lastName = last;
    }

    private void setID (String id) {
        this.studentID = id;
    }

    public int getDataSize() {
        return studentData.size();
    }
}
