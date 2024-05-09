import java.util.Scanner;

import shs.School;
import shs.Student;
import shs.Subject;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        stu.setName(sc.nextLine());
        stu.setRoll(sc.nextInt());
        stu.setSchool(new School("xyz school ", "sec24 gurugram"));
        stu.setSubject(new Subject("jvava"));

        System.out.println(stu);


    }
}
