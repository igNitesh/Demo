package core_java.interface_day10;

public class Student  implements  Comparable <Student>{

    private int marks;

    public Student(){}

    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if(marks > o.marks )
            return 1;
        else if ( marks < o.marks)
            return -1;
        else
            return 0;
    }
    
}
