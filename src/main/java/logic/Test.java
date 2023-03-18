package logic;

import UI.UI;
import data.*;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        // region Students data
            // region student joe data
            Schedule joeSchedule = new Schedule();
            ArrayList<Grade> joeGrades = new ArrayList<>();
            ArrayList<Group> joeGroups = new ArrayList<>();
            ArrayList<Degree> joeDegrees = new ArrayList<>();

            Student joe = new Student(1, "jcanelo", "Yanfri Antonio Perez",
                    joeSchedule, joeGrades, joeGroups, joeDegrees);
            // endregion

            // region student forero data
            Schedule foreroSchedule = new Schedule();
            ArrayList<Grade> foreroGrades = new ArrayList<>();
            ArrayList<Group> foreroGroups = new ArrayList<>();
            ArrayList<Degree> foreroDegrees = new ArrayList<>();

            Student forero = new Student(2, "juanfg", "Juan David Hastamorir",
                    foreroSchedule, foreroGrades, foreroGroups, foreroDegrees);
            // endregion
        // endregion

        // region professors data
            // region professor Edimber data
            ArrayList<Group> edimberGroups = new ArrayList<>();

            Professor edimber = new Professor(1,"edimberfa",
                    "Edimber Elfamoso Gonzalez", edimberGroups);

            // endregion

            // region professor Francisco data
            ArrayList<Group> franciscoGroups = new ArrayList<>();

            Professor francisco = new Professor(2,"francisol",
                    "Francisco Elmatematico Perez", franciscoGroups);
            // endregion
        // endregion

        // region courses data
            //TODO create courses
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
                System.out.println();
                // TODO print courses names

            } else if (option == 4) {
                UI.printExit();
            }
        }
        while (option != 4);
    }
}
