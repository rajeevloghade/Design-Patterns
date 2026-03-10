import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("Alice", "Computer Science", "A");
        SchoolStudent schoolStudent = new SchoolStudent("Bob", "10th Grade", "B");
        students.add(collegeStudent);
        students.add(new StudentAdaptor(schoolStudent));
        System.out.println(students);
    }
}
