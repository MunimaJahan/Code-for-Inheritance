package functionalinterface;

interface StringConcat {

    public String sconcat(String a, String b);
}
interface GetExp {

    public int result(int a, int b);
}
public class Example2 {

   public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
        
        GetExp r=(a, b)->a+b;
        System.out.println(r.result(5, 6));
    }
  
   
}