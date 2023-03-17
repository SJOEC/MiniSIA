package data;

import java.util.ArrayList;

public class Degree {
    private long id;
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    // region Constructors
    public Degree(){
     this.setId(-1);
     this.setName("UNDEFINED");
     this.setCourses(null);
     this.setStudents(null);
    }
    public Degree(long id, String name, ArrayList<Course> courses, ArrayList<Student> students){
        this.setId(id);
        this.setName(name);
        this.setCourses(courses);
        this.setStudents(students);
    }
    // endregion

    // region other methods

    @Override
    public String toString(){

        ArrayList<String> coursesName = new ArrayList<>();
        ArrayList<String> studentsNames = new ArrayList<>();

        ArrayList<Course> tmpCourses = this.getCourses();
        ArrayList<Student> tmpStudents = this.getStudents();


        for (Course actualCourse : tmpCourses){
            coursesName.add(actualCourse.getName());
        }
        // get final courses
        String courses = String.join(",", coursesName);


        for (Student actualStudent : tmpStudents){
            studentsNames.add(actualStudent.getName());
        }
        // get final students names
        String students = String.join(",", studentsNames);

        return String.format("""
                Degree Info:

                ID: %d
                Name: %s
                Courses: %s
                Students: %s
                
                """, getId(), students, courses, getStudents());
    }
    // endregion

    // region Getters and Setters
    public long getId(){ return this.id; }
    public void setId(long id){ this.id = id; }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name;}

    public ArrayList<Course> getCourses(){ return this.courses; }
    public void setCourses(ArrayList<Course> courses){ this.courses = courses; };

    public ArrayList<Student> getStudents(){ return this.students; }
    public void setStudents(ArrayList<Student> students){ this.students = students; }
    // endregion
}
