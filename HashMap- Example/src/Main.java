import java.util.HashMap;
import java.util.Map;

public class
Main { public static void main(String[] args) {
    Map<String, Character> studentDivision = new HashMap<>();
    studentDivision.put("rutuja",'A');
    studentDivision.put("atharva",'B');
    studentDivision.put("anjali",'A');
    studentDivision.put("pravin",'B');
    studentDivision.put("kiran",'A');
    studentDivision.put("sakshi",'A');

    for (Map.Entry<String,Character>entry : studentDivision.entrySet()) {

        System.out.println("Student name : " + entry.getKey()  + "Student division : " + entry.getValue() );
    }
     }
   }