package data;

public class Grade {
    private double grade;

    // region Constructors

    public Grade(){
        this.setGrade(-1);
    }

    public Grade(int grade){
        this.setGrade(grade);
    }

    // endregion

    // region other methods
    @Override
    public String toString(){
        return String.format("""
                Grade Info
                
                Grade: %f
                
                """, getGrade());
    }
    // endregion

    // region getters and setters
    public double getGrade(){return this.grade;}
    public void setGrade(double grade){this.grade = grade;}
    // endregion
}
