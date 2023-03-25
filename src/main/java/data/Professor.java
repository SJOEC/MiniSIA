package data;

import data.Group;
import data.Person;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {
    List<Group> groups = new ArrayList<>();

    // region Constructors

    public Professor(){
        this.setId((long) -1);
        this.setUser("UNDEFINED");
        this.setName("UNDEFINED");
        this.setGroups(null);
    }

    public Professor(long id, String user, String name, ArrayList<Group> groups) {
        this.setId(id);
        this.setUser(user);
        this.setName(name);
        this.setGroups(groups);
    }
    // endregion

    // region other methods
    @Override
    public String toString(){
        List<Group> groups = getGroups();
        ArrayList<String> groupsId = new ArrayList<>();
        for (Group actualGroup : groups){
            groupsId.add(String.valueOf(actualGroup.getNumber()));
        }
        return String.format("""
                --------------------
                ID: %d
                Name: %s
                Groups: %s
                --------------------
                """, getId(), getName(), groupsId);
    }
    // endregion

    // region Getters and Setters
    public List<Group> getGroups(){ return this.groups; }
    public void setGroups(List<Group> groups){ this.groups = groups; }
    // endregion
}

