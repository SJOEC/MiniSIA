package data;

import data.*;

import java.util.ArrayList;

public class Student extends Person {

    private Schedule schedule;
    private ArrayList<Grade> grades;
    private ArrayList<Group> groups;
    private ArrayList<Degree> degrees;

    // region Constructors
    public Student(){
        this.setId((long) -1);
        this.setUser("UNDEFINED");
        this.setFirstName("UNDEFINED");
        this.setLastName("UNDEFINED");
        this.setSchedule(null);
        this.setGrades(null);
        this.setGroups(null);
        this.setDegrees(null);
    }

    public Student(long id, String user, String firstName, String lastName,
                   Schedule s, ArrayList<Grade> grades, ArrayList<Group> groups, ArrayList<Degree> degrees) {

        this.setId(id);
        this.setUser(user);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSchedule(s);
        this.setGrades(grades);
        this.setGroups(groups);
        this.setDegrees(degrees);
    }
    // endregion

    // region other methods

    @Override
    public String toString(){
         String stringData = String.format("""
                            Student Info
            
                            ID: %d
                            Name: %s %s
                            Grades: %s
                            Degrees: %s
                            
                            """, getId(), getFirstName(), getLastName(), getGrades(), getDegrees());

        return stringData;
    }

    // endregion

    // region Getters and Setters
    public Schedule getSchedule() { return this.schedule; }
    public void setSchedule(Schedule schedule) { this.schedule = schedule; }

    public ArrayList<Grade> getGrades(){ return this.grades; }
    public void setGrades(ArrayList<Grade> grades){ this.grades = grades; }

    public ArrayList<Group> setGroups(){ return this.groups; }
    public void setGroups(ArrayList<Group> groups){ this.groups = groups; }

    public ArrayList<Degree> getDegrees(){ return this.degrees; }
    public void setDegrees(ArrayList<Degree> degrees){ this.degrees = degrees;}
    // endregion

}



