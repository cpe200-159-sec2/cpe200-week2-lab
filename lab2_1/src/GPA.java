/**
 * Implement grading system.
 */
public class GPA {

    float t_grade=0,t_credit=0,sum=0;

    public void addGrade(int credit, float grade) {
        t_grade += grade*credit;
        t_credit += credit;
    }


    public float get() {
        if(t_credit!=0)  sum = t_grade/t_credit;
        else sum = 0;
        return sum;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
