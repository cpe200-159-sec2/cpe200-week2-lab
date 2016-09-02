/**
 * Implement grading system.
 */
public class GPA {
    private int credit0=0;
    private  float gradeXcredit=0;
    private float sumGrade = 0;

    public void addGrade(int credit, float grade) {
        /* Your code here */
        gradeXcredit+= credit*grade;
        credit0+=credit;

    }


    public float get() {
        /* Your code here */
        if(credit0==0) return 0;
        else
        return gradeXcredit/credit0;
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
