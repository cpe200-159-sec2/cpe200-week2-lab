/**
 * Implement grading system.
 */
public class GPA {
    float GPA=0;
    float Wp=0;
    public void addGrade(int credit, float grade) {
        GPA += credit*grade;
        Wp += credit;
    }


    public float get() {
        if (Wp==0.0 || GPA==0.0) return 0;

        else  return GPA/Wp;
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
