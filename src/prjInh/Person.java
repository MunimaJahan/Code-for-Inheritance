package prjInh;

public class Person {
 String name;
 int age;

public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
public Person() {
	this.name="";
	this.age=0;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
}
