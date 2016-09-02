/**
 * Implement grading system.
 */
public class GPA {

    private int totalCredits;
    private float totalGrades;

    public GPA(){
        totalCredits = 0;
        totalGrades = 0;
    }

    public void addGrade(int credit, float grade) {
        totalCredits += credit;
        totalGrades += grade*credit;
    }


    public float get() {
        if (totalCredits!=0) {
            return totalGrades/totalCredits;
        }
        else{
            return 0.0f;
        }
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
