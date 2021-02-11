
import java.util.InputMismatchException;
import java.util.Scanner;


public class Practisequestion {
    String q1;
    String q2;
    String q3;
    String q4;
    String q5;
       
    Practisequestion(String a,String b,String c,String d,String e){
     String q1=a;
     String q2=b;
     String q3=c;
     String q4=d;
     String q5=e;
    }
    String aa(){
         String a = null;
        try {

            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        return null;
    }
    String bb(){
         Scanner sc = new Scanner(System.in);
        try {
            int d = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        return null;
    }
    String cc(){
         try {
             Scanner sc = new Scanner(System.in);
             int c = Integer.parseInt("21abc");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
         return null;
    }
     
}
