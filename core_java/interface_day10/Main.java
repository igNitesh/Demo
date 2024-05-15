package core_java.interface_day10;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(30);
        Student s1 = new Student(40);

        if(s.compareTo(s1) == 1){
            System.out.println("high");
        } else if ( s.compareTo(s1) == -1){
            System.out.println("less");
        } else{
            System.out.println("equal");
        }
    }
}
