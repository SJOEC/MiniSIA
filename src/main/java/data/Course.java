package data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int number;
    private String name;
    private List<Group> groups = new ArrayList<>();
    private List<Degree> degrees = new ArrayList<>();

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

        ArrayList<String> groupsNumbers = new ArrayList<>();
        ArrayList<String> degreesNames = new ArrayList<>();

        List<Group> tmpGroups = this.getGroups();
        List<Degree> tmpDegrees = this.getDegrees();

        // get groups data to String
        if (tmpGroups == null){
            groupsNumbers.add("UNDEFINED");
        }
        else {
            for (Group actualGroup : tmpGroups) {
                groupsNumbers.add(Integer.toString(
                        actualGroup.getNumber()));
            }
        }

        // get final groups
        String groups = String.join(",",groupsNumbers);

        // Get Degrees data to String
        if (tmpDegrees == null){
            degreesNames.add("UNDEFINED");
        }
        else {
            for (Degree actualDegree : tmpDegrees) {
                degreesNames.add(actualDegree.getName());
            }
        }
        // get final degrees names
        String degrees = String.join(",",degreesNames);


        return String.format("""
                        \n
                        Course Info
        
                        ID: %d
                        Name: %s
                        Groups: %s
                        Degree: %s
                        """, getNumber(), getName(), groups, degrees);
    }

    // endregion


    // region Getters and Setters
    public int getNumber(){ return this.number; }
    public void setNumber(int number){ this.number = number; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    public List<Group> getGroups(){ return this.groups; }
    public void setGroups(ArrayList<Group> groups){ this.groups = groups; }

    public List<Degree> getDegrees(){ return this.degrees; }
    public void setDegrees(ArrayList<Degree> degrees){ this.degrees = degrees; }
    // endregion
}
