package com.counterbalancegaming.bphxclassaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class ClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);


        Intent intent = getIntent();



        TextView seat1 = (TextView) findViewById(R.id.seat1);

        Class firstHour = new Class("0PA-6Sr","0 - PreAlgebra - 6Sr");
        firstHour.addStudent(1,"Rhea","Rajesh");
        seat1.setText(firstHour.getName(1));
    }

    /**
     * Created by Nicholas on 3/15/2018.
     */

    public static class Roster {
        String rosterName;
        private HashMap<Integer, Student> roster = new HashMap<Integer, Student>();

        public Roster(String name) {
            setRosterName(name);
        }

        public void addStudentToRoster(String first, String last, int seat) {
            String id = String.format("%03d", getRosterSize());
            id = first.charAt(0)+last.charAt(0) + id ;
            Student addStudent = new Student(first, last, id);
            roster.put(seat, addStudent);
        }

        public int getRosterSize() {
            return roster.size();
        }

        private void setRosterName (String name) {
            this.rosterName = name;
        }

        public void newDay() {
            for(Map.Entry<Integer, Student> entry : roster.entrySet()) {
                Integer key = entry.getKey();
                Student value = entry.getValue();

                value.newDay(15, 3, 2018);
                roster.put(key, value);
            }

        }

        public void newDay2() {
            for(Map.Entry<Integer, Student> entry : roster.entrySet()) {
                Integer key = entry.getKey();
                Student value = entry.getValue();

                value.newDay(16, 3, 2018);
                roster.put(key, value);
            }

        }

        public void newDay3() {
            for(Map.Entry<Integer, Student> entry : roster.entrySet()) {
                Integer key = entry.getKey();
                Student value = entry.getValue();

                value.newDay(17, 3, 2018);
                roster.put(key, value);
            }

        }

        public void absent(int key) {
            Student tempStudent = roster.get(key);
            tempStudent.absent(2018, 3, 17);
            roster.put(key,tempStudent);
        }

        public void printRoster() {

            for(Map.Entry<Integer, Student> entry : roster.entrySet()) {
                Integer key = entry.getKey();
                Student value = entry.getValue();

                System.out.println(value.getFirstName()+ " " + value.getLastName() + "\n"+ value.printData());

            }
        }



    }
}
