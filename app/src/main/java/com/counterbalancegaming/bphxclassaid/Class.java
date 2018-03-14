package com.counterbalancegaming.bphxclassaid;

import java.util.ArrayList;

/**
 * Created by Nicholas on 3/13/2018.
 */

public class Class {
    private String classID;
    private String className;
    private ArrayList<Student> roster = new ArrayList<Student>();

    public void addStudent(Student s){
        roster.add(s);
    }
}
