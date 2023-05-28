import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1999, 4.5, "Nowak"));
        students.add(new Student(1998, 4.2, "Kowalski"));
        students.add(new Student(2000, 3.8, "Mazur"));
        students.add(new Student(1999, 3.8, "Waza"));
        students.add(new Student(1999, 3.8, "Adamski"));
        students.add(new Student(1999, 3.4, "Mazur"));
        students.add(new Student(1999, 3.2, "Mazur"));
        students.add(new Student(1999, 4.94, "Jankowski"));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.getRocznik() + " " + student.getSrednia() + " " + student.getNazwisko());
        }
    }
}