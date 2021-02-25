package Interface;

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    ArrayList<Speak> farm = new ArrayList<>();
    farm.add(new Cow());
    farm.add(new Horse());
    farm.add(new Dog());
    for(Speak animal: farm){
      System.out.println(String.format("%s says %s!",animal.getClass(),animal.says()));
    }
  }
}