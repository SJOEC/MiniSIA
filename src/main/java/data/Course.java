package data;

import java.util.ArrayList;

public class Course {
    private int number;
    private String name;
    private ArrayList<Group> groups;
    private ArrayList<Degree> degrees;

    // region Constructors
    public Course() {
        this.setNumber(-1);
        this.setName("UNDEFINED");
        this.setGroups(null);
        this.setDegrees(null);
    }
    public Course(int n, String name, ArrayList<Group> groups, ArrayList<Degree> degrees){
        this.setNumber(n);
        this.setName(name);
        this.setGroups(groups);
        this.setDegrees(degrees);
    }
    // endregion

    // region otherMethods
    @Override
    public String toString() {

         String stringData = String.format("""
                        Course Info
        
                        ID: %d
                        Name: %s
                        Groups: %s
                        Degree: %s
                        
                        """, getNumber(), getName(), getGroups(), getDegrees());

        return stringData;
    }

    // endregion


    // region Getters and Setters
    public int getNumber(){ return this.number; }
    public void setNumber(int number){ this.number = number; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public ArrayList<Group> getGroups(){ return this.groups; }
    public void setGroups(ArrayList<Group> groups){ this.groups = groups; }

    public ArrayList<Degree> getDegrees(){ return this.degrees; }
    public void setDegrees(ArrayList<Degree> degrees){ this.degrees = degrees; }
    // endregion
}
