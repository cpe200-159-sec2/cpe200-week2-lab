/**
 * Implement grading system.
 */
public class GPA {
    int sumcredit=0;
    float sumgrade=0;
    float GPA;
    public void addGrade(int credit, float grade) {
        sumgrade+= credit*grade;
        sumcredit+= credit;
    }


    public float get() {
        if(sumcredit==0){
            return 0;
        }
        GPA=sumgrade/sumcredit;

        return GPA;
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
