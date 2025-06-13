/*
    ***********************User Input*********************
    Java has a Scanner Class to read data from the keyboard
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    System.in-----> Read from the keyboard
    sc -----> obj of Scanner class
*/
import java.util.Scanner;
public class UserInput {
   public static void main(String[] args) {
    // System.out.println("Enter Your Age: ");
    // Scanner obj = new Scanner(System.in);
    // int age = obj.nextInt(); 
    // System.out.println("Your Age Is: ");
    // System.out.println(age);
    // String fullName = obj.next();
    // String fullName = obj.nextLine();
    // System.out.println("Your Name Is: ");
    // System.out.println(fullName);

    System.out.println("Calculate Your Result ");
    float totalMarks = 510;

    System.out.println("Enter Your 7 Subject Marks");
    Scanner m = new Scanner(System.in);
    
    float sub1;
    while (true) {
        System.out.print("English : ");
        sub1 = m.nextFloat();
        if (sub1 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
        
    }
   
    float sub2;
    while (true) {
        System.out.print("Urdu : ");
        sub2 = m.nextFloat();
        if (sub2 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }

    float sub3;
    while (true) {
        System.out.print("Mathematics : ");
        sub3 = m.nextFloat();
        if (sub3 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }
    

    float sub4;
    while (true) {
        System.out.print("Social Studies : ");
        sub4 = m.nextFloat();
        if (sub4 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }

    float sub5;
    while (true) {
        System.out.print("Islamyat : ");
        sub5 = m.nextFloat();
        if (sub5 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }

    float sub6;
    while (true) {
        System.out.print("Computer : ");
        sub6 = m.nextFloat();
        if (sub6 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }

    float sub7;
    while (true) {
        System.out.print("Physics : ");
        sub7 = m.nextFloat();
        if (sub7 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }

    float sub8;
    while (true) {
        System.out.print("Chemistry : ");
        sub8 = m.nextFloat();
        if (sub8 <= 75) break;
            System.out.println("Obtained marks is too much then total marks");
    }
   

    float obtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 
    + sub8;
    System.out.println("Your obtained Marks is: ");
    System.out.println(obtainedMarks);

    float percentage = (obtainedMarks/totalMarks) * 100;
    System.out.println("Your percentage is:");
    System.out.println(percentage);

   }
}
