/**
 * Implement grading system.
 */
public class GPA {

    float sumCredit=0,sumGrade=0,gpa=0;

    public void addGrade(int credit, float grade) {
        /* Your code here */
            sumCredit += credit;
            sumGrade += (grade*credit);

    }

    public float get() {
        /* Your code here */

        if (sumCredit==0) {
            gpa=0;
        }
        else
            gpa = sumGrade/sumCredit;

        return gpa;
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
