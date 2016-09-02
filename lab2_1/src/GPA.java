/**
 * Implement grading system.
 */
public class GPA {
    private float sumcredit=0;
    private float sumgrade=0;
    private float sumGPA=0;
    public void addGrade(int credit, float grade) {
        sumcredit+=credit;
        sumgrade+=(credit*grade);
        sumGPA=sumgrade/sumcredit;
    }


    public float get() {

        return sumGPA;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPA is %f\n", gpa.get());
    }
}
