package data;

import data.Group;
import data.Person;

import java.util.ArrayList;

public class Professor extends Person {
    ArrayList<Group> groups;

    // region Constructors
        public Professor(){
        this.setId((long) -1);
        this.setUser("UNDEFINED");
        this.setFirstName("UNDEFINED");
        this.setLastName("UNDEFINED");
        this.setGroups(null);
    }
    public Professor(long id, String user, String firstName, String lastName, ArrayList<Group> groups) {
        this.setId(id);
        this.setUser(user);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGroups(groups);
    }

    // endregion

    // region other methods
    @Override
    public String toString(){
        return String.format("""
                Professor Info

                ID: %d
                Name: %s %s
                Groups: %s
                
                """, getId(), getFirstName(), getLastName(), getGroups());
    }
    // endregion

    // region Getters and Setters
    public ArrayList<Group> getGroups(){ return this.groups; }
    public void setGroups(ArrayList<Group> groups){ this.groups = groups; }
    // endregion
}
