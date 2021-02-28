package comparator;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Carl", Student.Grade.CPLUS, 1));
    students.add(new Student("Alice", Student.Grade.A, 3));
    students.add(new Student("Bob", Student.Grade.B, 7));
    students.add(new Student("Bill", Student.Grade.BMINUS, 2));
    students.add(new Student("Bamford", Student.Grade.BMINUS, 0));
    students.add(new Student("Carol", Student.Grade.C, 6));
    System.out.println("unsorted "+ students);
    Collections.sort(students);
    System.out.println("natural ordering"+ students);
    Collections.sort(students);
    StudentIDComparator comp = new StudentIDComparator();
    Collections.sort(students, comp);
    System.out.println("id ordered "+ students);
    
    StudentNameComparator comp1=new StudentNameComparator();
    Collections.sort(students,comp1);
    System.out.println("Name ordered "+ students);
  }
}