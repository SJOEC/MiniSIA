package UI;

import data.Course;
import data.Professor;
import data.Student;

import java.util.Scanner;

public class UI {

    //region print objects
    public void printStudents(Student student){
        System.out.println(student);
    };

    public void printProfessor(Professor professor){
        System.out.println(professor);
    };

    public void printCourses(Course course){
        System.out.println(course);
    };

    // endregion

    public static void sayHello(){
        System.out.println("Bienvenid@ al sistema MiniSIA\n");
    };
    public static void printError() {
        System.out.println("La opción no es valida");
    };

    public static void printExit(){
        System.out.println("Saliendo...");
    }

    public static void printMenu(){System.out.println("Marque:\n1 para ver los estudiantes\n" +
            "2 para ver los profesores\n3 para ver la oferta academica\n4 para ver los cursos disponibles" +
            "\n5 para salir");
    };

    public static int select() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
            return option;
    }
}
