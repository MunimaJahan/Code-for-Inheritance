package comparator;

public class Student implements Comparable<Student>{
  enum Grade{ APLUS, A, AMINUS, BPLUS, B, BMINUS, CPLUS, C, CMINUS, DPLUS, D, F};
  private String name;
  private Grade grade;
  private int id;
  public Student(String name, Grade grade, int id){
    this.name = name;
    this.grade = grade;
    this.id = id;
  }
  @Override
  public String toString(){
    return String.format("Student[name=%s,grade=%s,id=%s]",name,grade,id);
  }
  public int getID(){
    return id;
  }
  @Override
  public int compareTo(Student other){
    int cmp = -grade.compareTo(other.grade);
    if(cmp != 0){
      return cmp;
    }
    return name.compareTo(other.name);
  }
  public String getName() {
	  return name;
  }
}