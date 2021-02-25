package comparator;

import java.util.Comparator;
public class StudentIDComparator implements Comparator<Student>{
  public int compare(Student one, Student two){
    return one.getID()-two.getID();
  }
}