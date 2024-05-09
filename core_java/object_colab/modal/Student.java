package modal;

public class Student{
    private String name;
    private int roll;
    private School school;
    private Subject subject;

    public Student() {}

    public Student(String name, int roll, School school, Subject subject) {
        this.name = name;
        this.roll = roll;
        this.school = school;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + ", school=" + school + ", subject=" + subject + "]";
    }

  
}