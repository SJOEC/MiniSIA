package data;

public class Person {

    private Long id;
    private String user;
    private String firstName;
    private String lastName;

    // region Constructors


    // endregion

    // region Getters and Setters
    public Long getId(){ return this.id; }
    public void setId (Long id){ this.id = id; }

    public String getUser(){ return this.user; }
    public void setUser(String user){ this.user = user; }

    public String getFirstName(){ return this.firstName; }
    public void setFirstName(String firstName){ this.firstName = firstName; }

    public String getLastName(){ return this.lastName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    // endregion

}
