package logic;

import UI.UI;
import data.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        // region Students data

        // student joe data
        Schedule joeSchedule = new Schedule();
        ArrayList<Grade> joeGrades = new ArrayList<>();
        ArrayList<Group> joeGroups = new ArrayList<>();
        ArrayList<Degree> joeDegrees = new ArrayList<>();

        Student joe = new Student(1, "jcanelo", "Yanfri Antonio Perez",
                joeSchedule, joeGrades, joeGroups, joeDegrees);

        // student forero data
        Schedule foreroSchedule = new Schedule();
        ArrayList<Grade> foreroGrades = new ArrayList<>();
        ArrayList<Group> foreroGroups = new ArrayList<>();
        ArrayList<Degree> foreroDegrees = new ArrayList<>();

        Student forero = new Student(2, "juanfg", "Juan David Hastamorir",
                foreroSchedule, foreroGrades, foreroGroups, foreroDegrees);

        // endregion

        // region professors data

        // professor Edimber data
        ArrayList<Group> edimberGroups = new ArrayList<>();

        Professor edimber = new Professor(1,"edimberfa",
                "Edimber Elfamoso Gonzalez", edimberGroups);

        // professor Francisco data
        ArrayList<Group> franciscoGroups = new ArrayList<>();

        Professor francisco = new Professor(2,"francisol",
                "Francisco Elmatematico Perez", franciscoGroups);

        // endregion

        // region degrees data

        // computer science data
            ArrayList<Course> csCourses = new ArrayList<>();
            ArrayList<Student> csStudents = new ArrayList<>();

            Degree computerScience = new Degree(106341, "Ciencias de la computacion",
                    csCourses, csStudents);

        // economy data
                ArrayList<Course> ecCourses = new ArrayList<>();
                ArrayList<Student> ecStudents = new ArrayList<>();

                Degree economy = new Degree(18, "Economia",
                        ecCourses, ecStudents);

        // endregion

        // region Courses data

        // POO course data

        ArrayList<Group> pooGroups = new ArrayList<>();
        ArrayList<Degree> pooDegrees = new ArrayList<>();

        Course poo = new Course(101, "Programación orientada a objetos",
                pooGroups, pooDegrees);

        // Math course data

        ArrayList<Group> mathGroups = new ArrayList<>();
        ArrayList<Degree> mathDegrees = new ArrayList<>();

        Course math = new Course(101, "Programación orientada a objetos",
                mathGroups, mathDegrees);

        // endregion

        // region group data

        // POO1 group data

        String[] DAYSPOO1 = {"lunes", "Martes"};
        String[] TODPOO1 = {"7:00 - 9:00"};

        ArrayList<Student> poo1Students = new ArrayList<>();

        Group poo1 = new Group(1, DAYSPOO1, TODPOO1,
                "1", poo, poo1Students, edimber);

        // math group data

        String[] DAYSMATH1 = {"Miercoles", "Viernes"};
        String[] TODMATH1 = {"10:00 - 12:00"};

        ArrayList<Student> math1Students = new ArrayList<>();

        Group math1 = new Group(1, DAYSMATH1, TODMATH1,
                "1", math, math1Students, francisco);

        // endregion


        int option;

        UI.sayHello();
        UI.printMenu();

        do {
            option = UI.select();

            if (option == 1){
                System.out.println(joe);
                System.out.println(forero);
                UI.printMenu();

            }
            else if (option == 2) {
                System.out.println(edimber);
                System.out.println(francisco);
                UI.printMenu();

            } else if (option == 3) {
                ArrayList<String> degrees = new ArrayList<>();
                degrees.add(computerScience.getName());
                degrees.add(economy.getName());

                for (String actualdegree : degrees ){

                    System.out.println("- " + actualdegree);
                }

                UI.printMenu();

            } else if (option == 4) {
                System.out.println(poo);
                System.out.println("Grupos disponibles: \n" + poo1);

                System.out.println(math);
                System.out.println("Grupos disponibles: \n" + math1);

                UI.printMenu();

            } else if (option == 5){

                UI.printExit();
            }
        }
        while (option != 5);
    }
}
