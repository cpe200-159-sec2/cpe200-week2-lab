/**
 * Implement grading system.
 */

public class GPA {
    float GPA=0,AllCredit=0;
    public void addGrade(int credit, float grade) {
        GPA += credit*grade;
        AllCredit+=credit;
    }


    public float get() {
        if(AllCredit == 0){
            return 0;
        }
        else return GPA / AllCredit;
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
