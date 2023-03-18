package data;

public abstract class Person {

    private Long id;
    private String user;
    private String name;

    // region Constructors


    // endregion

    // region Getters and Setters
    public Long getId(){ return this.id; }
    public void setId (Long id){ this.id = id; }

    public String getUser(){ return this.user; }
    public void setUser(String user){ this.user = user; }

    public String getName(){ return this.name; }
    public void setName(String firstName){ this.name = firstName; }
    // endregion

}
