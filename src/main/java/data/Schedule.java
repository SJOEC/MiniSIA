package data;

import java.util.Arrays;

public class Schedule {
    private String[] courses;
    private String[] daysOfWeek;
    private String[] timesOfDay;
    private Student student;

    // region Constructors

    public Schedule(){
        this.setCourses(null);
        this.setDaysOfWeek(null);
        this.setTimesOfDay(null);
        this.setStudent(null);
    }

    public Schedule(String[] courses, String[] daysOfWeek, String[] timesOfDay, Student student){
        this.setCourses(courses);
        this.setDaysOfWeek(daysOfWeek);
        this.setTimesOfDay(timesOfDay);
        this.setStudent(student);
    }

    // endregion

    // region other methods
    @Override
    public String toString(){
        return String.format("""
                Schedule Info

                Courses: %s
                Days Of Week: %s
                Times of day: %s
                Student: %s
                
                """, Arrays.toString(getCourses()), Arrays.toString(getDaysOfWeek()),
                Arrays.toString(getTimesOfDay()), getStudent());
    }

    // endregion

    // region Getters and Setters
    public String[] getCourses(){return this.courses;}
    public void setCourses(String[] courses){this.courses = courses;}

    public String[] getDaysOfWeek(){return this.daysOfWeek;}
    public void setDaysOfWeek(String[] daysOfWeek){this.daysOfWeek = daysOfWeek;}

    public String[] getTimesOfDay(){return timesOfDay;}
    public void setTimesOfDay(String[] timesOfDay){ this.timesOfDay = timesOfDay; }

    public Student getStudent(){ return this.student; }
    public void setStudent(Student student){ this.student = student; }

    // endregion
}
