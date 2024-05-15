package core_java.basic_question;

public class ternary_op {
    public static void main(String[] args) {
        
        int marks = 60;
        String grade =  (marks > 90) ? "A" : (marks > 80 && marks < 90) ? "B" : (marks > 70  && marks < 80)? "C" : "D";
        System.out.println(grade);
        
    }
}
