package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private int number;
    private String[] daysOfWeek;
    private String[] timesOfDay;
    private String semester;
    private Course course;
    private List<Student> students = new ArrayList<>();
    Professor professor;

    // region Constructors

    public Group(){
        this.setNumber(-1);
        this.setDaysOfWeek(null);
        this.setSemester("UNDEFINED");
        this.setCourse(null);
        this.setStudents(null);
    }
    public Group(int number,String[] daysOfWeek, String[] timesOfDay, String semester, Course course,
                 ArrayList<Student> students, Professor professor){
        this.setNumber(number);
        this.setDaysOfWeek(daysOfWeek);
        this.setTimesOfDay(timesOfDay);
        this.setSemester(semester);
        this.setCourse(course);
        this.setStudents(students);
        this.setProfessor(professor);
    }

    // endregion

    // region other methods
    @Override
    public String toString(){

        List<String> studentsNames = new ArrayList<>();

        List<Student> tmpStudents = this.getStudents();

        for (Student actualStudent : tmpStudents){
            studentsNames.add(actualStudent.getName());
        }

        // get final students names
        String students = String.join(",", studentsNames);

        return String.format("""
                Group Info

                ID: %d
                Days of week: %s
                Times of day: %s
                Semester: %s
                Course: %s
                Students: %s
                Professor: %s
                --------------------
                """, getNumber(), Arrays.toString(getDaysOfWeek()), Arrays.toString(getTimesOfDay()), getSemester(),
                getCourse().getName(), students, getProfessor().getName());
    }
    // endregion

    // region Getters and Setters
    public int getNumber(){ return this.number; }
    public void setNumber(int number){ this.number = number; }

    public String[] getDaysOfWeek(){ return this.daysOfWeek; }
    public void setDaysOfWeek(String[] daysOfWeek){ this.daysOfWeek = daysOfWeek; }

    public String[] getTimesOfDay(){ return this.timesOfDay; }
    public void  setTimesOfDay(String[] timesOfDay){ this.timesOfDay = timesOfDay; }

    public String getSemester(){ return this.semester; }
    public void setSemester(String semester){ this.semester = semester; }

    public Course getCourse(){ return this.course; }
    public void setCourse(Course course){ this.course = course; }

    public List<Student> getStudents(){ return this.students; }
    public void setStudents(ArrayList<Student> students){ this.students = students; }

    public Professor getProfessor(){ return this.professor; }
    public void setProfessor(Professor professor){ this.professor = professor; }
    // endregion
}
