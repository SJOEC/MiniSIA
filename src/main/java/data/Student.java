package data;

import data.*;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private Schedule schedule;
    private List<Grade> grades = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();
    private List<Degree> degrees = new ArrayList<>();

    // region Constructors
    public Student(){
        this.setId((long) -1);
        this.setUser("UNDEFINED");
        this.setName("UNDEFINED");
        this.setSchedule(null);
        this.setGrades(null);
        this.setGroups(null);
        this.setDegrees(null);
    }

    public Student(long id, String user, String name,
                   Schedule s, ArrayList<Grade> grades,
                   ArrayList<Group> groups, ArrayList<Degree> degrees) {

        this.setId(id);
        this.setUser(user);
        this.setName(name);
        this.setSchedule(s);
        this.setGrades(grades);
        this.setGroups(groups);
        this.setDegrees(degrees);
    }
    // endregion

    // region other methods

    @Override
    public String toString(){
         List<Degree> degrees = getDegrees();
         ArrayList<String> degreesNames = new ArrayList<>();
         for (Degree actualDegree: degrees){
             degreesNames.add(actualDegree.getName());
         }
         String stringData = String.format("""
                            --------------------
                            ID: %d
                            Name: %s
                            Grades: %s
                            Degrees: %s
                            --------------------
                            """, getId(), getName(), getGrades(), degreesNames);

        return stringData;
    }

    // endregion

    // region Getters and Setters
    public Schedule getSchedule() { return this.schedule; }
    public void setSchedule(Schedule schedule) { this.schedule = schedule; }

    public List<Grade> getGrades(){ return this.grades; }
    public void setGrades(List<Grade> grades){ this.grades = grades; }

    public List<Group> setGroups(){ return this.groups; }
    public void setGroups(List<Group> groups){ this.groups = groups; }

    public List<Degree> getDegrees(){ return this.degrees; }
    public void setDegrees(ArrayList<Degree> degrees){ this.degrees = degrees;}
    // endregion

}



